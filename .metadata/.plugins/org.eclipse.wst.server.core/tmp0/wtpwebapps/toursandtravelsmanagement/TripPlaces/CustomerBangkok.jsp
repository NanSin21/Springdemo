<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bangkok Trip Package</title>
<!-- <meta charset="utf-8"> -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .navbar{
  margin-nottom= 50px;
  border-radius= 0;
  }
  .jumbotron{
   margin-bottom= 0;
   }
   footer{
   background: green;
   padding: 25px;
   }
   </style>
</head>
<body>

<div class="jumbotron" style="background-image: url(''); color: black;">
  <div class="container text-center">
   <h2>Special Offers for Bangkok Trip</h2>
     <p>Holiday plans, exciting budgets and delicious meals</p>
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>  
        </button>
        <h1><a class="navbar-brand" href="CustomerHome.jsp">Trip Planner</a></h1>
      </div>
      <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="TripPlaces/CustomerLondon.jsp">Home</a></li>
       <!--  <li><a href="registration.jsp">Register</a></li>
        <li><a href="login.jsp">Login</a></li> -->
        <li><a href="contact.jsp">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="profile.jsp"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
       <!--  <li><a href="budget.html">Budget Details</a></li> -->
      <!--   <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li> -->
      </ul>
    </div>
  </div>
</nav>
   
   
   <div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">GOLDEN DEAL</div>
        <div class="panel-body"><img src="images/ban_img2.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Get free breakfast and a gift card.</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">BIG COMBO OFFER</div>
        <div class="panel-body"><img src="images/ban_img1.jpg" class="img-responsive" style="width:95%" alt="Image"></div>
        <div class="panel-footer">Book for minimum two families and get a free ride to tourist places.</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">BONANZA FRIDAY DEAL</div>
        <div class="panel-body"><img src="images/ban_img3.jpg" class="img-responsive" style="width:95%" alt="Image"></div>
        <div class="panel-footer">Book a hotel on Friday and get free dinner for one night.</div>
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">BUSINESS TOUR</div>
        <div class="panel-body"><img src="images/londonhelp.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Tie up your company and beneficial offers for next tour from your company.</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">LUXURIOUS HOTEL OFFER</div>
        <div class="panel-body"><img src="images/2.jpg" class="img-responsive" style="width:80%" alt="Image"></div>
        <div class="panel-footer">Book a high rated hotel for minimum 4 days and 3 nights and get luxuries suites and delicious food to savor.</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">WEDDING SEASON SPECIAL</div>
        <div class="panel-body"><img src="images/page4_img2.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Book for your wedding and enjoy our experienced hospitality</div>
      </div>
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <p>Trip Planner Copyright</p>  
 <!--  <form action="LoginServlet" method="post" class="form-inline">Get deals:
    <input type="email" class="form-control" size="50" name="email" placeholder="Email Address">
     <input type="password" placeholder="Enter Password" name="password" required>
    <button type="submit" class="btn btn-danger">Sign Up</button>
  </form> -->
</footer>
</body>
</html>