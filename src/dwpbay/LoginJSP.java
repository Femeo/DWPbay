package dwpbay;

import javax.servlet.http.HttpServlet ;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
import java.io.*;

import javax.servlet.*;

public class LoginJSP extends HttpServlet {

	
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
	
	
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		try {
			String userName = request.getParameter("user_name");
			
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery("Select * from log_in where user_name = '" + userName + "';" ) ;
			
			if(!rs.isBeforeFirst()){
				request.setAttribute("authenticated", false);
			}else{
				rs.next();
				Login currentUserObj = null;
				if(rs.getString(3).equals(request.getParameter("password"))){
					currentUserObj = new Login(rs.getInt(1),rs.getString(2),rs.getString(3));
					HttpSession session = request.getSession(true);
					session.setAttribute("currentUser",currentUserObj);
					response.sendRedirect("Index");
					return;
				}else{
					request.setAttribute("authenticated",false);
				}
			}
			request.getRequestDispatcher("logIn.jsp").forward(request, response);
			
		}
		catch (SQLException e ) {
			System.out.println(e);
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

	
	
	
	
	
	
	
}
