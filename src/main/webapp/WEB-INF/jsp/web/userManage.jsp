<%--
  Created by IntelliJ IDEA.
  User: 锴
  Date: 2017/6/10
  Time: 0:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户管理</title>
</head>
<body>
<h1 align="center">用户管理</h1>

<br>
<table align="center" border="1xp">
    <tr>
        <td>用户名</td>
        <td>密码</td>


        <td>操作</td>
    </tr>

    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.userName}</td>
            <td>${user.userPassword}</td>

            <td><a href="userManage/${user.id}/delete">删除</a></td>
        </tr>
    </c:forEach>


</table>

</body>
</html>
