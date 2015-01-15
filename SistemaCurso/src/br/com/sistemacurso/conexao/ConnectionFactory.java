package br.com.sistemacurso.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final String usuario = "postgres";
	private static final String senha = "102030";
	private static final String url = "jdbc:postgresql://localhost:5432/curso";
	public static Connection getConnection() throws SQLException{
		Connection conexao = DriverManager.getConnection(url,usuario,senha);
		return conexao;
		
	}

}
