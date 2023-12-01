package model.Connector;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	private String host;
	private String database;
	private String user;
	private String password;

	public Connector() {
		this.host = "da_java.mysql.dbaas.com.br";
		this.database = "da_java";
		this.user = "da_java";
		this.password = "Tecnicas*2023@";
	}

	public Connection getConnector() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://" + this.host + "/" + this.database + "?verifyServerCertificate=false&useSSL=true";
		try {
			return DriverManager.getConnection(url, this.user, this.password);
		} catch (SQLException ex) {
			System.out.println("Conexão com MYSQL não realizada");
			ex.printStackTrace();
		}
		return null;
	}
}
