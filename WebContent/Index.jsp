<%@page import="dwpbay.Item"%>
<%@page import="dwpbay.ItemsBean"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" type = "text/css" href="HomePage.css">
</head>
<body>
<img src="background.jpg" id="background">
<button onClick="location.href='LogIn.jsp'" id="logout">Log Out</button>
<div class="header">
<a href="Index.jsp">
<img src="logo.png">
</a>
</div>
<div class="menu">
<a href="Buyers">Buyer</a>
<a href="SellerMenu.jsp">Seller</a>
<a href="AccountsMenu.jsp">Account</a>
</div>
<h1>Items Ending Soon....</h1>
<table>

<%

List<ItemsBean> allItems = (List<ItemsBean>)request.getAttribute("Results");
for (ItemsBean i : allItems) {
	out.println("<tr>"
	+ "<td id='picture'><img src='" + i.getPicture() + "'></td>"
	+ "</tr>"
	+ "<tr>"
	+ "<td id='name'>"  + i.getTitle() + "</td>"
	+ "</tr>"
	+ "<tr>"
	+ "<td id='price'> £"  + i.getPrice() + "</td>"
	+ "</tr>"
	+ "<tr>"
	+ "<td><form action='ItemView' action='post'><input type='hidden' name='ItemID' value='" + i.getItemID() + "'><input type='submit' id='bid' value='View Item'></form></td>"
	+ "</tr>");
	
}
	
%>

</table>
<br><br>
</body>
</html>