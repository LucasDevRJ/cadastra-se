package br.com.github.lucasdevrj.cadastrase.cliente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.cadastrase.cadastro.Cadastro;

@WebServlet("/removeCliente")
public class RemoveCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String paramId = req.getParameter("identificador");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		Cadastro cadastro = new Cadastro();
		cadastro.removeCadastro(id);
		
		resp.sendRedirect("listaClientes.jsp");
	}
}
