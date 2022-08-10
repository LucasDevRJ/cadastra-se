package br.com.github.lucasdevrj.cadastrase.formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.cadastrase.cadastro.Cadastro;
import br.com.github.lucasdevrj.cadastrase.cliente.Cliente;
import br.com.github.lucasdevrj.cadastrase.validacao.Validacao;

@WebServlet("/formulario")
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cliente cliente = new Cliente();
		cliente.setNome(req.getParameter("nome"));
		cliente.setSobrenome(req.getParameter("sobrenome"));
		cliente.setEmail(req.getParameter("email"));
		
		Validacao valida = new Validacao();
		valida.validaDados(cliente);
		
		Cadastro cadastro = new Cadastro();
		cadastro.adicionaCadastro(cliente);
		
		PrintWriter escrever = resp.getWriter();
		escrever.println("<html>");
		escrever.println("<body>");
		escrever.print("<h2>Ol� " + cliente.getNome() + "! Muito obrigado.</h2>");
		escrever.println("</body>");
		escrever.println("</html>");
	}
}