<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int i = 10;
	%>
	
	
	<div>
	<label> Data e Hora: <%= new Date() %></label><br>
	<label> <%= request.getContentLength()%></label>
	<label><%= i%></label>
	</div>
</body>
</html>