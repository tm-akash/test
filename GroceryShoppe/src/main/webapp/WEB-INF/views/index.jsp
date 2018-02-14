<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix ="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="TaskBootstrap">
    <meta name="author" content="Akash">

    <title>Grocery</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link href="carousel.css" rel="stylesheet"/>

  </head>
  <body>

<jsp:include page="header.jsp" /> 

    <main role="main">
<div id="section1" class="container-fluid" style="padding-top:70px;padding-bottom:70px">
      <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
          <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img class="first-slide" src="./resources/images/b21.jpg" alt="First slide">
            <div class="container">
              <div class="carousel-caption text-left">
                <p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>
              </div>
            </div>
          </div>
          <div class="carousel-item">
            <img class="second-slide" src="./resources/images/b22.png" alt="Second slide">
            <div class="container">
              <div class="carousel-caption">
                <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
              </div>
            </div>
          </div>
          <div class="carousel-item">
            <img class="third-slide" src="./resources/images/b23.jpg" alt="Third slide">
            <div class="container">
              <div class="carousel-caption text-right">
                 <p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>
              </div>
            </div>
          </div>
        </div>
        <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
</div>
<div id="section2" class="container-fluid" style="padding-top:140px;padding-bottom:140px">
  <h1>Registration</h1>
  <form:form class="form-horizontal" role="form" method="POST" action="newUser">
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <h2>Register New User</h2>
                <hr>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3 field-label-responsive">
                <label for="name">Name</label>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                        <div class="input-group-addon" style="width: 2.6rem"><i class="fa fa-user"></i></div>
                        <input type="text" name="name" class="form-control" id="name"
                               placeholder="John Doe" required autofocus>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="form-control-feedback">
                        <span class="text-danger align-middle">
                            <!-- Put name validation error messages here -->
                        </span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3 field-label-responsive">
                <label for="email">E-Mail Address</label>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                        <div class="input-group-addon" style="width: 2.6rem"><i class="fa fa-at"></i></div>
                        <input type="text" name="email" class="form-control" id="email" placeholder="you@example.com" required autofocus>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="form-control-feedback">
                        <span class="text-danger align-middle">
                            <!-- Put e-mail validation error messages here -->
                        </span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3 field-label-responsive">
                <label for="password">Password</label>
            </div>
            <div class="col-md-6">
                <div class="form-group has-danger">
                    <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                        <div class="input-group-addon" style="width: 2.6rem"><i class="fa fa-key"></i></div>
                        <input type="password" name="password" class="form-control" id="password" placeholder="Password" required>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="form-control-feedback">
                        <span class="text-danger align-middle">
                            <i class="fa fa-close"> Example Error Message</i>
                        </span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3 field-label-responsive">
                <label for="password">Confirm Password</label>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <div class="input-group mb-2 mr-sm-2 mb-sm-0">
                        <div class="input-group-addon" style="width: 2.6rem">
                            <i class="fa fa-repeat"></i>
                        </div>
                        <input type="password" name="password-confirmation" class="form-control"
                               id="password-confirm" placeholder="Password" required>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <button type="submit" value="Submit" class="btn btn-success"> <!-- <a href=""> --><i class="fa fa-user-plus"></i> Register</a></button>
            </div>
        </div>
    </form:form>
</div>
<div id="section3" class="container-fluid" style="padding-top:240px;padding-bottom:240px">
  <h1>Sign In</h1>
  	<form accept-charset="UTF-8" role="form">
     <fieldset>
		<div class="form-group">
			<input class="form-control" placeholder="E-mail" name="email" type="text">
		</div>
		<div class="form-group">
			<input class="form-control" placeholder="Password" name="password" type="password" value="">
		</div>
		<div class="checkbox">
		  <label>
			   <input name="remember" type="checkbox" value="Remember Me"> Remember Me
		  </label>
		</div>
		<input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
	</fieldset>
   </form>			      	
</div>
<div id="section41" class="container-fluid" style="padding-top:70px;padding-bottom:70px">
  <h1>Breakfast,Dairy and Bakery</h1>
  <img src="./images/jeans.jpg" class="img-fluid" alt="Jeans"/>
  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
</div>
<div id="section42" class="container-fluid" style="padding-top:70px;padding-bottom:70px">
  <h1>Fruits & Vegetables</h1>
  <img src="./images/shirts.jpg" class="img-fluid" alt="Shirts"/>
  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
</div>
<div id="section43" class="container-fluid" style="padding-top:70px;padding-bottom:70px">
  <h1>Indian Grocery</h1>
  <img src="./images/shoes.jpg" class="img-fluid" alt="Shoes"/>
  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
</div>

      <!-- FOOTER -->
      <div id="foot1section" style="padding-top:200px;padding-bottom:200px;">
      <footer class="footer1">
<div class="container">

