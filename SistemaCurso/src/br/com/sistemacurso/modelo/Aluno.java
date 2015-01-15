package br.com.sistemacurso.modelo;

import java.util.Calendar;

public class Aluno {
	private int matricula;
	private String nomeAluno;
	private Calendar dataNascimento;
		
	public Aluno(int matricula, String nomeAluno, Calendar dataNascimento) {
		super();
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.dataNascimento = dataNascimento;
	}
	public int getMatricula() {
		return matricula;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	
	
	
	

}
