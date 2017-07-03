<%--
  Created by IntelliJ IDEA.
  User: 锴
  Date: 2017/6/8
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <title>商品详情</title>
</head>
<body>
<h1 align="center">商品详情</h1>
<div class="container">
    <div class="col-md-4">
        <img<c:choose>
        <c:when test="${good.imageUrl != null}"> src="${good.imageUrl}"</c:when>
        <c:otherwise> src="/static/img/0.JPG"</c:otherwise>
        </c:choose> alt="${good.goodName}封面" class="img-thumbnail img-responsive">
    </div>
    <div class="col-md-1"></div>
    <div class="col-md-4" style="margin-top: 10px;margin-left: 10px" >
        <p><label>商品名称：</label><span>${good.goodName}</span></p>
        <p><label>商品简介：</label><span>${good.goodIntro}</span></p>
        <p><label>商品单价：</label><span>${good.goodPrice}</span></p>


    </div>
</div>
</body>
</html>
<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>