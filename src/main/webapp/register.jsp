<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>

</head>
<body>

<div>
<h1>Register Form</h1>
<form action="register" method="post">
<label>Name</label><br/>
<input type ="text" name= "name" placeholder="Name"/><br/>
<label>Email</label><br/>
<input type ="email" name= "email" placeholder="Your Email"/><br/>
<label>Password</label><br/>
<input type ="password" name= "password" placeholder="Your Password"/><br/>
<label>Contact</label><br/>
<input type ="text" name= "contact" placeholder="Your Number"/><br/>
<button type ="submit">Register</button>
</form>
</div>

</body>
</html>