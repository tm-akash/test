<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix ="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grocery</title>
</head>
<body>

    <header>
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="#">Grocery</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#section1"><span class="fa fa-home">&nbsp;</span>Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#section2"><span class="fa fa-user-plus">&nbsp;</span>Register</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#section3"><span class="fa fa-sign-in">&nbsp;</span>Sign In</a>
            </li>
            <li class="nav-item">
            	<a class="nav-link" href="${pageContext.request.contextPath}/admin">Admin</a></li>
            <li class="nav-item dropdown">
      			<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">Category</a>
      				<div class="dropdown-menu">
        				<a class="dropdown-item" href="#section41">Daily Eatables</a>
        				<a class="dropdown-item" href="#section42">Food Grains</a>
        				<a class="dropdown-item" href="#section43">Others	</a>
      				</div>
      		</li>		
          </ul>
        </div>
      </nav>
    </header>

</body>
</html>