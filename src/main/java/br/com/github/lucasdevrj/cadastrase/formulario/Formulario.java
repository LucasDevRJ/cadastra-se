package br.com.github.lucasdevrj.cadastrase.formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.cadastrase.cliente.Cliente;

@WebServlet("/Formulario")
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Cliente cliente = new Cliente();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		cliente.setNome(req.getParameter("nome"));
		cliente.setSobrenome(req.getParameter("sobrenome"));
		cliente.setSobrenome(req.getParameter("email"));
		
		if (cliente.getNome().isEmpty() || cliente.getSobrenome().isEmpty() || cliente.getEmail().isEmpty()) {
			throw new NullPointerException("Dados pessoais não informados!");
		} else {
			System.out.println("Cliente " + cliente.getNome() + " " + cliente.getSobrenome() + " está cadastrado com sucesso!");
		}
		
		PrintWriter escrever = resp.getWriter();
		escrever.print("Olá " + cliente.getNome() + "! Muito obrigado.");
	}
}
