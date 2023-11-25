package br.com.projectgerir.model.bean;

public class Usuario {
	private int id_usuario;
	private String nome_usuario, user, senha;

	public int getId_usuario() {
		return id_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public String getUser() {
		return user;
	}

	public String getSenha() {
		return senha;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
