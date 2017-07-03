<%--
  Created by IntelliJ IDEA.
  User: 锴
  Date: 2017/6/6
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品一览</title>
</head>
<body>
<h1 align="center">商品一览</h1>
<p align="center"><a href="userPage/myCart"><button>我的购物车</button></a>&nbsp;<a href="userPage/myOrder"><button>我的订单</button></a></p>
<br>
<table align="center" border="1xp">
    <tr>
        <td>商品名称</td>
        <td>单价</td>
        <td>价格</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${goodList}" var="good">
        <tr>
          <td><a href="userPage/${good.id}/information">${good.goodName}</a></td>
          <td>${good.goodIntro}</td>
          <td>${good.goodPrice}</td>
            <td><a href="userPage/${good.id}/toCart">加入购物车</a></td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
