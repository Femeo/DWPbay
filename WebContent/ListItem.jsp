<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Item</title>
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
<form action="Buyers" method="post"><input type="submit" name="go" value="Buyer" id="buyers">
<a href="SellerMenu.jsp">Seller</a>
<a href="AccountsMenu.jsp">Account</a></form>
</div>
<br><br><br><br>
<div class="main">
<form action="NewItem" method="post">
Title:<br>
<input type="text" name="title"><br><br>
Description:<br>
<textarea name="description" cols="40" rows="5"></textarea><br><br>
Picture URL:<br>
<input type="url" name="picture"><br><br>
Start Price:<br>
<input type="text" name="price"><br><br>
Reserve Price:<br>
<input type="text" name="reserve_price"><br><br>
Category:
<select><option value="clothes">Clothes</option>
		<option value="shoes">Shoes</option>
		<option value="furniture">Furniture</option>
		<option value="electronics">Electronics</option>
</select><br><br>
<input type="submit" value="AddItem" name="go">
</form>
<br><br>
<button id="back" onClick="location.href='SellerMenu.jsp'">Back</button>
<br><br>
</div>
</body>
</html>