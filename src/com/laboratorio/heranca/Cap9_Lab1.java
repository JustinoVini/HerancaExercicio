package com.laboratorio.heranca;

public class Cap9_Lab1 {

	public static void main(String[] args) {
		Pessoa claudia = new Aluno("Claudia", 22, 'F', "Administracao", 799, "Administracao", 415679912, "12/08/1990");
		Pessoa manuel = new Aluno("Manuel", 19, 'M', "Ciencias da computacao", 1099, "Ciencias da computacao", 521234567, "15/06/1993");
		Pessoa rafael = new Professor("Rafael", 38, 'M', 261454789, "Portugues", 2500, "12/08/1990");
		
		rafael.falar("Manuel?");
		manuel.falar("Presente!");
		rafael.falar("Claudia?");
		claudia.falar("Presente!");
		
		rafael.exibirDados();
		claudia.exibirDados();
		manuel.exibirDados();

	}

}
