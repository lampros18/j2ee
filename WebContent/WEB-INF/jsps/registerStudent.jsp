<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Φοιτητής</title>
</head>
<body>

	<a href="${pageContext.request.contextPath}/">Home</a>
	<br />
	<br/>


	<table>
		<form method="POST"
			action="${pageContext.request.contextPath}/insertStudent">
			<tr>
				<td>Όνομα Φοιτητή:</td>
				<td><input name="name" type="text"></td>
			</tr>
	
			<tr>
				<td>Επώνυμο Φοιτητή:</td>
				<td><input name="surname" type="text"></td>
			</tr>
	
			<tr>
				<td>email:</td>
				<td><input name="email" type="text"></td>
			</tr>
	
			<tr>
	
				<td><input value="Εγγραφή φοιτητή" type="submit"></td>
			</tr>

		</form>
	</table>




</body>
</html>