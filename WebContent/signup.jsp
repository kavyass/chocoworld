<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
<link rel="Stylesheet" href="signup.css">
<link href="https://fonts.googleapis.com/css?family=Abril+Fatface" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Berkshire+Swash" rel="stylesheet">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body id="body">
<div id="aa">
<h2>SIGN-UP FORM</h2>
<form id="form" action="SignupController" method ="post">
<table>
<tr>
<td>
Name:
</td>
<td>
<input type="text" name="name" placeholder="Enter your name" value="${name}">
</td>
<td><p style="color:red">${errors['name_error']}</p></td>
</tr>
<tr>
<td>
Password:
</td>
<td>
<input type="password" name="password" placeholder="Enter your password" value="${password}">
</td>
<td><p style="color:red">${errors['password_error']}</p></td>
</tr>
<tr>
<td>
Address:
</td>
<td>
<input type="text" name="address" placeholder="Enter your address" value="${address}">
</td>
<td><p style="color:red">${errors['address_error']}</p></td>
</tr>
<tr>
<td>
Phone no:
</td>
<td>
<input type="text" name="phone_no" placeholder="Enter your phone no" value="${phone_no}">
</td>
<td><p style="color:red">${errors['phone_no_error']}</p></td>
</tr>
<tr>
<td>
Email:
</td>
<td>
<input type="text" name="email" placeholder="Enter your email" value="${email}">
</td>
<td><p style="color:red">${errors['email_error']}</p></td>
</tr>
<tr>
<td>
<input type="submit" value="submit" >
</td>
</tr>


</table>


</form>

</div>
</body>
    