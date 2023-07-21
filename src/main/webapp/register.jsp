<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">
</head>
<body>
<div style="font-family: 'Roboto', sans-serif;">
<nav class="navbar navbar-expand-lg bg-info">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">User Management</a>
    </button>
    </div>
  </div>
</nav>
<section>
<div class = "container mt-5 pt-5">
<div class ="row">
<div class ="col-12 col-sm-8 col-md-6 m-auto">
<div class ="card border-0 shadow">
<div class ="card-body">
<div class="text-center mt-3" >
<h1 class="fs-2 fw-lighter my-5 ">Register Form</h1>

<form action="register" method="post">

<input type ="text" name= "name" class="form-control ny-4 py-2" placeholder="Name" required/><br/>

<input type ="email" name= "email" class="form-control ny-4 py-2" placeholder="Your Email" required/><br/>

<input type ="password" name= "password" class="form-control ny-4 py-2" placeholder="Your Password" required/><br/>

<input type ="text" name= "contact" class="form-control ny-4 py-2" placeholder="Your Number" required/><br/>

<input type ="checkbox" class="form-check-input mx-2 border-2" required/>
<a href="#" style="text-decoration:none">Accept Terms and Conditions</a><br/>
<button type ="submit" class="btn btn-primary my-2 px-4 py-2.5 rounded-pill">Register</button>
</form>
</div>
</div>
</div>
</div>
</div>
</section>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>

</body>
</html>