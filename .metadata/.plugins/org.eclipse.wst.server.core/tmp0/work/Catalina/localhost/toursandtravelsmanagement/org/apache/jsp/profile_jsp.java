/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2018-07-21 06:54:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.CustomerDao;
import pojo.Customer;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("pojo.Customer");
    _jspx_imports_classes.add("dao.CustomerDao");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Travel Agency a Travel Agency Category Flat Bootstrap Responsive Website Template | Booking :: w3layouts</title>\r\n");
      out.write("<!-- custom-theme -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Travel Agency Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\r\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<style>\r\n");
      out.write("table {\r\n");
      out.write("    font-family: arial, sans-serif;\r\n");
      out.write("    /* border-collapse: collapse; */\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("   /*  border: 1px solid #dddddd; */\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 8px;\r\n");
      out.write("    margin: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even) {\r\n");
      out.write("    background-color: #dddddd;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\t\t\r\n");
      out.write("<!-- For Testimonials slider -->\r\n");
      out.write("<!-- //For Testimonials slider -->\r\n");
      out.write("<!-- //custom-theme files-->\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- //custom-theme files-->\r\n");
      out.write("<!-- font-awesome-icons -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("<!-- //font-awesome-icons -->\r\n");
      out.write("<!-- googlefonts -->\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext,vietnamese\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //googlefonts -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery-ui.css\" />\r\n");
      out.write("<link href=\"css/bookingstyle.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
 Customer cust = (Customer)session.getAttribute("customer");
String cust_name = cust.getFirstname();
Customer ct = CustomerDao.getRecordById(cust.getCust_id());

      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("<!-- banner -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Top-Bar -->\r\n");
      out.write("\t\t\t\t<div class=\"top\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6 top-middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6 top-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-mobile\" aria-hidden=\"true\"></i> +021 365 777</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i> JB Tower, Near SAL Hospital </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"top-bar\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"navbar-header navbar-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1><a class=\"navbar-brand\" href=\"index.html\">Trip Planner</span></a></h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"collapse navbar-collapse navbar-right\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<nav class=\"cl-effect-15\" id=\"cl-effect-15\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"CustomerHome.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- <li><a href=\"about.jsp\">About</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\"  data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Booking <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"fbook.jsp\">Flight</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"tbook.jsp\">Train</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"hbook.jsp\">Hotel</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"pbook.jsp\">Package</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"profile.jsp\">Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"LogoutServlet\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"CustomerGallery.jsp\">Gallery</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- <li><a href=\"contact.jsp\">Contact</a></li> -->\r\n");
      out.write("                                                    <li><a href=\"CustomerPackage.jsp\">Offers and Deals</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- //Top-Bar -->\r\n");
      out.write("\t\t<!-- w3-banner -->\r\n");
      out.write("\t<div class=\"banner-1\">\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- //banner -->\r\n");
      out.write("<!-- main-section -->\r\n");
      out.write("\t<div class=\"head agile\">\r\n");
      out.write("\t<div class=\"wthree_head_section\">\r\n");
      out.write("\t\t\t\t<h3 class=\"w3l_header\">Your <span>Profile</span></h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"banner-text\">\r\n");
      out.write("\t\t<table id=\"customers\" style=\"width:100%\" >\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\" align=\"center\" id=\"h\"><h1>\r\n");
      out.write("\t\t\t\t\t\tWelcome , <b>");
      out.print(ct.getFirstname());
      out.write(' ');
      out.print(ct.getLastname());
      out.write("</b>\r\n");
      out.write("\t\t\t\t\t</h1></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>First Name</h5></td>\r\n");
      out.write("\t\t\t\t<td><h5>:</h5></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>");
      out.print(ct.getFirstname());
      out.write("</h5></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>Last Name</h5></td>\r\n");
      out.write("\t\t\t\t<td><h5>:</h5></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>");
      out.print(ct.getLastname());
      out.write("</h5></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>Email Id</h5></td>\r\n");
      out.write("\t\t\t\t<td><h5>:</h5></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>");
      out.print(ct.getEmail());
      out.write("</h5></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>Gender</h5></td>\r\n");
      out.write("\t\t\t\t<td><h5>:</h5></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>");
      out.print(ct.getGender());
      out.write("</h5></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>Date of Birth</h5></td>\r\n");
      out.write("\t\t\t\t<td><h5>:</h5></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>");
      out.print(ct.getDob());
      out.write("</h5></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>Mobile No</h5></td>\r\n");
      out.write("\t\t\t\t<td><h5>:</h5></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>");
      out.print(ct.getMb_no());
      out.write("</h5></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>Password</h5></td>\r\n");
      out.write("\t\t\t\t<td><h5>:</h5></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><h5>");
      out.print(ct.getPassword());
      out.write("</h5></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<!-- <td></td> -->\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" align=\"left\"><a href=\"bookingprofile.jsp?id=");
      out.print( ct.getCust_id() );
      out.write("\"><span>Booking Details</span></a></td>\r\n");
      out.write("\t\t\t\t<td align=\"right\"><a id=\"a1\" href=\"EditProfile2.jsp?cust_id=");
      out.print(ct.getCust_id());
      out.write("\"><span>Edit Profile</span></a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("<!-- //main-section -->\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 agile_footer_grid\">\r\n");
      out.write("\t\t\t\t<h3>Contact Info</h3>\r\n");
      out.write("\t\t\t\t<ul class=\"w3_address\">\r\n");
      out.write("\t\t\t\t\t<li><i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i>1234k Avenue, 4th block, <span>New York City.</span></li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:info@example.com\">info@example.com</a></li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>+1234 567 567</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4 agile_footer_grid\">\r\n");
      out.write("\t\t\t\t<h3>About Us</h3>\r\n");
      out.write("\t\t\t\t<p>Donec purus neque, vulputate id est id, pretium semper enim. Morbi viverra \r\n");
      out.write("\t\t\t\t\tcongue nisi vel pulvinar posuere sapien eros, sed faucibus.</p>\r\n");
      out.write("\t\t\t\t<ul class=\"agileits_social_list\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" class=\"w3_agile_facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" class=\"agile_twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" class=\"w3_agile_dribble\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4 agile_footer_grid\">\r\n");
      out.write("\t\t\t\t<h3>Latest News</h3>\r\n");
      out.write("\t\t\t\t<ul class=\"agileits_w3layouts_footer_grid_list\">\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">Donec purus neque, vulputate \r\n");
      out.write("\t\t\t\t\t\t\tid est id</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">Nullam fringilla sed quam vitae</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">Cras libero arcu, accumsan ac </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">Aenean porttitor accumsan</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">Nullam sed turpis gravida</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t<div class=\"w3_agileits_footer_grids\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12 wthree_footer_grid_right\">\r\n");
      out.write("\t\t\t\t\t<h3>Sign up for our Newsletter</h3>\r\n");
      out.write("\t\t\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" name=\"Email\" placeholder=\"Enter your email...\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Submit\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"agileinfo_copyright\">\r\n");
      out.write("\t\t<p>© 2018 Travel Agency. All rights reserved | Design by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- //footer -->\r\n");
      out.write("\r\n");
      out.write("<!-- bootstrap-modal-pop-up -->\r\n");
      out.write("\t<div class=\"modal video-modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModal\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\tTravel Agency\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/1.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t<p>Know more places around the world to every nook and corner with us to enjoy every single minute you spent your money worth for.</i></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- //bootstrap-modal-pop-up --> \r\n");
      out.write("<!-- js -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("\t<!-- for bootstrap working -->\r\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\t<!-- //for bootstrap working -->\r\n");
      out.write("<!-- //js -->\r\n");
      out.write("<!-- //here starts scrolling icon -->\r\n");
      out.write("<script src=\"js/SmoothScroll.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("\t<!-- here stars scrolling script -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t/*\r\n");
      out.write("\t\t\t\tvar defaults = {\r\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\r\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\r\n");
      out.write("\t\t\t\teasingType: 'linear' \r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- //here ends scrolling script -->\r\n");
      out.write("<!-- //here ends scrolling icon -->\r\n");
      out.write("\r\n");
      out.write("<!-- scrolling script -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script> \r\n");
      out.write("<!-- //scrolling script -->\r\n");
      out.write("<!-- //Calendar -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<script src=\"js/jquery-ui.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t  $(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$( \"#datepicker,#datepicker1\" ).datepicker();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t  });\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </script>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- //Calendar -->\r\n");
      out.write("<!--script-->\r\n");
      out.write("<script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t    <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t    $(document).ready(function () {\r\n");
      out.write("\t\t\t        $('#horizontalTab').easyResponsiveTabs({\r\n");
      out.write("\t\t\t            type: 'default', //Types: default, vertical, accordion           \r\n");
      out.write("\t\t\t            width: 'auto', //auto or any width like 600px\r\n");
      out.write("\t\t\t            fit: true   // 100% fit in a container\r\n");
      out.write("\t\t\t        });\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("</script>\t\r\n");
      out.write("<!--script-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
