package br.edu.infnet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.dao.ClienteDAO;
import br.edu.infnet.model.Cliente;
import br.edu.infnet.model.Livro;
import br.edu.infnet.service.LivroService;
import br.edu.infnet.view.dto.ClienteDTO;

/**
 * Servlet implementation class CultbookServlet
 */
@WebServlet("/CultbookServlet")
public class CultbookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CultbookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tarefa = request.getParameter("tarefa");
		
		if (tarefa.equals("cadastrar")) {
			
			Integer id = 0;
			
			if (request.getParameter("id") != null)
				id = Integer.valueOf(request.getParameter("id"));
			
			if (id == 1) {
				ClienteDAO dao = new ClienteDAO();
				ClienteDTO cliente = ClienteDTO.toDTO(dao.buscar(id), null);
				request.setAttribute("cliente", cliente);	
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("cliente/cadastrar.jsp");
			dispatcher.forward(request, response);
		}
		else if (tarefa.equals("buscar")) {
			LivroService service = new LivroService();		
			List<Livro> livros = service.buscarTodos();
			request.setAttribute("livros", livros);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("ListarLivrosServlet");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("menuInicial.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processarRequisicao(request, response);
	}
	
	private void processarRequisicao(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String login = request.getParameter("login");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		String fone = request.getParameter("fone");
		String senha = request.getParameter("senha");
		
		Cliente cliente = new Cliente();
		cliente.setLogin(login);
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setEndereco(endereco);
		cliente.setFone(fone);
		cliente.setSenha(senha);
		
		List<String> erros = validarParametros(login, senha, nome, email);
		if (erros.size() > 0) {
			ClienteDTO dto = ClienteDTO.toDTO(cliente, erros.toString());
			request.setAttribute("clienteDTO", dto);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("cliente/cadastrar.jsp");
			try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			try (PrintWriter writer = response.getWriter()) {
				writer.println("Cliente de nome " + nome + " cadastrado com sucesso.");
			}
			
		}
	}
	
	private List<String> validarParametros(String login, String senha, String nome, String email) {
		
		List<String> erros = new ArrayList<String>();
		
		if (login == null || login.trim().equals("")) {
			erros.add("O login é obrigatório");
		}
		
		if (senha== null || senha.trim().equals("")) {
			erros.add("A senha é obrigatória");
		}
		
		if (login.length() < 8 ) {
			erros.add("Login deve ter ao menos 8 caracteres");
		}
		
		if (nome.trim().split(" ").length < 2 ) {
			erros.add("nome deve conter pelo menos duas palavras");
		}
		
		return erros;
	}

}
