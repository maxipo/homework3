<%--
  Created by IntelliJ IDEA.
  User: asher
  Date: 2024/9/22
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result Page</title>
    <link href="style/myStyle.css" rel="stylesheet"></link>
</head>
<body>
<h1>You Lose !!</h1>
<% session.invalidate(); %>
<a href="../">Go Home</a>
</body>
</html>
