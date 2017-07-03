<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 锴
  Date: 2017/6/6
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>signUp</title>
</head>
<body>
<h1 align="center">注册</h1>
<form:form role="form"  method="post" modelAttribute="user" >
    <table align="center">
        <tr>
            <td>用户名：</td>
            <td><form:input path="userName" type="text" name="username" /></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><form:input path="userPassword" type="text" name="password" /></td>
        </tr>
        <tr>
            <td>设置问题：</td>
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
            <td><form:button  type="submit" id="signUpBtn">注册</form:button></td>
        </tr>
    </table>
</form:form>
</body>
</html>
