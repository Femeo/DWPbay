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
<a href="Buyers.jsp">Buyer</a>
<a href="SellerMenu.jsp">Seller</a>
<a href="AccountsMenu.jsp">Account</a>
</div>
<h1>Items Ending Soon....</h1>
<table>
<tr>
	<td id="picture"><img src="blacksofa.jpg"></td>
	<td id="picture"><img src="iphone.jpg"></td>
</tr>
<tr>
	<td id="name">Black Leather Sofa</td>
	<td id="name">Used iPhone 5 Silver</td>
</tr>
<tr>
	<td id="price">£200</td>
	<td id="price">£160</td>
</tr>
<tr>
	<td><button id="bid" onClick="location.href='#'">View Item</button></td>
	<td><button id="bid" onClick="location.href='#'">View Item</button></td>
</tr>
<tr>
	<td id="picture"><img src="sandals.jpg"></td>
	<td id="picture"><img src="skaterdress.jpg"></td>
</tr>
<tr>
	<td id="name">Ugg Size 4 Gladiator Sandals</td>
	<td id="name">Miss Selfridge Size 10 Black Skater Dress</td>
</tr>
<tr>
	<td id="price">£15</td>
	<td id="price">£12</td>
</tr>
<tr>
	<td><button id="bid" onClick="location.href='#'">View Item</button></td>
	<td><button id="bid" onClick="location.href='#'">View Item</button></td>
</tr>
</table>
<br><br>
</body>
</html>