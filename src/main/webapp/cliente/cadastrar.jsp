<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="clienteDTO" scope="request" class="br.edu.infnet.view.dto.ClienteDTO"></jsp:useBean>

	<h1>Cadastro de clientes</h1>
	<hr>
	<form action="CultbookServlet" method="post">
		<input type="hidden" name="id" value="<jsp:getProperty name="clienteDTO" property="cliente.id" />"></input><br>
		<label>login</label><br>
		<input type="text" name="login" value="<jsp:getProperty name="clienteDTO" property="cliente.login" />"></input><br>
		<label>nome</label><br>
		<input type="text" name="nome" value="<jsp:getProperty name="clienteDTO" property="nome" />"></input><br>
		<label>sobrenome</label><br>
		<input type="text" name="sobrenome" value="<jsp:getProperty name="clienteDTO" property="cliente.sobrenome" />"></input><br>
		<label>nome completo</label><br>
		<input type="text" name="nomeCompleto" value="<jsp:getProperty name="clienteDTO" property="nomeCompleto" />"></input><br>
		<label>email</label><br>
		<input type="text" name="email" value="<jsp:getProperty name="clienteDTO" property="cliente.email" />"></input><br>
		<label>endereço</label><br>
		<input type="text" name="endereco" value="<jsp:getProperty name="clienteDTO" property="cliente.endereco" />"></input><br>
		<label>fone</label><br>
		<input type="text" name="fone" value="<jsp:getProperty name="clienteDTO" property="cliente.fone" />"></input><br>
		<label>senha</label><br>
		<input type="text" name="senha" value="<jsp:getProperty name="clienteDTO" property="cliente.senha" />"></input><br>
		<br>
		<input type="submit" value="Cadastrar"><br>
		<a href="../menuInicial.jsp">Voltar</a>
	</form>

</body>
</html>