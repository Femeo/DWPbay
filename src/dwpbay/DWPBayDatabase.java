package dwpbay;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DWPBayDatabase {
	
	private static Connection connection = null ;
	private static Statement statement = null ;
	private static String userName = "root";
	private static String password = "";

	
	static ResultSet allclothes() {
		try { 
			ResultSet rs = statement.executeQuery("SELECT * from allclothes");
			return rs ;
		}
		catch (SQLException e ) {
			System.out.println("SQL Exception " + e);
		}
		return null ;
	}
	
	static ResultSet allelectronics() {
		try {
			ResultSet rs = statement.executeQuery("SELECT * from allelectronics");
			return rs ;
		}
		catch (SQLException e) {
			System.out.println("SQL Exception " + e );
		}
		return null ;
	}
	
	static ResultSet allfurniture() {
		try {
			ResultSet rs = statement.executeQuery("SELECT * from allfurniture");
			return rs ;
		}
		catch (SQLException e) {
			System.out.println("SQL Exception " + e);
		}
		return null ;
	}
	
	static ResultSet allitemsonsale() {
		try {
			ResultSet rs = statement.executeQuery("SELECT * from allitemsonsale");
			return rs ;
		}
		catch (SQLException e) {
			System.out.println("SQL Exception " + e);
		}
		return null ;
	}
	
	static ResultSet allshoes() {
		try { 
			ResultSet rs = statement.executeQuery("SELECT * from allshoes");
			return rs ;
		}
		catch (SQLException e) {
			System.out.println("SQL Exception "+ e );
		}
		return null ;
	}
	
	static ResultSet allbids() {
		try {
			ResultSet rs = statement.executeQuery("SELECT * from homepage");
			return rs ;
		}
		catch (SQLException e) {
			System.out.println("SQL Exception " + e);
		}
		return null ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

