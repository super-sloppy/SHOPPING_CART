<%--
  Created by IntelliJ IDEA.
  User: 锴
  Date: 2017/6/9
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>resetPwd</title>
</head>
<body>
<h1 align="center">找回密码</h1>
<br>
<form:form role="form"  method="post" modelAttribute="user" >
    <table align="center">
        <tr>
            <td>用户名：</td>
            <td><form:input path="userName" type="text" name="username" /></td>
        </tr>
        <tr>
            <td>新密码：</td>
            <td><form:input path="userPassword" type="text" name="password" /></td>
        </tr>
        <tr>
            <td>问题：</td>
            <td>
                <form:select path="userQusetion" name="userqusetion" id="userqusetion">
                    <form:option value="1">你的出生日期是？</form:option>
                    <form:option value="2">你的小学老师姓氏？</form:option>
                    <form:option value="3">你的家乡在哪里？</form:option>
                </form:select>
            </td>

        </tr>
        <tr>
            <td>回答：</td>
            <td><form:input path="userAnswer" type="text" name="useranswer" id="useranswer"/></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td><form:button  type="submit" id="resetBtn">确定</form:button></td>
        </tr>
    </table>
</form:form>
</body>
</html>
