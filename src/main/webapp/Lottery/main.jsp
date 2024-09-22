<%--
  Created by IntelliJ IDEA.
  User: asher
  Date: 2024/9/20
  Time: 9:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<%= request.getContextPath() %>/style/myStyle.css" rel="stylesheet"></link>
</head>
<body>
<h1>hello lottery</h1>
    <form action="lotteryController" method="post">
        <table border="0" style="margin: auto; text-align: left">
                <tbody>
                    <tr>
                        <td>組數</td><td><input type="text" name="group" value="${ param.group }"/></td>
                    </tr>
                    <tr>
                        <td>排除</td><td><input type="text" name="exclude" value="${ param.exclude }"/></td>
                    </tr>
                    <td></td>
                        <td>
                            <input type="submit" value="選號" />
                        </td>
                </tbody>
        </table>
    </form>
</body>
</html>
