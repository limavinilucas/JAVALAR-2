package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import controller.PlanetaConnection;
import controller.Planets;
import model.Connector.Connector;

public class PLANETAdao {

	public ArrayList<PlanetaConnection> selecaoDePlanetas() throws ClassNotFoundException {
		ArrayList<PlanetaConnection> listaPlanetaria = new ArrayList<PlanetaConnection>();

		try {

			Connection connectDB = new Connector().getConnector();

			String query = "SELECT * FROM javalar";
			ResultSet data = connectDB.prepareStatement(query).executeQuery();

			while (data.next()) {

				String nome = data.getString("");
				int matricula = data.getInt(0);
				String nome_arquivo = data.getString("");

				int bug_python = data.getInt(0);
				int bug_javascript = data.getInt(0);
				int bug_ruby = data.getInt(0);
				int bug_php = data.getInt(0);
				int bug_csharp = data.getInt(0);
				int bug_cmais = data.getInt(0);
				int bug_c = data.getInt(0);

				int dev_python = data.getInt(0);
				int dev_javascript = data.getInt(0);
				int dev_ruby = data.getInt(0);
				int dev_php = data.getInt(0);
				int dev_csharp = data.getInt(0);
				int dev_cmais = data.getInt(0);
				int dev_c = data.getInt(0);

				int v_python = data.getInt(0);
				int v_javascript = data.getInt(0);
				int v_ruby = data.getInt(0);
				int v_php = data.getInt(0);
				int v_csharp = data.getInt(0);
				int v_cmais = data.getInt(0);
				int v_c = data.getInt(0);

				int d_python = data.getInt(0);
				int d_javascript = data.getInt(0);
				int d_ruby = data.getInt(0);
				int d_php = data.getInt(0);
				int d_csharp = data.getInt(0);
				int d_cmais = data.getInt(0);
				int d_c = data.getInt(0);

				int a_python = data.getInt(0);
				int a_javascript = data.getInt(0);
				int a_ruby = data.getInt(0);
				int a_php = data.getInt(0);
				int a_csharp = data.getInt(0);
				int a_cmais = data.getInt(0);
				int a_c = data.getInt(0);

				int bug_q1 = data.getInt(0);
				int bug_q2 = data.getInt(0);
				int bug_q3 = data.getInt(0);
				int bug_q4 = data.getInt(0);

				int devs_q1 = data.getInt(0);
				int devs_q2 = data.getInt(0);
				int devs_q3 = data.getInt(0);
				int devs_q4 = data.getInt(0);

				PlanetaConnection planetaConector = new PlanetaConnection(nome, matricula, nome_arquivo, bug_python,
						bug_javascript, bug_ruby, bug_php, bug_csharp, bug_cmais, bug_c, dev_python, dev_javascript,
						dev_ruby, dev_php, dev_csharp, dev_cmais, dev_c, v_python, v_javascript, v_ruby, v_php,
						v_csharp, v_cmais, v_c, d_python, d_javascript, d_ruby, d_php, d_csharp, d_cmais, d_c, a_python,
						a_javascript, a_ruby, a_php, a_csharp, a_cmais, a_c, bug_q1, bug_q2, bug_q3, bug_q4, devs_q1,
						devs_q2, devs_q3, devs_q4);

				listaPlanetaria.add(planetaConector);
			}

			connectDB.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaPlanetaria;

	}

	public void registroDePlanetas(PlanetaConnection planetaTeste) throws ClassNotFoundException {

		String sql = "INSERT INTO javalar (nome, matricula, nome_arquivo, bug_python, bug_javascript, bug_ruby, bug_php, bug_csharp, bug_cmais, bug_c, dev_python, dev_javascript, dev_ruby, dev_php, dev_csharp, dev_cmais, dev_c, v_python, v_javascript, v_ruby, v_php, v_csharp, v_cmais, v_c, d_python, d_javascript, d_ruby, d_php, d_csharp, d_cmais, d_c, a_python, a_javascript, a_ruby, a_php, a_csharp, a_cmais, a_c, bug_q1, bug_q2, bug_q3, bug_q4, dev_q1, dev_q2, dev_q3, dev_q4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {

			Connection connectorDB = new Connector().getConnector();
			PreparedStatement psStatement = connectorDB.prepareStatement(sql);

			psStatement.setString(1, planetaTeste.getNome());
			psStatement.setInt(2, planetaTeste.getMatricula());
			psStatement.setString(3, planetaTeste.getNome_arquivo());

			psStatement.setInt(4, planetaTeste.getBug_python());
			psStatement.setInt(5, planetaTeste.getBug_javascript());
			psStatement.setInt(6, planetaTeste.getBug_ruby());
			psStatement.setInt(7, planetaTeste.getBug_php());
			psStatement.setInt(8, planetaTeste.getBug_csharp());
			psStatement.setInt(9, planetaTeste.getBug_cmais());
			psStatement.setInt(10, planetaTeste.getBug_c());

			psStatement.setInt(11, planetaTeste.getDev_python());
			psStatement.setInt(12, planetaTeste.getDev_javascript());
			psStatement.setInt(13, planetaTeste.getDev_ruby());
			psStatement.setInt(14, planetaTeste.getDev_php());
			psStatement.setInt(15, planetaTeste.getDev_csharp());
			psStatement.setInt(16, planetaTeste.getDev_cmais());
			psStatement.setInt(17, planetaTeste.getDev_c());

			psStatement.setInt(18, planetaTeste.getV_python());
			psStatement.setInt(19, planetaTeste.getV_javascript());
			psStatement.setInt(20, planetaTeste.getV_ruby());
			psStatement.setInt(21, planetaTeste.getV_php());
			psStatement.setInt(22, planetaTeste.getV_csharp());
			psStatement.setInt(23, planetaTeste.getV_cmais());
			psStatement.setInt(24, planetaTeste.getV_c());

			psStatement.setInt(25, planetaTeste.getD_python());
			psStatement.setInt(26, planetaTeste.getD_javascript());
			psStatement.setInt(27, planetaTeste.getD_ruby());
			psStatement.setInt(28, planetaTeste.getD_php());
			psStatement.setInt(29, planetaTeste.getD_csharp());
			psStatement.setInt(30, planetaTeste.getD_cmais());
			psStatement.setInt(31, planetaTeste.getD_c());

			psStatement.setInt(32, planetaTeste.getA_python());
			psStatement.setInt(33, planetaTeste.getA_javascript());
			psStatement.setInt(34, planetaTeste.getA_ruby());
			psStatement.setInt(35, planetaTeste.getA_php());
			psStatement.setInt(36, planetaTeste.getA_csharp());
			psStatement.setInt(37, planetaTeste.getA_cmais());
			psStatement.setInt(38, planetaTeste.getA_c());

			psStatement.setInt(39, planetaTeste.getBug_q1());
			psStatement.setInt(40, planetaTeste.getBug_q2());
			psStatement.setInt(41, planetaTeste.getBug_q3());
			psStatement.setInt(42, planetaTeste.getBug_q4());
			psStatement.setInt(43, planetaTeste.getDev_q1());
			psStatement.setInt(44, planetaTeste.getDev_q2());
			psStatement.setInt(45, planetaTeste.getDev_q3());
			psStatement.setInt(46, planetaTeste.getDev_q4());

			psStatement.executeUpdate();
			psStatement.close();

		} catch (NullPointerException e) {
			System.out.println("Erro. Alguma variável não foi corretamente inicializada ou está vazia. ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
