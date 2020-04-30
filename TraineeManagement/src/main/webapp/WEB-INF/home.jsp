<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trainee Management System</title>
</head>
<body>

<form action="viewHomePage">
<div align="center">
<h1>Trainee Management System</h1>
    <h3>Pick your operation</h3>
    <br/><br/>
    <table border="1" cellpadding="10">
        <thead>
            <tr>
              <tr>  <th><a href="/addtrainee">Add a trainee</a></th> </tr>
                <tr> <th><a href="/show-trainee">Delete a trainee</a></th></br> </tr>
                <tr> <th><a href="/show-trainee">Modify a trainee</a></th></br> </tr>
               <!--  <tr> <th><a href="/#">Retrieve a trainee</a></th></br> </tr>-->
                <tr> <th><a href="/show-trainee">Retrieve all trainee</a></th> </tr>
            </tr>
        </thead>
    </table>
</div>    


</form>
</body>
</html>