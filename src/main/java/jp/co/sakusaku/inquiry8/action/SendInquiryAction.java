package jp.co.sakusaku.inquiry8.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.co.sakusaku.inquiry8.actionform.InquiryForm;
import jp.co.sakusaku.inquiry8.dto.InquiryDto;

public class SendInquiryAction extends Action {

	private final String CREATE_INQUIRY_TABLE =
			"CREATE TABLE IF NOT EXISTS inquiry (id INTEGER PRIMARY KEY AUTOINCREMENT, title VARCHAR(32), name VARCHAR(20), tel VARCHAR(13), content TEXT)";
	private final String INSERT_INQUIRY_TABLE =
			"INSERT INTO inquiry (title, name, tel, content) VALUES(?, ?, ?, ?)";
	private final String SELECT_INQUIRY_ALL_RECORD = "SELECT * FROM inquiry";

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
	HttpServletRequest req, HttpServletResponse resp) throws Exception {
		InquiryForm inquiryForm = (InquiryForm)form;
		List<InquiryDto> dtoList = new ArrayList<>();

		// ラムダ式
		Function<ResultSet, InquiryDto> lambdaTest = rs -> {
			InquiryDto dto = new InquiryDto();
			try {
				dto.setId(rs.getInt("id"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setTel(rs.getString("tel"));
				dto.setContent(rs.getString("content"));
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return dto;
		};

		Class.forName("org.sqlite.JDBC");

		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/inquiry.db")) {
			Statement statement = conn.createStatement();
			statement.setQueryTimeout(30);
			statement.executeUpdate(CREATE_INQUIRY_TABLE);

			PreparedStatement ps = conn.prepareStatement(INSERT_INQUIRY_TABLE);
			ps.setString(1, inquiryForm.getTitle());
			ps.setString(2, inquiryForm.getName());
			ps.setString(3, inquiryForm.getTel());
			ps.setString(4, inquiryForm.getContent());
			ps.executeUpdate();

			ResultSet rs = statement.executeQuery(SELECT_INQUIRY_ALL_RECORD);

			while(rs.next()) {
				dtoList.add(lambdaTest.apply(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		req.setAttribute("list", dtoList);

		return mapping.findForward("success");
	}
}
