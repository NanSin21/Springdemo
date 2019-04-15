<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Trip Planner Account</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Travel Agency Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>	

<link href="css/login1.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //custom-theme files-->
<link href="css/simpleLightbox.css" rel="stylesheet" type="text/css" />
<!-- font-awesome-icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome-icons -->
<!-- googlefonts -->
<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext,vietnamese" rel="stylesheet">
<!-- //googlefonts -->

</head>
<body>
<!-- Top-Bar -->
				<div class="top">
					<div class="container">
						
							
							<div class="col-md-6 top-middle">
								<ul>
									<li><a href="#"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#"><i class="fa fa-twitter"></i></a></li>
									<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
									<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
								</ul>
							</div>
							<div class="col-md-6 top-left">
								<ul>
									<li><i class="fa fa-mobile" aria-hidden="true"></i> +021 365 777</li>
									<li><i class="fa fa-map-marker" aria-hidden="true"></i> JB Tower,Near SAL Hospital </li>
								</ul>
							</div>
							<div class="clearfix"></div>
						
					</div>
				</div>
				<div class="top-bar">
				<div>
					<div class="header">
						<nav class="navbar navbar-default">
							<div class="navbar-header navbar-left">
								<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" width="13%">
									<span class="sr-only">Toggle navigation</span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button>
								<h1><a class="navbar-brand" href="index.jsp">Trip Planner</a></h1>
							</div>
							<!-- Collect the nav links, forms, and other content for toggling -->
							<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
								<nav class="cl-effect-15" id="cl-effect-15">
									<ul class="nav navbar-nav" >
										<li class="active"><a href="index.jsp">Home</a></li>
													<li><a href="about.jsp">About</a></li>
													<!-- <li><a href="booking.jsp">Booking</a></li> -->
													<li><a href="gallery.jsp">Gallery</a></li>
													<li><a href="package.jsp">Packages</a></li>
                                                    <!-- <li><a href="registration.jsp">Register</a></li> -->
                                                    <li><a href="login.jsp">Login</a></li>
													<li><a href="contact.jsp">Contact</a></li>
												</ul>
									
								</nav>
							</div>
						</nav>
						</div>
				</div>
			</div>
		
		<!-- //Top-Bar -->


<form action="LoginServlet" method="post">
  <div class="imgcontainer">
    <img src="images/download.jpg" alt="Avatar" class="avatar">
  </div>

 <div class="container">
  <div class="form-container-left">
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email-Id" name="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <button type="submit" width="100%">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
    
     <button type="button" class="cancelbtn" width="100%">Cancel</button>
    <span class="psw">Forgot to Register Then<a href="registration.jsp">New User</a></span>
  </div>
  
  <div class="info-container">
  <div class="img-container" >
    <img alt="HolidayTourister" src="images/logoforlogin.png" class="tourist">
    </div>
  </div>
  <!-- style="background-color:#f1f1f1"> -->
   </div>
</form>


</body>
</html>