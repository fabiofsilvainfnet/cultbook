package br.edu.infnet.service;

import java.util.List;

import br.edu.infnet.dao.LivroDAO;
import br.edu.infnet.model.Livro;

public class LivroService {

	public List<Livro> buscarTodos() {
		LivroDAO dao = new LivroDAO();
		return dao.buscarTodos(); 
	}
	
	
}
