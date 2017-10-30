package jp.co.sakusaku.inquiry8.actionForm;

import java.util.Date;

import org.apache.struts.action.ActionForm;

public class HelloForm extends ActionForm {

  public Date now;

  public Date getNow() {
    return now;
  }

  public void setNow(Date now) {
    this.now = now;
  }
}
