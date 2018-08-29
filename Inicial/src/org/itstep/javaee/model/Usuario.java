package org.itstep.javaee.model;

import java.sql.Date;

public class Usuario {

	private String nome;
	private String cpf;
	private Date validade;

	public Usuario() {
		super();
	}
	public Usuario(String nome, String cpf, Date validade) {
		this.nome = nome;
		this.cpf = cpf;
		this.validade = validade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", validade=" + validade + "]";
	}
}
