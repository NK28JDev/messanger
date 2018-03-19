<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib
    prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" 
%>
<html>
<head>
<link rel="stylesheet" href="fbStyle.css">
<link href="https://fonts.googleapis.com/css?family=Julius+Sans+One"
	rel="stylesheet">
<title>Facebook - Naresh's</title>
</head>


<body>
	<div id="head">Facebook</div>
	<div id="content">
		<div id="inner">
			
			<br> <br> <br> <br> <br> <br>
			<form action="DoLogin" method="post" autocomplete="on">
				<center>
					<table class="login_table">
						<tr>
							<td id="l_id"><center>USER NAME</center></td>
							<td id="l_id"><input type="text" name="uName" autofocus
								required></td>
						</tr>
						<tr>
							<td id="l_id"><center>PASSWORD</center></td>
							<td id="l_id"><input type="password" name="pWord" required>
							</td>
						</tr>
						<tr></tr>
						<tr>
							<td id="l_id" colspan="2"><center>
									<input type="submit" value="Login">
								</center></td>
						</tr>
						<tr>
							<td><center>
									Not yet regiesterd? Sign up <a href="register.jsp">HERE</a>
								</center></td>
						</tr>
						
					</table>
				</center>
			</form><center><h3 style="color:red">
			<c:if test="${not empty error}">
				<c:out value="${error}" />
			</c:if></h3></center>
			
		</div>
	</div>

</body>
</html>
