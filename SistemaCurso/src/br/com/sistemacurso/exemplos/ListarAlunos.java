package br.com.sistemacurso.exemplos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.sistemacurso.conexao.ConnectionFactory;
import br.com.sistemacurso.modelo.Aluno;

public class ListarAlunos {

	public static void main(String[] args) throws SQLException{
		
		Connection con = ConnectionFactory.getConnection();
		String sql = "select * from tb_aluno";
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()){
			Calendar dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(rs.getDate("data_nascimento"));
			
			Aluno aluno = new Aluno (rs.getInt("matricula"),rs.getString("nome_aluno"),dataNascimento);
			
			alunos.add(aluno);
		}
		
		rs.close();
		ps.close();
		con.close();
		
		for(Aluno aluno : alunos){
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println(aluno.getMatricula()+"-"+aluno.getNomeAluno()+"-"+sdf.format(aluno.getDataNascimento().getTime()));
		}
	}
}
