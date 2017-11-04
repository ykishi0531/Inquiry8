package jp.co.sakusaku.inquiry8.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.co.sakusaku.inquiry8.actionform.InquiryForm;

public class InquiryAction extends Action {

	  @Override
	  public ActionForward execute(ActionMapping mapping, ActionForm form,
	      HttpServletRequest req, HttpServletResponse resp) throws Exception {
		  InquiryForm inquiryForm = (InquiryForm)form;

		  req.setAttribute("form", inquiryForm);

		  return mapping.findForward("success");
	  }
}
