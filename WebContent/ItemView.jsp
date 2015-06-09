<%@page import="dwpbay.Item"%>
<%@page import="dwpbay.ItemsBean"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<a href="Buyers.jsp">Buyer</a>
<a href="SellerMenu.jsp">Seller</a>
<a href="AccountsMenu.jsp">Account</a>
</div>
<table class="items">

<%

List<ItemsBean> Item = (List<ItemsBean>)request.getAttribute("Results");
for (ItemsBean i : Item) {
	out.println("<tr>"
	+ "<td rowspan='5' id='IndividualPicture'><img src='" + i.getPicture() + "'></td>"
	+ "<td id='name'>" + i.getTitle() + "</td>"	
	+ "</tr>"
	+ "<tr>"
	+ "<td id='price'>Current Price: £" + i.getPrice() + "</td>"
	+ "</tr>"
	+ "<tr>"
	+ "<td id='price'>Reserve: £" + i.getReservePrice() + "</td>"
	+ "</tr>"
	+ "<tr>"
	+ "<td colspan='2' id='description'>" + i.getDescription() + "</td>"
	+ "</tr>"
	+ "<tr>"
	+ "<td id='buying'><form>Enter Bid:<br><br>£<input id='submit' type='text' name='bid'><br><br>"
	+ "<input id='submit' type='submit' value='Place Bid'></form>"
	+ "</td>"
	
	);
}

%>
</table>
<br><br>
</div>

</body>
</html>