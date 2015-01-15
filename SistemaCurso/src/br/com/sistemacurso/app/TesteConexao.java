package br.com.sistemacurso.app;
import java.sql.SQLException;

import br.com.sistemacurso.conexao.ConnectionFactory;

public class TesteConexao {
	public static void main(String[]args)throws SQLException{
		ConnectionFactory.getConnection();
		
		System.out.println("Conectado ao banco");
	}

}
