package org.mypackage.hello;

public class NameHandler {

	private String name;
	private String cpf;

	public NameHandler() {
		super();
		name = null;
		cpf = null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
