package br.com.github.lucasdevrj.cadastrase.formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.cadastrase.cliente.Cliente;
import br.com.github.lucasdevrj.cadastrase.validacao.Validacao;

@WebServlet("/formulario")
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Cliente cliente = new Cliente();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		cliente.setNome(req.getParameter("nome"));
		cliente.setSobrenome(req.getParameter("sobrenome"));
		cliente.setEmail(req.getParameter("email"));
		
		Validacao valida = new Validacao();
		valida.validaDados(cliente);
		
		PrintWriter escrever = resp.getWriter();
		escrever.print("Ol� " + cliente.getNome() + "! Muito obrigado.");
	}
}
