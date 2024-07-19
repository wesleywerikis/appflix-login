package br.com.appflix.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.appflix.dal.ModelConnection;

public class LoginDao {
	private static final String QUERY_LOGIN = "SELECT * FROM tb_users WHERE user = ? AND password = ?";

	public boolean validateLogin(String username, String password) {
		try (Connection connection = ModelConnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(QUERY_LOGIN)) {

			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet resultSet = statement.executeQuery();

			return resultSet.next();

		} catch (SQLException e) {
			System.err.println("Error validating login: " + e.getMessage());
			return false;
		}
	}
}
