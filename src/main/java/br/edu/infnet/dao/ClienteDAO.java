package br.edu.infnet.dao;

import br.edu.infnet.model.Cliente;

public class ClienteDAO {

	public Cliente buscar(Integer id) {
		
		Cliente cliente = new Cliente();
		cliente.setId("1");
		cliente.setNome("Fábio");
		cliente.setSobrenome("Ferreira");
		cliente.setLogin("fabio");
		cliente.setEmail("fabio@infnet.edu.br");
		cliente.setEndereco("Rua x, cidade y");
		cliente.setFone("1234576");
		cliente.setSenha("abcd1234");
		
		return cliente;
		
	}
	
}
