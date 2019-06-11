<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
		<title>Student Registration Form</title>
</head>


<body>
		<form:form action="processForm" modelAttribute="student">
		
		First name : <form:input path ="firstName"/>
		<br><br>
		
		Last name : <form:input path ="lastName"/>
		<br><br>
		
		Country:
		<form:select path= "country">
		
			<form:options items= "${student.countryOptions}"  />
			
		</form:select>
		
		<br><br>
		
		Favourite course: 
		
		Computer Science <form:radiobutton path="favCourse" value="Computer Science"/>
			Art <form:radiobutton path="favCourse" value="Art"/>
			Music <form:radiobutton path="favCourse" value="Music"/>
			Business <form:radiobutton path="favCourse" value="Business"/>
		
		<br><br>
		
		Favourite OS :
		
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
		
		
		<br><br>
		<input type="submit" value="submit"/>
		
		
		
		</form:form>
			
</body>



</html>