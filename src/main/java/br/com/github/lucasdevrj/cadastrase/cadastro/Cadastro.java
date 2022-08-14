package br.com.github.lucasdevrj.cadastrase.cadastro;

import java.util.ArrayList;
import java.util.List;

import br.com.github.lucasdevrj.cadastrase.cliente.Cliente;

public class Cadastro {

	private Integer identificador;
	private static List<Cliente> clientes = new ArrayList<>();
	
	public Integer getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	
	public void adicionaCadastro(Cliente cliente) {
		Cadastro.clientes.add(cliente);
	}
	
	public List<Cliente> getClientes() {
		return Cadastro.clientes;
	}
}
