<%@page import="dwpbay.ItemsBean"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Items</title>
<link rel="stylesheet" type = "text/css" href="Buyers.css">
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
<form action="Buyers" method="post"><input type="submit" name="go" value="Buyer" id="buyers">
<a href="SellerMenu.jsp">Seller</a>
<a href="AccountsMenu.jsp">Account</a></form>
</div>
<div class="search">
<form id="search">
Search:&nbsp
<input type="text" name="search">
<input type="submit" value="Go">
</form>
</div>
<nav id="categories">
<ul>
	<li><form action="Buyers" method="post"><input type="submit" name="go" value="Clothes"></form></li>
	<li><form action="Buyers" method="post"><input type="submit" name="go" value="Shoes"></form></li>
	<li><form action="Buyers" method="post"><input type="submit" name="go" value="Furniture"></form></li>
	<li><form action="Buyers" method="post"><input type="submit" name="go" value="Electronics"></form></li>
	<li><form action="Buyers" method="post"><input type="submit" name="go" value="All"></form></li>
</ul>
</nav>
<nav id="main">
<table class="items">
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
</nav>
</body>
</html>