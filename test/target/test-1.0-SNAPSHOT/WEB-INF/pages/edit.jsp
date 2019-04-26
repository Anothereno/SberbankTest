<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty item.article}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty item.article}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty item.article}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty item.article}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty item.article}">
        <input type="hidden" name="id" value="${item.id}">
    </c:if>
        <label for="article">Article</label>
        <input type="text" name="Article" id="article">
        <label for="name">Name</label>
        <input type="text" name="name" id="name">
        <label for="shelf">Shelf</label>
        <input type="text" name="shelf" id="shelf">
        <label for="box">Box</label>
        <input type="text" name="box" id="box">
    <c:if test="${empty item.article}">
        <input type="submit" value="Add new item">
    </c:if>
    <c:if test="${!empty item.article}">
        <input type="submit" value="Edit item">
    </c:if>
</form>
</body>
</html>