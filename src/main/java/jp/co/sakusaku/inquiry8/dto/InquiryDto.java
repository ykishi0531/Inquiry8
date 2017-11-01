package jp.co.sakusaku.inquiry8.dto;

public class InquiryDto {
	
	/** id */
	private int id;
	
	/** title */
	private String title;
	
	/** name */
	private String name;
	
	/** tel */
	private String tel;
	
	/** content */
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
