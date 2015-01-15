package br.com.sistemacurso.exemplos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.JOptionPane;

import br.com.sistemacurso.conexao.ConnectionFactory;
import br.com.sistemacurso.modelo.Aluno;


public class InserirAlunos2 {

	public static void main(String[] args) throws SQLException {
		
		Connection con = ConnectionFactory.getConnection();
		
		String nome = JOptionPane.showInputDialog("nome do aluno:");
		String dataNascimento = JOptionPane.showInputDialog("Data Nascimento (dd/MM/yyyy):");
		
		int dia = Integer.parseInt(dataNascimento.substring(0,2));
		int mes = Integer.parseInt(dataNascimento.substring(3,5));
		int ano = Integer.parseInt(dataNascimento.substring(6,10));
					
		Calendar dataNasc = Calendar.getInstance();
		dataNasc.set(ano, mes, dia);
		
		Aluno aluno = new Aluno(0, nome, dataNasc);
		
		String sql = "insert into tb_aluno values (default,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, aluno.getNomeAluno());
		
		ps.setDate(2, new Date(aluno.getDataNascimento().getTimeInMillis()));
		
		ps.execute();
		con.close();
		
		JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
		

		
	
	}

}
