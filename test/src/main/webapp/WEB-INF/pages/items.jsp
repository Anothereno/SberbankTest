<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ITEMS</title>
</head>
<body>

<h1 style="text-align: center">Формирование заданий для выдачи товара</h1>
<table align="center" border="2px solid grey" style="width: 60%">
    <tr>
        <th>Article</th>
        <th>Name</th>
        <th>Shelf</th>
        <th>Box</th>
        <th>Action</th>
    </tr>
    <c:forEach var="item" items="${itemList}">
        <tr>
            <td>${item.article}</td>
            <td>${item.name}</td>
            <td>${item.shelf}</td>
            <td>${item.box}</td>
            <td>
                <a href="/edit/${item.id}">edit</a>
                <a href="/delete/${item.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2 style="margin-left: 20%">Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}" style="margin-left: 20%">Add new item</a>
</body>
</html>
