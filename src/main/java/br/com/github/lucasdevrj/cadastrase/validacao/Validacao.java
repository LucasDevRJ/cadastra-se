package br.com.github.lucasdevrj.cadastrase.validacao;

import br.com.github.lucasdevrj.cadastrase.cliente.Cliente;

public class Validacao {

	public void validaDados(Cliente cliente) {
		if (cliente.getNome().isEmpty() || cliente.getSobrenome().isEmpty() || cliente.getEmail().isEmpty()) {
			throw new NullPointerException("Insira todos os dados!");
		}
	}
}
