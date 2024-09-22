<%--
  Created by IntelliJ IDEA.
  User: asher
  Date: 2024/9/20
  Time: 9:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link href="style/myStyle.css" rel="stylesheet"></link>
</head>
<body>
	<h1>Welcome To My Java EE Playground!!</h1>
	<p>Current Time is　: <%= SimpleDateFormat.getInstance().format(new Date()) %></p>
	<p>
	<a href="Lottery/main.jsp">Lottery</a>
	<a href="game/gameController">guess game</a>
	</p>
</body>
</html>
