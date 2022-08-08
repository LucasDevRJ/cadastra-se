package br.com.github.lucasdevrj.cadastrase.cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.github.lucasdevrj.cadastrase.cliente.Cliente;

public class Cadastro {

	private static List<Cliente> clientes = new ArrayList<Cliente>();
	
	public Cadastro(Cliente cliente) {
		Cadastro.clientes.add(cliente);
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
}
