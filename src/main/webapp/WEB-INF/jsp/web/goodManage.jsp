<%--
  Created by IntelliJ IDEA.
  User: 锴
  Date: 2017/6/10
  Time: 0:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品管理</title>
</head>
<body>
<h1 align="center">商品管理</h1>

<br>
<table align="center" border="1xp">
    <tr>
        <td>商品名称</td>
        <td>单价</td>

        <td>商品简介</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${goodList}" var="good">
        <tr>
            <td>${good.goodName}</td>
            <td>${good.goodPrice}</td>
            <td>${good.goodIntro}</td>
            <td><a href="goodManage/${good.id}/delete">删除</a></td>
        </tr>
    </c:forEach>


</table>
<p align="center"><a href="goodManage/goodAdd"><button>增加商品</button></a></p>
</body>
</html>

