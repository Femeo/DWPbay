package dwpbay;

import javax.servlet.http.HttpServlet ;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
import java.io.*;

import javax.servlet.*;

public class NewUserJSP extends HttpServlet {

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
		
		try {
			String f_name = request.getParameter("f_name") ;
			String l_name = request.getParameter("l_name") ;
			String email = request.getParameter("email") ;
			String address = request.getParameter("address");
			String postcode = request.getParameter("postcode");
			
			PreparedStatement statement = connection.prepareStatement("insert into users values(?,?,?,?);") ;
			
			statement.setString(1, null);
			statement.setString(2, f_name);
			statement.setString(3, l_name);
			statement.setString(4, email);
			
			statement.execute();
			
			response.sendRedirect("LogIn.jsp");
		}
		catch(SQLException e) {
			System.out.println("Exeception " + e);
		}
	}
}
