package br.com.github.lucasdevrj.cadastrase.cliente;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.cadastrase.cadastro.Cadastro;

@WebServlet("/alteraCliente")
public class AlteraCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String email = request.getParameter("email");
		String identificador = request.getParameter("identificador");

		Integer id = Integer.valueOf(identificador);
		
		Cadastro cadastro = new Cadastro();
		Cliente cliente = cadastro.pesquisaCliente(id);
		cliente.setNome(nome);
		cliente.setSobrenome(sobrenome);
		cliente.setEmail(email);
		
		response.sendRedirect("listaClientes.jsp");
	}

}
