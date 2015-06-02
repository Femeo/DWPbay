<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Items</title>
<link rel="stylesheet" type = "text/css" href="Sellers.css">
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
<div class="main">
<table class="items">
<tr>
	<td rowspan="2" id="picture"><img src="blacksofa.jpg"></td>
	<td id="name">Black Leather Sofa</td>	
</tr>
<tr>
	<td id="price">Sold Price: £200</td>
</tr>
<tr>
	<td colspan="2" id="description">Black Genuine Leather Sofa. 3 years old and in very good condition</td>
</tr>

<tr>
	<td rowspan="2" id="picture"><img src="sandals.jpg"></td>
	<td id="name">Ugg Size 4 Gladiator Sandals</td>	
</tr>
<tr>
	<td id="price">Sold Price: £15</td>
</tr>
<tr>
	<td colspan="2" id="description">Brand new in box, size 4 tan gladiator sandals. Never worn as too small</td>

</tr>
</table>
</div>
</body>
</html>