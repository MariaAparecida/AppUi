package br.com.sistemacurso.exemplos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.sistemacurso.conexao.ConnectionFactory;
import br.com.sistemacurso.modelo.Aluno;

public class InserirAlunos {

	public static void main(String[] args) throws SQLException {
		
		Calendar dataNasc = Calendar.getInstance();
		dataNasc.set(1992, 10, 24);
		
		Aluno aluno = new Aluno (0,"Joaquim Pereira", dataNasc);
		
		Connection conn = ConnectionFactory.getConnection();
		
		String sql = "insert into tb_aluno values (default,?,?)";
		
		PreparedStatement stm = conn.prepareStatement(sql);
		stm.setString(1, aluno.getNomeAluno().trim());
		stm.setDate(2, new Date(aluno.getDataNascimento().getTimeInMillis()));
		stm.execute();
		conn.close();
		
		System.out.println("Aluno cadastrado com sucesso");
	}

}
