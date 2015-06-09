<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User</title>
<link rel="stylesheet" type = "text/css" href="LogIn.css">
</head>
<body>
<img src="background.jpg" id="background">
<div class="header"><img src="logo.png"></div>
<form action="NewUser" method="get">
First Name:<br>
<input type="text" name="first_name"><br><br>
Last Name:<br>
<input type="text" name="last_name"><br><br>
Email Address:<br>
<input type="email" name="email"><br><br>
Create a User Name:<br>
<input type="text" name="user_name"><br><br>
Create a Password:<br>
<input type="password" name="password"><br><br>
<input type="submit" value="Submit" id="submit">
</form>
<br><br>
<button id="cancel" onClick="location.href='LogIn.jsp'">Cancel</button>
<br><br><br><br>
</body>
</html>