<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">
<title>Login Page</title>
</head>

<body>

<div style="font-family: 'Roboto', sans-serif;">
<nav class="navbar navbar-expand-lg bg-info">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">User </a>
    </div>
</nav>
<section>
<div class = "container mt-5 pt-5">
<div class ="row">
<div class ="col-12 col-sm-8 col-md-6 m-auto">
<div class ="card border-0 shadow">
<div class ="card-body">
<div class="text-center mt-3" >
<h1 class="fs-2 fw-lighter ">Login Page</h1>
<svg class="mx-auto my-3" xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
  <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
  <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
</svg>
</div>
<form action="login" method = "post">

<input type ="email" name="email" class="form-control ny-4 py-2" placeholder="Your Email" required/><br/>

<input type ="password" name="password" class="form-control ny-4 py-2" placeholder="Password" required/><br/>
<div class="text-center mt-3" >
<button class="btn btn-primary my-2 px-4 py-2.5 rounded-pill" type= "submit">Login</button><br/>
<a href = "register.jsp" class="nav-link my-3 text-primary">Create a account ?</a></div>

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