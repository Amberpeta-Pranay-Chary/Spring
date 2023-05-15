<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Customer Form</title>
<style type="text/css">
.error{
color:red;
}
</style>
</head>
<body>
		<form:form action="processForm" modelAttribute="customer">
		First Name : <form:input type="text" path="firstName"/><br>
		Last Name(*) : <form:input type="text" path="lastName"/><br>
		Free passes : <form:input type="text" path="freePasses"/><br>
		Postal Code : <form:input type="text" path="postalCode"/><br>
		<form:errors path="lastName" cssClass="error"/>
		<form:errors path="freePasses" cssClass="error"/>
		<form:errors path="postalCode" cssClass="error"/>
		<br>
		<input type="submit"/>
		</form:form>
</body>
</html>