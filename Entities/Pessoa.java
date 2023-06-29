package Entities;

public class Pessoa {

	private Double altura;
	private char sexo;

	public Pessoa() {

	}

	public Pessoa(Double altura, char sexo) {
		this.altura = altura;
		this.sexo = sexo;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
	
}

