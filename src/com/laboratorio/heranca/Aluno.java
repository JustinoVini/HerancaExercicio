package com.laboratorio.heranca;

public class Aluno extends Pessoa {
	private float mensalidade;
	private String curso;

	public Aluno(String nome, int idade, char genero, String disciplina,
			float mensalidade, String curso, int numeroRg, String dataNasc) {
		super(nome, idade, genero, new Rg(numeroRg, dataNasc));
		this.curso = curso;
		this.mensalidade = mensalidade;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void falar(String fala) {
		System.out.println(getNome() + ": " + fala);
	}

	public void exibirDados() {
		System.out.println();
		System.out.println("----- Aluno: " + getNome() + "-----");
		System.out.println("De Idade: " + getIdade());
		System.out.println("Do genero: " + getGenero());
		System.out.println("Que cursa: " + getCurso());
		System.out.println("Que paga a mensalidade: " + getMensalidade());
		System.out.println("Com numero de RG: " + getRg().getNumero());
		System.out.println("E data de nascimento: " + getRg().getDataNasc());
	}

}
