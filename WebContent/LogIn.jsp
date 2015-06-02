<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log In</title>
<link rel="stylesheet" type = "text/css" href="LogIn.css">
</head>
<body>
<img src="background.jpg" id="background">
<div class="header"><img src="logo.png"></div>
<div class="main">
<form action="Index.jsp" method="get">
Username:<br>
<input type="text" name="user_name"><br><br>
Password:<br>
<input type="password" name="password"><br><br>
<input type="submit" value="Enter" id="submit">
</form><br><br>
<a href="NewUser.jsp" id="new">Im New</a>
<a href="#" id="forgotton">I've Forgotten<br>My Password</a>
</div>
</body>
</html>