<div class="row"><!-- row -->
            
                <div class="col-lg-3 col-md-3"><!-- widgets column left -->
                <ul class="list-unstyled clear-margins"><!-- widgets -->
                        
                        	<li class="widget-container widget_nav_menu"><!-- widgets list -->
                    
                                <h1 class="title-widget">Useful links</h1>
                                
                                <ul style="list-style:none;">
                                	<li><a class="nav-link" href="#foot1section"><i class="fa fa-angle-double-right"></i> Contact Us</a></li>
                                	<li><a class="nav-link" href="#foot2section"><i class="fa fa-angle-double-right"></i> About Us</a></li>
                                    
                                </ul>
                    
							</li>
                            
                        </ul>
                         
                      
                </div><!-- widgets column left end -->
                <div class="col-lg-3 col-md-3"></div>
                
             <div class="col-lg-6 col-md-6"><!-- widgets column center -->
                
                   
                    
                        <ul class="list-unstyled clear-margins"><!-- widgets -->
                        
                        	<li class="widget-container widget_recent_news"><!-- widgets list -->
                    
                                <h1 class="title-widget">Contact Detail </h1>
                                
                                <div class="footerp"> 
                                
                                <h2 class="title-median">Akash kumar.</h2>
                                <p><b>Email id:</b> <a href="mailto:akash10a@gmail.com">akash10a@gmail.com</a></p>
                                <p><b>Helpline Numbers </b>

    <b style="color:#ffc106;">(9AM to 8PM):</b>  +91-9004243090  </p>
    
    <p><b>Phone Numbers : </b>+91-9004243090 </p>
                                </div>
                                
                                <div class="social-icons">
                                
                                	<ul class="nomargin">
                                    
                <a href="https://www.facebook.com/"><i class="fa fa-facebook-square fa-3x social-fb" id="social"></i></a>
	            <a href="https://twitter.com/"><i class="fa fa-twitter-square fa-3x social-tw" id="social"></i></a>
	            <a href="https://plus.google.com/"><i class="fa fa-google-plus-square fa-3x social-gp" id="social"></i></a>
	            <a href="mailto:akash10a@gmail.com"><i class="fa fa-envelope-square fa-3x social-em" id="social"></i></a>
                                    
                                    </ul>
                                </div>
                    		</li>
                          </ul>
                       </div>
                </div>
</div>

</footer>

<!--header-->

<div class="footer-bottom">

	<div class="container">

		<div class="row">

			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">

				<div class="copyright">

					© 2018, Akash kumar, All rights reserved

				</div>

			</div>

			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">

				<div class="design">

					 <a href="#">NIIT </a> |  <a target="_blank" href="#">Web Design & Development by Akash kumar</a>

				</div>

			</div>

		</div>

	</div>

</div> 
</div>
      <div id="foot2section" style="padding-top:200px;">
      <footer class="footer1">
<div class="container">

<div class="row"><!-- row -->
            
                <div class="col-lg-3 col-md-3"><!-- widgets column left -->
                <ul class="list-unstyled clear-margins"><!-- widgets -->
                        
                        	<li class="widget-container widget_nav_menu"><!-- widgets list -->
                    
                                <h1 class="title-widget">Useful links</h1>
                                
                                <ul style="list-style:none;">
                                	<li><a class="nav-link" href="#foot1section"><i class="fa fa-angle-double-right"></i> Contact Us</a></li>
                                	<li><a class="nav-link" href="#foot2section"><i class="fa fa-angle-double-right"></i> About Us</a></li>
                                    
                                </ul>
                    
							</li>
                            
                        </ul>
                         
                      
                </div><!-- widgets column left end -->
                <div class="col-lg-3 col-md-3"></div>
                
             <div class="col-lg-6 col-md-6"><!-- widgets column center -->
                
                   
                    
                        <ul class="list-unstyled clear-margins"><!-- widgets -->
                        
                        	<li class="widget-container widget_recent_news"><!-- widgets list -->
                    
                                <h1 class="title-widget">About Us </h1>
                                
                                <div class="footerp"> 
                                
                                <h2 class="title-median">Akash kumar.</h2>
                                <p><b>Email id:</b> <a href="mailto:akash10a@gmail.com">akash10a@gmail.com</a></p>
                                <p><b>Phone Number </b>

    <b style="color:#ffc106;">(9AM to 8PM):</b>  +91-8960992608  </p>
    
    <p><b>Phone Numbers : </b>+91-8960992608 </p>
    <p><b>Role At NIIT :</b><b>DT-Faculty</b></p>
                                </div>
                                
                                <div class="social-icons">
                                
                                	<ul class="nomargin">
                                    
                <a href="https://www.facebook.com/"><i class="fa fa-facebook-square fa-3x social-fb" id="social"></i></a>
	            <a href="https://twitter.com/"><i class="fa fa-twitter-square fa-3x social-tw" id="social"></i></a>
	            <a href="https://plus.google.com/"><i class="fa fa-google-plus-square fa-3x social-gp" id="social"></i></a>
	            <a href="mailto:akash10a@gmail.com"><i class="fa fa-envelope-square fa-3x social-em" id="social"></i></a>
                                    
                                    </ul>
                                </div>
                    		</li>
                          </ul>
                       </div>
                </div>
</div>

</footer>

<!--header-->

<div class="footer-bottom">

	<div class="container">

		<div class="row">

			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">

				<div class="copyright">

					© 2018, Akash kumar, All rights reserved

				</div>

			</div>

			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">

				<div class="design">

					 <a href="#">NIIT </a> |  <a target="_blank" href="#">Web Design & Development by Akash kumar</a>

				</div>

			</div>

		</div>

	</div>

</div> 
</div>

   </main>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js" integrity="sha384-a5N7Y/aK3qNeh15eJKGWxsqtnX/wWdSZSKp+81YjTmS15nvnvxKHuzaWwXHDli+4" crossorigin="anonymous"></script>
  </body>
</html>
