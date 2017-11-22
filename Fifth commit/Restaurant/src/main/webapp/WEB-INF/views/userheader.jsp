    <!DOCTYPE html>
<html>
<head>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Restaurant</title>
</head>
  <body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
       
    </div>
    <ul class="nav navbar-nav">
     
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Spicy Restaurant<span class="caret"></span></a>
         
    <ul class="dropdown-menu">
    <li><a href="briyani">Briyani</a></li>
    <li><a href="shawarma">Shawarma</a></li>
    
    <li><a href="grillchicken">Grill Chicken</a></li>
    <li><a href="tandoori">Tandoori</a></li>
    <li><a href="kebab">Kebab</a></li>
    <li><a href="">Chicken Tika</a></li>
    
    </ul> 
      </li>
        <li><a href="home">Home</a></li>
   
      <li><a href="aboutus">About us</a></li>
      <li><a href="productdisplay">Product</a></li>
      <li><a href="cart">cart</a></li>
      
      <form class="navbar-form navbar-left">
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search">
        <div class="input-group-btn">
          <button class="btn btn-default" type="search">
            <i class="glyphicon glyphicon-search"></i></button>
            </div></div></form>
     </ul>
     
 <ul class="nav navbar-nav navbar-right">
       <li><a href="<c:url value = "/perform_logout"/>"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
    </ul> 
       
   
  </div>
</nav>

  

 
  
 <body>
<p></p>
</body>
</html>


 