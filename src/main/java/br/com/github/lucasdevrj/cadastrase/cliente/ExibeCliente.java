package br.com.github.lucasdevrj.cadastrase.cliente;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.cadastrase.cadastro.Cadastro;

@WebServlet("/exibeCliente")
public class ExibeCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String identificador = request.getParameter("identificador");
		Integer idt = Integer.valueOf(identificador);
		
		Cadastro cadastro = new Cadastro();
		Cliente cliente = cadastro.pesquisaCliente(idt);
		
		System.out.println(cliente.getNome());
		
		RequestDispatcher rd = request.getRequestDispatcher("/alteraCliente.jsp");
		rd.forward(request, response);
	}
}
