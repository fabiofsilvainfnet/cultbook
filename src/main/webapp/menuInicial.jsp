<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
	<label> Data e Hora: <%= new java.util.Date() %></label>
	</div>
	<div>
		<a href="CultbookServlet?tarefa=cadastrar">Cadastrar</a><br>
		<a href="CultbookServlet?tarefa=buscar">Buscar Livros</a>
	</div>
</body>
</html>