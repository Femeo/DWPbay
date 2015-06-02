<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seller Menu</title>
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
<a href="#">Account</a>
</div>
<div class="main">
<ul>
	<li><a href="ListItem.jsp">List An Item For Sale</a></li>
	<li><a href="ItemsOnSale.jsp">View My Items On Sale</a></li>
	<li><a href="SoldItems.jsp">View My Sold Items</a></li>
</ul>
</div>
</body>
</html>