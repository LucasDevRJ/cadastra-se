package br.com.github.lucasdevrj.cadastrase.cliente;

public class Cliente {

	private static Integer identificador;
	private String nome;
	private String sobrenome;
	private String email;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void setIdentificador(Integer identificador) {
		Cliente.identificador = identificador;
	}
	
	public static Integer getIdentificador() {
		return identificador;
	}
}
