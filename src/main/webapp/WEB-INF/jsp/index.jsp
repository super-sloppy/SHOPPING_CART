<%--
  Created by IntelliJ IDEA.
  User: 锴
  Date: 2017/6/4
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<h1 align="center">用户登陆</h1>
<form:form role="form"  method="post" modelAttribute="TUser">
    <table align="center">
        <tr>
            <td>用户名：</td>
            <td>
                <form:input  type="text" name="username" id="username"  path="userName"/>
            </td>
        </tr>
        <td>密码：</td>
        <td>
            <form:input type="text" name="password" id="password" path="userPassword"/>
        </td>
        <tr>
            <td>&nbsp;</td>
            <td><form:button  type="submit" id="submitBtn">登录</form:button></td>
        </tr>

        <tr>
            <td>&nbsp;</td>
            <td> <a href="/web/signUp">注册</a></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td> <a href="/web/resetPwd">忘记密码</a></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td><a href="/web/tourist">游客登陆</a></td>

        </tr>
    </table>
</form:form>




</body>
</html>
