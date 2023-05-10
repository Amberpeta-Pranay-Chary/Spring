<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name : <form:input path="firstName"/><br>
		Last Name : <form:input path="lastName"/><br>
		<form:radiobutton path="favoriteLanguage" value="JAVA"/>Java
		<form:radiobutton path="favoriteLanguage" value="C++"/>C++
		<form:radiobutton path="favoriteLanguage" value="Python"/>Python
		<form:radiobutton path="favoriteLanguage" value="Ruby"/>Ruby
		
		<input type="submit" value="submit"/>
	</form:form>
</body>
</html>