<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>お問い合わせ一覧</title>
<style type="text/css">
body {
    font-size: 12px;
}

table {
    font-size: 12px;
    border-width: 0;
    border-style: none;
    border-color: #fff;
    border-spacing: 0;
    border-top: 1px solid #ccc;
    border-left: 1px solid #ccc;
}

th {
    text-align: left;
    vertical-align: top;
    border-right: 1px solid #ccc;
    border-bottom: 1px solid #ccc;
    background-color: #eee;
    padding: 5px;
}

td {
    text-align: left;
    vertical-align: top;
    border-right: 1px solid #ccc;
    border-bottom: 1px solid #ccc;
    padding: 5px;
}

input.title, textarea.content {
    width: 20em;
}

td.center {
    text-align: center;
}
</style>
</head>
<body>
<h1>お問い合わせ一覧</h1>
<table>
<tr>
	<th>ID</th>
	<th>題名</th>
	<th>名前</th>
	<th>電話番号</th>
	<th>内容</th>
</tr>
<logic:iterate id="dto" name="list">
	<tr>
		<td><bean:write name="dto" property="id" /></td>
		<td><bean:write name="dto" property="title" /></td>
		<td><bean:write name="dto" property="name" /></td>
		<td><bean:write name="dto" property="tel" /></td>
		<td><bean:write name="dto" property="content" /></td>
	</tr>
</logic:iterate>
</table>
</body>
</html:html>
