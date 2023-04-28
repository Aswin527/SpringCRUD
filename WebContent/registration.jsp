<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>Student Registration</h1>
	<form action="">
	<table>
		<tr>
			<td>Student Name:</td>
			<td><input type="text" name="sname"></td>
		</tr>
		<tr>
			<td>Student Address: </td>
			<td><input type="text" name="saddress"></td>
		</tr>
		<tr>
			<td>Course:</td>
			<td> 
				<select name="scourse">
					<option value="Btech">Btech</option>
					<option value="BCom">BCom</option>
					<option value="BCA">BCA</option>
					<option value="Mtech">Mtech</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Place:</td>
			<td><input type="text" name="splace"></td>
		</tr>
		<tr>
			<td>Age:</td>
			<td><input type="number" name="sage"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Go"></td>
		</tr>
	</table>   
	</form>
</body>
</html>