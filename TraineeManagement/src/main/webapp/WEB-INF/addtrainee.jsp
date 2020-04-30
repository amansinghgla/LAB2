<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Trainee Management | home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Add Trainee</title>
</head>
<body>
	<c:choose>
		<c:when test="${mode=='MODE_REGISTER' }">
			<div class="container text-center">
			<h1>Trainee Management System</h1>
				<h3>Add New Trainee</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-trainee">
					<div class="form-group">
						 <label class="control-label col-md-3">Trainee Id</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="traineeid"
								value="${trainee.traineeid }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Trainee Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="traineename"
								value="${trainee.traineename }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Trainee Location </label>
						<div class="col-md-3">
							<!--<input type="radio" class="form-control" id="traineelocation"
								name="traineelocation" value="${trainee.traineelocation }">
							<label for="Chennai">Chennai</label> 
							
							<input type="radio" class="form-control" id="traineelocation" 
							name="traineelocation" value="${trainee.traineelocation }"> 
							<label for="Bangalore">Bangalore</label> 
							
							<input type="radio" class="form-control" id="traineelocation" 
							name="traineelocation" value="${trainee.traineelocation }">
							 <label for="Pune">Pune</label>
							 
							<input type="radio" class="form-control" id="traineelocation"
								name="traineelocation" value="${trainee.traineelocation }">
							<label for="Mumbai">Mumbai</label>--> 
							
							<input type="text" class="form-control" name="traineelocation"
								value="${trainee.traineelocation }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Trainee Domain</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="traineedomain"
								value="${trainee.traineedomain }" />
						</div>
					</div>

					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Register" />
					</div>
				</form>
			</div>
		</c:when>

		<c:when test="${mode=='ALL_USERS' }">
			<div class="container text-center" id="tasksDiv">
			<h1>Trainee Management System</h1>
				<h3>All Trainees</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Trainee Id</th>
								<th>Trainee Name</th>
								<th>Trainee Location</th>
								<th>Trainee Domain</th>
								<th>Delete</th>
								<th>Edit</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach var="trainee" items="${trainees }">
								<tr>
									<td>${trainee.traineeid}</td>
									<td>${trainee.traineename}</td>
									<td>${trainee.traineelocation}</td>
									<td>${trainee.traineedomain}</td>
									<td><a href="/delete-trainee?traineeid=${trainee.traineeid }"><span
											class="glyphicon glyphicon-trash"></span></a></td>
									<td><a href="/edit-trainee?traineeid=${trainee.traineeid }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>

								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_UPDATE' }">
			<div class="container text-center">
			<h1>Trainee Management System</h1>
				<h3>Update Trainee</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-trainee">
					<div class="form-group">
						<label class="control-label col-md-3">Trainee Id</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="traineeid"
								value="${trainee.traineeid }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Trainee Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="traineename"
								value="${trainee.traineename }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Trainee Location </label>
						<div class="col-md-3">
							<!-- <input type="radio" class="form-control" id="traineelocation"
								name="traineelocation" value="${trainee.traineelocation }">
							<label for="Chennai">Chennai</label> 
							
							<input type="radio" class="form-control" id="traineelocation" 
							name="traineelocation" value="${trainee.traineelocation }"> 
							<label for="Bangalore">Bangalore</label> 
							
							<input type="radio" class="form-control" id="traineelocation" 
							name="traineelocation" value="${trainee.traineelocation }"> 
							<label for="Pune">Pune</label>
							
							<input type="radio" class="form-control" id="traineelocation"
								name="traineelocation" value="${trainee.traineelocation }">
							<label for="Mumbai">Mumbai</label> --> 
							
							<input type="text" class="form-control" name="traineelocation"
								value="${trainee.traineelocation }" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Trainee Domain</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="traineedomain"
								value="${trainee.traineedomain }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Update" />
					</div>
				</form>
			</div>
		</c:when>
		
		<c:when test="${mode=='MODE_LOGIN' }">
			<div class="container text-center">
			<h1>Trainee Management System</h1>
				<h3>Admin Login</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="/login">
					<c:if test="${not empty error }">
						<div class= "alert alert-danger">
							<c:out value="${error }"></c:out>
							</div>
					</c:if>
					<div class="form-group">
						<label class="control-label col-md-3">Username</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="username"
								value="${user.username }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Password</label>
						<div class="col-md-7">
							<input type="password" class="form-control" name="password"
								value="${user.password }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Login" />
					</div>
					</form>
					</div>
					</c:when>



	</c:choose>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>