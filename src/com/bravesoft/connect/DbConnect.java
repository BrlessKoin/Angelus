/**
 *
 */
package com.bravesoft.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jose Luis Escalona Clase de coneccion a la base de datos, en este
 *         caso MySQL
 */
public class DbConnect {

	public void connectMe() {

		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost" + "user=root&password=y6xf5new@6452");
			System.out.println("Conectado");
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

	}

}
