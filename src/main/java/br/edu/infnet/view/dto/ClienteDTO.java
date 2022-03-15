package br.edu.infnet.view.dto;

import br.edu.infnet.model.Cliente;

public class ClienteDTO {

	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String nomeCompleto( ) {
		return this.cliente.getNome() + " " + this.cliente.getSobrenome();
	}
	
	public String getNome() {
		return cliente.getNome();
	}
	
}
