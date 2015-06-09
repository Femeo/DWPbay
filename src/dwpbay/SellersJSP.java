package dwpbay;

import javax.servlet.http.HttpServlet ;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
import java.io.*;

import javax.servlet.*;

public class SellersJSP extends HttpServlet {
	
	Statement statement = null ;
	Connection connection = null ;

public void init(ServletConfig config) throws ServletException{
		
		super.init(config);
		
		
			try { 
				try{ 
					Class.forName("com.mysql.jdbc.Driver");
				}
				catch (ClassNotFoundException e ) {
					System.out.println("Class not Found");
				}
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dwpbay","root","");
				statement = connection.createStatement();
			}
			catch (SQLException e){
				System.out.println("SQL Exception");
			}
		
	}

	public void destroy() {
		if(connection != null){
			try {
				connection.close() ;
			}
			catch(SQLException e) {} 
		}
	}

	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		double price = Double.parseDouble(request.getParameter("price"));
		
		String title = request.getParameter("title");
		String category = request.getParameter("category");
		String description = request.getParameter("description");
		String picture = request.getParameter("picture");
		
	}
}
