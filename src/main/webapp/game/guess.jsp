<%@ page import="service.GuessGame" %><%--
  Created by IntelliJ IDEA.
  User: asher
  Date: 2024/9/22
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Page</title>
</head>
<body>
<h1>Guess 1~10: </h1>

<% GuessGame guessGameGet = (GuessGame) session.getAttribute("guessTimes"); %>
<h2>剩餘的猜測次數: <%= guessGameGet.getRemains()%></h2>

<form action="gameController" method="post">
        <table border="0" style="margin: auto; text-align: left">
                <tbody>
                    <tr><td><input type="number" name="number" value="${ param.number }"/>
                            <input type="submit" value="guess"/></td>
                </tbody>
        </table>
    </form>

</body>
</html>
