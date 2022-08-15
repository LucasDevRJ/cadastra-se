package br.com.github.lucasdevrj.cadastrase.cadastro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.github.lucasdevrj.cadastrase.cliente.Cliente;

public class Cadastro {

	private static Integer chaveSequencial = 1;
	private static List<Cliente> clientes = new ArrayList<>();
	
	public static Integer getChaveSequencial() {
		return chaveSequencial;
	}
	
	public static void setChaveSequencial(Integer chaveSequencial) {
		Cadastro.chaveSequencial = chaveSequencial;
	}
	
	public void adicionaCadastro(Cliente cliente) {
		cliente.setIdentificador(Cadastro.chaveSequencial++);
		Cadastro.clientes.add(cliente);
	}
	
	public void removeCadastro(Integer id) {
		Iterator<Cliente> it = clientes.iterator();
		
		while (it.hasNext()) {
			Cliente cl = it.next();
			
			if (cl.getIdentificador() == id) {
				it.remove();
			}
		}
	}
	
	public List<Cliente> getClientes() {
		return Cadastro.clientes;
	}

	public Cliente pesquisaCliente(Integer id) {
		for (Cliente cliente : clientes) {
			if (cliente.getIdentificador() == id) {
				
			}
		}
		return null;
	}
}
