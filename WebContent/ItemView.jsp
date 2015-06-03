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
<tr>
	<td rowspan="5" id="IndividualPicture"><img src="blacksofa.jpg"></td>
	<td id="name">Black Leather Sofa</td>	
</tr>
<tr>
	<td id="price">Current Price: £200</td>
</tr>
<tr>
	<td id="price">Reserve: £250</td>
</tr>
<tr>
	<td colspan="2" id="description">Black Genuine Leather Sofa. 3 years old and in very good condition</td>
</tr>
<tr>
	<td id="buying"><form>Enter Bid:<br><br>£<input id="submit" type="text" name="bid"><br><br>
			  <input id="submit" type="submit" value="Place Bid"></form>
</td>
</table>
<br><br>
</div>

</body>
</html>