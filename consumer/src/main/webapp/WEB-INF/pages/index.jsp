<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Hello</title>
</head>
<body>

	<h1>Consumer home page</h1>
	
	<form:form method="GET" action="startConsumer" >
		<input type="submit"  value="Start consumer"  >
	</form:form>
	
	<form:form method="GET" action="stopConsumer" >
		<input type="submit"  value="Stop consumer"  >
	</form:form>

</body>
</html>