<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix ="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" >
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" >
    
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grocery</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<div class="container">
	
	<div class="page-header">
	</br>	
	</div>
	<div class="container">
	
	<div class="row">
		<div class="col-md-6">
			<div class="panel with-nav-tabs panel-primary">
				<div class="panel-heading">
					<ul class="nav nav-tabs">
					<li class="active"><a href="#tab1primary" data-toggle="tab">Category</a></li>
					<li> <a href="#tab2primary" data-toggle="tab">Supplier</a></li>
					<li> <a href="#tab3primary" data-toggle="tab">Product</a></li>
					</ul>				
				</div>
				
				<div class="panel-body">
				<div class="tab-context">
					<div class="tab-pane fade in active" id="tab1primary">
					<form method="post" action="<c:url value="/saveCat"/>" class="form-signin">
					<span id="reauth-email" class="reauth-email"></span>
					<h4 class="input_title"> Category Id </h4>
					<input class="form_control" type="number" name="cid" required/></td>
					<h4 class="input_title">Category Name</h4>
						<input class="form-control" type="text" name="categoryName" required/></td><br><br>
						<button class="btn btn-lg btn-primary" type="submit">Save</button>
						<button class="btn btn-lg btn-primary" type="reset">Cancel</button> 
					</form>
					</div>
				
					<div class="tab-pane fade" id="tab2primary">
					
					<form method="post" action="<c:url value="/saveSupp" /> " class="form-signin">
					<span id="reauth-email" class="reauth-email"></span>
					<h4 class="input_title"> Supplier Id </h4>
					<input class="form_control" type="number" name="sid" required/></td>
					<h4 class="input_title">Supplier Name</h4>
					<input class="form-control" type="text" name="supplierName" required/></td><br><br>
						<button class="btn btn-lg btn-primary" type="submit">Save</button>
						<button class="btn btn-lg btn-primary" type="reset">Cancel</button> 
					
					
					</form>
					
					</div>
					
					<div class="tab-pane fade" id="tab3primary">
					 
					<form method="post" action="<c:url value="/admin/saveP"/>" class="form-signin">
					<span id="reauth-email" class="reauth-email"></span>
					<tr>
					<td class="input_title">Product Name</td>
					<td> <input type="text" name="pName" required/></td>
					
					</tr>
					<br>
					<tr>
					<td class="input_title">Product Price</td>
					<td> <input type="text" name="pPrice" required/></td>
					
					</tr>
					<br>
					<tr>
					<td class="input_title">Product Description</td>
					<td> <input type="text" name="pDescription" required/></td>
					
					</tr>
					<br>
					<tr>
					<td class="input_title"> Product Stock</td>
					<td> <input type="text" name="pStock" required/></td>
					
					</tr>
					
					<div class="form-group">
					<td> Select Category</td>
					<td> <select class="form-control" name="pCategory" required>
					<option value="">---Category---</option>
					<c:forEach items="${catList}" var="cate">
						<option value="${cate.sid}"> ${cate.categoryName} </option></c:forEach>
					</select>
					
					
					</tr>
					<div class="form-group">
					<td> Select Supplier</td>
					<td> <select class="form-control" name="pSupplier" required>
					<option value="">---Supplier---</option>
					<c:forEach items="${satList}" var="cate">
						<option value="${sate.sid}"> ${sate.supplierName} </option></c:forEach>
					</select>
					</tr>
					
					</div>
					<br>
					<tr>
					<div class="fileinput fileinput-new" data-provides="fileinput">
					<tr>
					
					<td>Image</td>
					<td><input class="form-control" type="file" name="file" accept="image/*"></td>
					</tr>
					
					
					</div>
					</tr>
					
					<button class="btn btn-lg btn-primary" type="submit">Save</button>
					<button class="btn btn-lg btn-primary" type="reset">Cancel</button>
					
					
					</form>
					
					</div>
				</div>
				</div>
			</div>
		
		
		</div>
	
	</div>
	
	</div>



</div>



</body>
</html>