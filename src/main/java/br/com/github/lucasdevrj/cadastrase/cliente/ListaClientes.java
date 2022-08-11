package br.com.github.lucasdevrj.cadastrase.cliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
		List<Cliente> lista = cadastro.getClientes();
		
	}
}
