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
<a href="Buyers.jsp">Buyer</a>
<a href="SellerMenu.jsp">Seller</a>
<a href="AccountMenu.jsp">Account</a>
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
	<li><a href="#">Clothes</a></li>
	<li><a href="#">Shoes</a></li>
	<li><a href="#">Furniture</a></li>
	<li><a href="#">Electronics</a></li>
</ul>
</nav>
<nav id="main">
<table class="items">
<tr>
	<td rowspan="4" id="picture"><img src="blacksofa.jpg"></td>
	<td id="name">Black Leather Sofa</td>
	<td rowspan="4" id="picture"><img src="iphone.jpg"></td>
	<td id="name">Silver iPhone 5</td>
	
</tr>
<tr>
	<td id="price">Current Price: £200</td>
	<td id="price">Current Price: £160</td>
</tr>
<tr>
	<td id="price">Reserve: £250</td>
	<td id="price">Reserve: £150</td>
</tr>
<tr>
	<td id="bid"><button onClick="location.href='ItemView.jsp'">Place Bid</button></td>
	<td id="bid"><button onClick="location.href='#'">Place Bid</button></td>
</tr>
<tr>
	<td colspan="2" id="description">Black Genuine Leather Sofa. 3 years old and in very good condition</td>
	<td colspan="2" id="description">Used silver iphone 5, minor scratches on back</td>
</tr>

<tr>
	<td rowspan="4" id="picture"><img src="sandals.jpg"></td>
	<td id="name">Ugg Size 4 Gladiator Sandals</td>
	<td rowspan="4" id="picture"><img src="skaterdress.jpg"></td>
	<td id="name">Miss Selfridge Size 10 Black Skater Dress</td>
	
</tr>
<tr>
	<td id="price">Current Price: £15</td>
	<td id="price">Current Price: £12</td>
</tr>
<tr>
	<td id="price">Reserve: £40</td>
	<td id="price">Reserve: £15</td>
<tr>
	<td id="bid"><button onClick="location.href='#'">Place Bid</button></td>
	<td id="bid"><button onClick="location.href='#'">Place Bid</button></td>
</tr>
<tr>
	<td colspan="2" id="description">Brand new in box, size 4 tan gladiator sandals. Never worn as too small</td>
	<td colspan="2" id="description">Worn once, more a size 12. Excellent condition</td>
</tr>
</table>
</nav>
</body>
</html>