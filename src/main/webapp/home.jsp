<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>home</h1>
<%
String passw=(String)session.getAttribute("pass_key");
%>
<h3><%=passw %></h3>
<a href="about.jsp">profile</a>
<a href="home.jsp">home</a>
</body>
</html>