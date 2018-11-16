<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Support</title>
<style type="text/css">
body {
	
}

div {
	margin: 5px;
}
</style>
</head>
<body>
	<form action="support" method="Post">
		<div>
			Name:<input type="text" name="name">
		</div>
		<div>
			Email Address:<input type="text" name="email">
		</div>
		<div>
			Problem:<input type="text" name="problem">
		</div>
		<div>
			Problem Description:
			<textarea name="problemDescription" rows="10" cols="30" name="prbDescription"></textarea>
		</div>
		<div>
			<button type="submit">Help</button>
		</div>
	</form>
</body>
</html>