<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--      <h1>${student }</h1> --%>
     <h2>Name   is :${student.name }</h2>
     <h2>id     is :${student.id}</h2>
     <h2>Date   is :${student.date}</h2>
     <h2>Cource is :${student.cources }</h2>
     <h2>Gender is :${student.gender }</h2>
     <h2>Type   is :${student.type}</h2>
     <hr>
     <h2>Address Street  is :${student.address.street}</h2>
     <h2>Address city    is :${student.address.city}</h2>
</body>
</html>