package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		try {

			Connection conn = DB.getConnection();

			Statement st = null;

			ResultSet rs = null;

			st = conn.createStatement();
			
			rs = st.executeQuery("Select * from department");

			while (rs.next()) {

				System.out.println(rs.getInt("Id") + "," + rs.getString("Name"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
