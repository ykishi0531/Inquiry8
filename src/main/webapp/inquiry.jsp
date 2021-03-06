<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>お問い合わせフォーム</title>
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
    <h1>お問い合わせフォーム</h1>
    <html:form action="/inquiry" method="post">
        <table>
            <tr>
                <th>題名</th>
                <td>
                    <html:text property="title" maxlength="32" size="32" styleClass="title"/>
                    <html:errors property="title" />
                </td>
            </tr>
            <tr>
                <th>名前</th>
                <td>
                    <html:text property="name" maxlength="20" size="32" styleClass="title"/>
                    <html:errors property="name" />
                </td>
            </tr>
            <tr>
                <th>電話番号</th>
                <td>
                    <html:text property="tel" maxlength="13" size="32" styleClass="title"/>
                    <html:errors property="tel" />
                </td>
            </tr>
            <tr>
                <th>お問い合わせ内容</th>
                <td>
                    <html:textarea property="content" cols="32" rows="8" styleClass="content" />
                    <html:errors property="content" />
                </td>
            </tr>
            <tr>
                <td colspan="2" class="center"><input type="submit" value="確認"></td>
            </tr>
        </table>
    </html:form>
</body>
</html:html>
