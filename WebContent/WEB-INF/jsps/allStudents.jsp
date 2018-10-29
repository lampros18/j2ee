<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Φοιτητές στη βάση</title>
</head>
<body>

<c:forEach var="row" items="${students}">

	Όνομα: ${row.name} 
	Επώνυμο ${row.surname} 
	email ${row.email} 

</c:forEach>


</body>
</html>