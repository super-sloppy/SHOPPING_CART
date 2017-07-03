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
    <title>订单管理</title>
</head>
<body>
<h1 align="center">订单管理</h1>

<br>
<table align="center" border="1xp">
    <tr>
        <td>订单号</td>
        <td>商品</td>

        <td>数量</td>
        <td>总价</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${orderList}" var="order">
        <tr>
            <td>${order.id}</td>
            <td>${order.good.goodName}</td>
            <td>${order.goodNum}</td>
            <td>${order.totalPrice}</td>
            <td><a href="orderManage/${order.id}/delete">删除</a></td>
        </tr>
    </c:forEach>


</table>

</body>
</html>
