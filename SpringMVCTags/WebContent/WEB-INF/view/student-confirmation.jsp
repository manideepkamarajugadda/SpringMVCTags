<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
		<title>Student Confirmation Page</title>
</head>


<body>
			The Student is Confirmed : ${student.firstName} ${student.lastName}	

	<br><br>
	
	Country : ${student.country} 
	
	<br><br>
	
	Favorite Course : ${student.favCourse }

<br><br>

	Favorite OS : 
	
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems }">
		
		<li>${temp }</li>
		</c:forEach>
	</ul>

</body>



</html>