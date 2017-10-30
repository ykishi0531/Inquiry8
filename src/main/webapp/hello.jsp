<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HelloStruts</title>
  </head>
  <body>
    <h1>HelloStruts</h1>
    <p>
      <bean:write name="form" property="now" format="yyyy/MM/dd HH:mm" />
    </p>
  </body>
</html:html>
