package br.edu.infnet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.Livro;

/**
 * Servlet implementation class ListarLivrosServlet
 */
@WebServlet("/ListarLivrosServlet")
public class ListarLivrosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		@SuppressWarnings("unchecked")
		List<Livro> livros = ((List<Livro>) request.getAttribute("livros"));
		
		try (PrintWriter writer = response.getWriter()){
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<title>Lista de Livros</title>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<h1>Lista de Livros</h1>");
			writer.println("<hr>");
			livros.forEach(livro -> writer.println("<p>" + livro + "</p>"));
			writer.println("</body>");
			writer.println("</html>");
		}
	
	
	}

}
