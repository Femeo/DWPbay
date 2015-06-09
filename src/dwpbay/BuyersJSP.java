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

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

public class BuyersJSP extends HttpServlet {
	
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
		
		//String method = request.getParameter("submit");
		
		//switch (method) {
		
		//case "Index" : 
		
		try {
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery("SELECT * from homepage") ;
			List<ItemsBean> allItems = new ArrayList<ItemsBean>() ;
			System.out.println("1");
			DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			DateTimeFormatter tt = DateTimeFormatter.ofPattern("HH:mm:ss");
			int i = 0 ;
			while (rs.next() && i <= 3){
				System.out.println("2");
				System.out.println(rs.getString(9)); 
				LocalDate startDate = LocalDate.parse(rs.getString(9), dt);
				LocalTime startTime = LocalTime.parse(rs.getString(10), tt);
				int itemID = Integer.parseInt(rs.getString(1));
				double MaxPrice = Double.parseDouble(rs.getString(6));
				double reservePrice = Double.parseDouble(rs.getString(8));
				boolean on_sale = Boolean.parseBoolean(rs.getString(7));
				ItemsBean newItem = new ItemsBean(itemID, rs.getString(2), 
												rs.getString(3),
												rs.getString(4),
												rs.getString(5),
												MaxPrice, on_sale, reservePrice, startDate, startTime);
				allItems.add(newItem);
				i++ ;
			}
			request.setAttribute("Results", allItems);
			request.getRequestDispatcher("Buyers.jsp").forward(request, response);
		}
		catch(Exception e){
			System.out.println("Exception" + e );
		}
	//	break;
		}
//	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			doGet(req, resp);
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