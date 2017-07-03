<%--
  Created by IntelliJ IDEA.
  User: 锴
  Date: 2017/6/10
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">增加商品</h1>
<form:form role="form"  method="post"  modelAttribute="good" enctype="multipart/form-data">
<div class="container">
    <div class="col-md-4">
        <img <c:choose>
        <c:when test="${good.imageUrl != null}"> src="${good.imageUrl}"</c:when>
        <c:otherwise> src="/static/img/0.JPG"</c:otherwise>
        </c:choose> alt="${good.goodName}封面" class="img-thumbnail img-responsive">
        <br>
        <input type="file" name="multipartFile"/>
        <p class="help-block">请选择商品封面</p>
    </div>

    <div class="col-md-4" style="margin-top: 10px;margin-left: 10px" >
        <p><label>商品名称：</label><form:input path="goodName" type="text" name="goodname"/></p>
        <p><label>商品简介：</label><form:input path="goodIntro" type="text" name="goodintro"/></p>
        <p><label>商品单价：</label><form:input path="goodPrice" type="double" name="goodprice"/></p>


            <button class="btn btn-default btn-success" type="submit">提交</button>

    </div>
</div>
</form:form>
</body>
</html>
