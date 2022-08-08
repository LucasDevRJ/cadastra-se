package br.com.github.lucasdevrj.cadastrase.cliente;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.cadastrase.cadastro.Cadastro;

@WebServlet("/clientes-cadastrados")
public class ListaClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cadastro cadastro = new Cadastro();
		
		PrintWriter escreve = response.getWriter();
		
		escreve.println("<html>");
		escreve.println("<body>");
		escreve.println("<ul>");
		
		for (int i = 0; i < cadastro.getClientes().size(); i++) {
			String nome = cadastro.getClientes().get(i).getNome();
			String sobrenome = cadastro.getClientes().get(i).getSobrenome();
			String email = cadastro.getClientes().get(i).getEmail();
			
			escreve.println("<li>");
			escreve.println("<p>Nome: " + nome + "</p>");
			escreve.println("<p>Sobrenome: " + sobrenome + "</p>");
			escreve.println("<p>E-mail: " + email + "</p>");
			escreve.println("</li>");
		}
		
		escreve.println("</ul>");
		escreve.println("</body>");
		escreve.println("</html>");
	}
}
