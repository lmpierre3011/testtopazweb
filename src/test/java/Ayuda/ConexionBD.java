package Ayuda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
	String dbUrl = "jdbc:oracle:thin:@TOPSERVER28:1521:TOPAZ";
	String username = "bankweb";
	String password = "bankweb";

	public void QUERYBD(String query) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try (Connection conn = DriverManager.getConnection(dbUrl, username, password)) {

			if (conn != null) {
				Connection con = DriverManager.getConnection(dbUrl, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				System.out.println("Connected to the database!");
				while (rs.next()) {
					System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
							+ rs.getString(4) + " " + rs.getString(5));
				}
			} else {
				System.out.println("Failed to make connection!");
			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}