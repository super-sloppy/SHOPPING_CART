<%--
  Created by IntelliJ IDEA.
  User: 锴
  Date: 2017/6/10
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>我的购物车</title>
</head>
<body>

<h1 align="center">我的购物车</h1>
<p align="center"><a href="/web/${userId}/userPage/myOrder"><button>我的订单</button></a></p>
<br>
<table align="center" border="1xp">
    <tr>
        <td>商品名称</td>
        <td>数量</td>

        <td>操作</td>
    </tr>

    <c:forEach items="${cartList}" var="cart">
        <tr>
            <td>${cart.good.goodName}</td>
            <form:form  method="post" modelAttribute="order" action="/web/${cart.buyerId}/userPage/Cart">
            <td>
                <input  type="number"  name="goodnum" id="goodnum"  />
                <input type="hidden" name="orderid" value="${cart.id}"/>
                <input type="hidden" name="buyerid" value="${cart.buyerId}"/>
            </td>

            <td><button type="submit">确认下单</button></td>
        </tr>
    </form:form>
    </c:forEach>


</table>
</body>
</html>