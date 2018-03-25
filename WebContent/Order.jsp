<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
<link rel="Stylesheet" href="Order.css">
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
${Faculty}
</head>
<body id="body" class="main">

<div id="aa">
<form action="Contact_us.jsp" id="form">
<table>

<tr>
<td>
Order No:
</td>
<td>
<input type="text" name="" value="${Facultyorder.order_no}" >
</td>
</tr>
<tr>
<td>
Name:
</td>
<td>
<input type="text" name="" value="${Faculty.name}">
</td>
</tr>
<tr>
<td>
Address:
</td>
<td>
<input type="text" name="" value=" ${Faculty.address}">
</td>
</tr>
<tr>
<td>
Phone no:
</td>
<td>
<input type="text" name="" value=" ${Faculty.phone_no}">
</td>
</tr>
<tr>
<td>
Email:
</td>
<td>
<input type="text"  name="" value=" ${Faculty.email}">
</td>
</tr>
<tr>
<td>
Ordered Item name:
</td>
<td>
<input type="text" name="" value="${iname}">
</td>
</tr>
<tr>
<td>
<input type="submit" value="order now" name="">
</td>
</tr>


</table>


</form>


</div>
</body>
