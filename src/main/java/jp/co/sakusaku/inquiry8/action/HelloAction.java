package jp.co.sakusaku.inquiry8.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.sakusaku.inquiry8.actionForm.HelloForm;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloAction extends Action {

  @Override
  public ActionForward execute(ActionMapping mapping, ActionForm form,
      HttpServletRequest req, HttpServletResponse resp) throws Exception {

    HelloForm helloForm = (HelloForm) form;
    helloForm.now = new Date();
    req.setAttribute("form", helloForm);

    return mapping.findForward("success");
  }
}
