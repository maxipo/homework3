<%@ page import="java.util.ArrayList" %>
<%@ page import="java.lang.reflect.Array" %><%--
  Created by IntelliJ IDEA.
  User: asher
  Date: 2024/9/22
  Time: 8:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
    <h2>Lucky Number :</h2>
        <table border="1" style="margin: auto; text-align: Left">
		<tbody>
<%--			<tr><td>numbers</td><td>${ numbers }</td></tr>--%>
<%--			<tr><td>電郵</td><td>${ numbers}</td></tr>--%>

		<%
			ArrayList[] returnAList = (ArrayList[]) request.getAttribute("numbers");
			for (ArrayList list : returnAList) { %>
				<tr>
				<td><%= list%></td>
				</tr>
			<%}%>
		</tbody>
	</table>
	<br/>
	<a href="../">Go Home</a>
</body>
</html>
