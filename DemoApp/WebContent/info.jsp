<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info</title>
</head>
<body>

	<div style="width: 740px; margin: auto;">
		Thank you!
		<%=request.getParameter("name")%>
		<br /> for contacting us. We should receive reply from us with in 24
		hrs in <br /> your email address
		<%=request.getParameter("email")%>
		. Let us know in our support email
	    <%=request.getAttribute("supportEmail")%>
		if you do not receive reply within 24 hrs.
	</div>

</body>
</html>

