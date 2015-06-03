package dwpbay;

import javax.servlet.http.HttpServlet ;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

import javax.servlet.*;

public class IndexJSP extends HttpServlet {
	
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
				System.out.println("Connecting to database...");
				System.out.println(" ");
				statement = connection.createStatement();
			}
			catch (SQLException e){
				System.out.println("SQL Exception");
			}
		
	}
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		try {
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery("SELECT * from homepage") ;
			List<ItemsBean> allItems = new ArrayList<ItemsBean>() ;
			System.out.println("1");
			DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
			int i = 0 ;
			while (rs.next() && i <= 4){
				System.out.println("2");
				System.out.println(rs.getString(9)); 
				LocalDateTime startDate = LocalDateTime.parse(rs.getString(9), dt);
				int itemID = Integer.parseInt(rs.getString(1));
				double MaxPrice = Double.parseDouble(rs.getString(6));
				double reservePrice = Double.parseDouble(rs.getString(8));
				boolean on_sale = Boolean.parseBoolean(rs.getString(7));
				ItemsBean newItem = new ItemsBean(itemID, request.getParameter("title"), 
												request.getParameter("category"),
												request.getParameter("description"),
												request.getParameter("picture"),
												MaxPrice, on_sale, reservePrice, startDate);
				allItems.add(newItem);
				i++ ;
			}
			request.setAttribute("Results", allItems);
			request.getRequestDispatcher("Index.jsp").forward(request, response);
		}
		catch(Exception e){
			System.out.println("Exception" + e );
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
