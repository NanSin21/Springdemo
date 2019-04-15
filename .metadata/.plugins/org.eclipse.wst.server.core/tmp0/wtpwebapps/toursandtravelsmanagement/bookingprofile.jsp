<%@page import="dao.PackageDao"%>
<%@page import="pojo.Package_book"%>
<%@page import="dao.HotelDao"%>
<%@page import="pojo.Hotel_book"%>
<%@page import="dao.TrainDao"%>
<%@page import="pojo.Train_Book"%>
<%@page import="dao.FlightDao"%>
<%@page import="pojo.FlightBook"%>
<%@page import="dao.CustomerDao"%>
<%@page import="pojo.Customer,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Travel Agency a Travel Agency Category Flat Bootstrap Responsive Website Template | Booking :: w3layouts</title>
<!-- custom-theme -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Travel Agency Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>	
		
		<style>
table {
    font-family: arial, sans-serif;
    /* border-collapse: collapse; */
    width: 100%;
    
}


th, td {
   /*  border: 1px solid #dddddd; */
    text-align: center;
    padding: 8px;
    margin: 10px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
		
<!-- For Testimonials slider -->
<!-- //For Testimonials slider -->
<!-- //custom-theme files-->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //custom-theme files-->
<!-- font-awesome-icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome-icons -->
<!-- googlefonts -->
<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext,vietnamese" rel="stylesheet">
<!-- //googlefonts -->
<link rel="stylesheet" href="css/jquery-ui.css" />
<link href="css/bookingstyle.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>

<%
	Customer cust = (Customer)session.getAttribute("customer");
String cust_name = cust.getFirstname(); 
String id = request.getParameter("id");
%>
<%
	List<FlightBook> list = FlightDao.getbycustid(Integer.parseInt(id));
request.setAttribute("list",list);
%>  
<%
	List<Train_Book> list_t = TrainDao.getbycustid(Integer.parseInt(id));
request.setAttribute("list_t",list_t);
%> 
<%
	List<Hotel_book> list_h = HotelDao.getbycustid(Integer.parseInt(id));
request.setAttribute("list_h",list_h);
%> 		
<%
	List<Package_book> list_p = PackageDao.getbycustid(Integer.parseInt(id));
request.setAttribute("list_p",list_p);
%> 
<!-- banner -->


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
									<li><i class="fa fa-map-marker" aria-hidden="true"></i> JB Tower, Near SAL Hospital </li>
								</ul>
							</div>
							<div class="clearfix"></div>
						
					</div>
				</div>
				<div class="top-bar">
				<div class="container">
					<div class="header">
						<nav class="navbar navbar-default">
							<div class="navbar-header navbar-left">
								<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
									<span class="sr-only">Toggle navigation</span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button>
								<h1><a class="navbar-brand" href="index.html">Trip Planner</span></a></h1>
							</div>
							<!-- Collect the nav links, forms, and other content for toggling -->
							<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
								<nav class="cl-effect-15" id="cl-effect-15">
									<ul class="nav navbar-nav">
										<li><a href="CustomerHome.jsp">Home</a></li>
													<!-- <li><a href="about.jsp">About</a></li> -->
													<li class="dropdown">
														<a href="#" class="dropdown-toggle"  data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Booking <span class="caret"></span></a>
														<ul class="dropdown-menu" >
															<li><a href="fbook.jsp">Flight</a></li>
															<li><a href="tbook.jsp">Train</a></li>
															<li><a href="hbook.jsp">Hotel</a></li>
															<li><a href="pbook.jsp">Package</a></li>
														</ul>
													</li>
													<li class="active"><a href="profile.jsp">Profile</a></li>
													<li><a href="LogoutServlet">Logout</a></li>
													<li><a href="CustomerGallery.jsp">Gallery</a></li>
													<li><a href="CustomerPackage.jsp">Offers and Deals</a></li>
                                                    

													
													
												</ul>
									
								</nav>
							</div>
						</nav>
				</div>
			</div>
		</div>
		<!-- //Top-Bar -->
		<!-- w3-banner -->
	<div class="banner-1">
	
	</div>
<!-- //banner -->
<!-- main-section -->
	<div class="head agile">
	<div class="wthree_head_section">
				<h3 class="w3l_header">Booking <span>Details</span></h3>
			</div>
	
			<div class="banner-text">
			
			<c:choose>  
<c:when test = "${list.isEmpty()}">  
  
</c:when> 
<c:otherwise>
			 
		<table id="customers" style="width:100%" >
		
		<!-- <table border="1" width="90%"> --> 
		<tr>
				<td colspan="5" align="center" id="h"><h1>
						 Flight Booking Details
					</h1></td>
			</tr> 
<tr><th>source location</th><th>Destination location</th><th>Departure Date</th><th>No. of Passengers</th>  
<th>Class</th><th>Cancellation</th></tr>  
<c:forEach items="${list}" var="c">  
<tr>
<td>${c.getFrom_loc()}</td>
<td>${c.getTo_loc()}</td>
<td>${c.getDeparture_date()}</td>  
<td>${c.getNo_passengers()}</td>
<td>${c.getF_class()}</td>
 <td><a href="DeleteFlightServlet?id=${c.getFbook_id()}">Cancel</a></td>
<%-- <td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td> --%>
</tr>  
</c:forEach>  
</table> 
</c:otherwise>  
</c:choose>  

<c:choose>  
<c:when test = "${list_t.isEmpty()}">  
  
</c:when> 
<c:otherwise>
			 
		<table id="customers" style="width:100%" >
		
		<!-- <table border="1" width="90%"> --> 
		<tr>
				<td colspan="5" align="center" id="h"><h1>
						 Train Booking Details
					</h1></td>
			</tr> 
<tr><th>Source location</th><th>Destination location</th><th>Departure Date</th><th>No. of Passengers</th>  
<th>Class</th><th>Cancellation</th></tr>  
<c:forEach items="${list_t}" var="c">  
<tr>
<td>${c.getFrom_loc()}</td>
<td>${c.getTo_loc()}</td>
<td>${c.getDeparture_date()}</td>  
<td>${c.getNo_passengers()}</td>
<td>${c.getT_class()}</td>
 <td><a href="DeleteTrain?id=${c.getTbook_id()}">Cancel</a></td>
<%-- <td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
 --%>
</tr>  
</c:forEach>  
</table> 
</c:otherwise>  
</c:choose>  

<c:choose>  
<c:when test = "${list_p.isEmpty()}">  
  
</c:when> 
<c:otherwise>
			 
		<table id="customers" style="width:100%" >
		
		<!-- <table border="1" width="90%"> --> 
		<tr>
				<td colspan="5" align="center" id="h"><h1>
						 Package Booking Details
					</h1></td>
			</tr> 
<tr><th>Package Name</th><th>Package Price</th><th>Cancellation</th></tr>  
<c:forEach items="${list_p}" var="c">  
<tr>
<td>${c.getPackage_name()}</td>
<td>${c.getPrice()}</td>
<td><a href="DeletePackage?id=${c.getPbook_id()}">Cancel</a></td>
<%-- <td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
 --%>
</tr>  
</c:forEach>  
</table> 
</c:otherwise>  
</c:choose>  

<c:choose>  
<c:when test = "${list_h.isEmpty()}">  
  
</c:when> 
<c:otherwise>
			 
		<table id="customers" style="width:100%" >
		
		<!-- <table border="1" width="90%"> --> 
		<tr>
				<td colspan="5" align="center" id="h"><h1>
						 Hotel Booking Details
					</h1></td>
			</tr> 
<tr><th>Hotel Name</th><th>City</th><th>Room Type</th><th>Hotel Type</th>  
<th>No Of Rooms</th><th>Cancellation</th></tr>  
<c:forEach items="${list_h}" var="c">  
<tr>
<td>${c.getHotel_name()}</td>
<td>${c.getCity()}</td>
<td>${c.getRoom_type()}</td>  
<td>${c.getHotel_type()}</td>
<td>${c.getNo_of_rooms()}</td>
<td><a href="DeleteHotel?id=${c.getHbook_id()}">Cancel</a></td>
<%-- <td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td> --%>
</tr>  
</c:forEach>  
</table> 
</c:otherwise>  
</c:choose>
			<%-- <tr>
				<td colspan="3" align="center" id="h"><h1>
						Welcome , <b><%=cust.getFirstname()%> <%=cust.getLastname()%></b>
					</h1></td>
			</tr>
			
			<tr>
				<td align="center"><h5>First Name</h5></td>
				<td><h5>:</h5></td>
				<td align="center"><h5><%=cust.getFirstname()%></h5></td>
			</tr>
			<tr>
				<td align="center"><h5>Last Name</h5></td>
				<td><h5>:</h5></td>
				<td align="center"><h5><%=cust.getLastname()%></h5></td>
			</tr>
			<tr>
				<td align="center"><h5>Email Id</h5></td>
				<td><h5>:</h5></td>
				<td align="center"><h5><%=cust.getEmail()%></h5></td>
			</tr>
			<tr>
				<td align="center"><h5>Gender</h5></td>
				<td><h5>:</h5></td>
				<td align="center"><h5><%=cust.getGender()%></h5></td>
			</tr>
			<tr>
				<td align="center"><h5>Date of Birth</h5></td>
				<td><h5>:</h5></td>
				<td align="center"><h5><%=cust.getDob()%></h5></td>
			</tr>
			<tr>
				<td align="center"><h5>Shop Name</h5></td>
				<td><h5>:</h5></td>
				<td align="center"><h5><%=client.getShopname()%></h5></td>
			</tr>
			<tr>
				<td align="center"><h5>License No</h5></td>
				<td><h5>:</h5></td>
				<td align="center"><h5><%=client.getLicenceno()%></h5></td>
			</tr>
			<tr>
				<td align="center"><h5>Mobile No</h5></td>
				<td><h5>:</h5></td>
				<td align="center"><h5><%=cust.getMb_no()%></h5></td>
			</tr>
			<tr>
				<td align="center"><h5>Password</h5></td>
				<td><h5>:</h5></td>
				<td align="center"><h5><%=cust.getPassword()%></h5></td>
			</tr>
			<tr>
				<!-- <td></td> -->
				<td colspan="2" align="left"><a href="BookingServlet?id=<%= cust.getCust_id() %>"><span>Booking Details</span></a></td>
				<td align="right"><a id="a1"
					href="EditProfile.jsp?id=<%=cust.getCust_id()%>"><span>Edit
							Profile</span></a></td>
			</tr>
			
		</table> --%>

	</div>
	</div>	
		<div class="clear"></div>
	
	<!-- //main-section -->
<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="col-md-4 agile_footer_grid">
				<h3>Contact Info</h3>
				<ul class="w3_address">
					<li><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i>1234k Avenue, 4th block, <span>New York City.</span></li>
					<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i><a href="mailto:info@example.com">info@example.com</a></li>
					<li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>+1234 567 567</li>
				</ul>
			</div>
			<div class="col-md-4 agile_footer_grid">
				<h3>About Us</h3>
				<p>Donec purus neque, vulputate id est id, pretium semper enim. Morbi viverra 
					congue nisi vel pulvinar posuere sapien eros, sed faucibus.</p>
				<ul class="agileits_social_list">
					<li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
					<li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
					<li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
				</ul>
			</div>
			<div class="col-md-4 agile_footer_grid">
				<h3>Latest News</h3>
				<ul class="agileits_w3layouts_footer_grid_list">
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>
						<a href="#" data-toggle="modal" data-target="#myModal">Donec purus neque, vulputate 
							id est id</a>
					</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>
						<a href="#" data-toggle="modal" data-target="#myModal">Nullam fringilla sed quam vitae</a>
					</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>
						<a href="#" data-toggle="modal" data-target="#myModal">Cras libero arcu, accumsan ac </a>
					</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>
						<a href="#" data-toggle="modal" data-target="#myModal">Aenean porttitor accumsan</a>
					</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>
						<a href="#" data-toggle="modal" data-target="#myModal">Nullam sed turpis gravida</a>
					</li>
				</ul>
			</div>
			<div class="clearfix"> </div>
			<div class="w3_agileits_footer_grids">
				<div class="col-md-12 wthree_footer_grid_right">
					<h3>Sign up for our Newsletter</h3>
					<form action="#" method="post">
						<input type="email" name="Email" placeholder="Enter your email..." required="">
						<input type="submit" value="Submit">
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<div class="agileinfo_copyright">
		<p>� 2018 Travel Agency. All rights reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
	</div>
<!-- //footer -->

<!-- bootstrap-modal-pop-up -->
	<div class="modal video-modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					Travel Agency
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
				</div>
					<div class="modal-body">
						<img src="images/1.jpg" alt=" " class="img-responsive" />
						<p>Know more places around the world to every nook and corner with us to enjoy every single minute you spent your money worth for.</i></p>
					</div>
			</div>
		</div>
	</div>
<!-- //bootstrap-modal-pop-up --> 
<!-- js -->
	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
	<!-- for bootstrap working -->
	<script src="js/bootstrap.js"></script>
	<!-- //for bootstrap working -->
<!-- //js -->
<!-- //here starts scrolling icon -->
<script src="js/SmoothScroll.min.js"></script>
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<!-- here stars scrolling script -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
	<!-- //here ends scrolling script -->
<!-- //here ends scrolling icon -->

<!-- scrolling script -->
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script> 
<!-- //scrolling script -->
<!-- //Calendar -->
											<script src="js/jquery-ui.js"></script>
											  <script>
													  $(function() {
														$( "#datepicker,#datepicker1" ).datepicker();
													  });
											  </script>
								<!-- //Calendar -->
<!--script-->
<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
		    <script type="text/javascript">
			    $(document).ready(function () {
			        $('#horizontalTab').easyResponsiveTabs({
			            type: 'default', //Types: default, vertical, accordion           
			            width: 'auto', //auto or any width like 600px
			            fit: true   // 100% fit in a container
			        });
			    });
				
</script>	
<!--script-->
</body>
</html>