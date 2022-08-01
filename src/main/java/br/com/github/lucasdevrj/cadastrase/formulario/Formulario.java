package br.com.github.lucasdevrj.cadastrase.formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Formulario")
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String sobrenome = req.getParameter("sobrenome");
		String email = req.getParameter("email");
		
		if (nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty()) {
			throw new NullPointerException("Dados pessoais não informados!");
		} else {
			System.out.println("Cliente " + nome + " " + sobrenome + " está cadastrado com sucesso!");
		}
		
		PrintWriter escrever = resp.getWriter();
		escrever.print("Olá " + nome + "! Muito obrigado.");
	}
}
