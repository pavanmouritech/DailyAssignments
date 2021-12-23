<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<h1>Registration Page</h1>
</head>		
		<p>Please fill in the form to create an account.</p>
<body bgcolor="Lightskyblue"></body>
<br>
	<label>
	Name:
	</label>
	<input type="text" placeholder="Enter Name" name="name" size="15"/><br> <br>
	<label>
	Gender:
	</label><br>
			<input type="radio" name="male"/> Male <br>
			<input type="radio" name="female"/> Female <br>
			<input type="radio" name="other"/> Other <br><br>
	<form>	
		Address: <input type="text" placeholder="Enter Address" name="address" size="15"><br><br>
		Phone: 	 <input type="text" name="country code" value="+91" size="2.5"/>
				 <input type="text" name="phone"  placeholder="Enter Number" size="15"><br> <br>
		State:   <input type="text" placeholder="Enter State" name="state" size="15"><br> <br>
		Country: <input type="text" placeholder="Enter Country" name="country" size="15"><br> <br>
	</form>
</html>