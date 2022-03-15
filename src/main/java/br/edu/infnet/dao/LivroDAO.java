package br.edu.infnet.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.model.Livro;

public class LivroDAO {

	
	public List<Livro> buscarTodos() {
		
		List<Livro> livros = new ArrayList<>();
		
		Livro livro = new Livro();
		livro.setIsbn("123456");
		livro.setTitulo("Um título qualquer");
		livro.setDescricao("Uma descricao qualquer");
		livro.setAutor("Um autor qualquer");
		livro.setEstoque(12);
		livro.setPreco(52.50);
		livro.setFigura("??????");
		
		livros.add(livro);
		
		livro = new Livro();
		livro.setIsbn("098764");
		livro.setTitulo("Outro título qualquer");
		livro.setDescricao("Outra descricao qualquer");
		livro.setAutor("Outro autor qualquer");
		livro.setEstoque(5);
		livro.setPreco(8.70);
		livro.setFigura("??????");
		
		livros.add(livro);
		
		return livros;
	}
	
}
