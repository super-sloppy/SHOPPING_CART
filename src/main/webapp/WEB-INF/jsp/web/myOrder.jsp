<%--
  Created by IntelliJ IDEA.
  User: 锴
  Date: 2017/6/10
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>我的订单</title>
</head>
<body>

    <h1 align="center">我的订单</h1>
    <%--<p align="center"><a href="/myCart"><button>我的购物车</button></a></p>--%>

    <br>
    <table align="center" border="1xp">
        <tr>
            <td>商品名称</td>
            <td>数量</td>
            <td>总价</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${orderList}" var="order">
            <tr>
                <td>${order.good.goodName}</td>
                <td>${order.goodNum}</td>
                <td>${order.totalPrice}</td>
                <td><a href="/web/${userId}/userPage/myOrder/${order.id}/delete">取消订单</a></td>
            </tr>

        </c:forEach>


    </table></form>
</body>
</html>
