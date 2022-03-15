package br.edu.infnet.view.dto;

import br.edu.infnet.model.Cliente;

public class ClienteDTO {

	private Cliente cliente;

	public ClienteDTO() {
		super();
	}
	
	private ClienteDTO(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getNomeCompleto() {
		return this.cliente.getNome() + " " + this.cliente.getSobrenome();
	}
	
	public String getNome() {
		return cliente.getNome();
	}
	
	public String getId() {
		return cliente.getId();
	}

	public String getSobrenome() {
		return cliente.getSobrenome();
	}

	public String getLogin() {
		return cliente.getLogin();
	}

	public String getSenha() {
		return cliente.getSenha();
	}

	public String getFone() {
		return cliente.getFone();
	}

	public String getEndereco() {
		return cliente.getEndereco();
	}

	public String getEmail() {
		return cliente.getEmail();
	}
	
	public static ClienteDTO toDTO(Cliente cliente) {
		ClienteDTO dto = new ClienteDTO(cliente);
		return dto;
	}
	
	public static Cliente toModel(ClienteDTO dto) {
		Cliente cliente = dto.getCliente();
		return cliente;
	}
	

}
