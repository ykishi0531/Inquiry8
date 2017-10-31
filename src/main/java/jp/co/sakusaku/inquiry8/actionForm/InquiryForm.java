package jp.co.sakusaku.inquiry8.actionForm;

import org.apache.struts.validator.ValidatorForm;

public class InquiryForm extends ValidatorForm  {

	/** 題名 */
	private String title;
	
	/** 内容 */
	private String content;
	
	/** 名前 */
	private String name;
	
	/** 電話番号 */
	private String tel;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
