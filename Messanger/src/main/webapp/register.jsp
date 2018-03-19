<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="fbStyle.css">
<link href="https://fonts.googleapis.com/css?family=Julius+Sans+One"
	rel="stylesheet">
<title>Facebook - Naresh's</title>
</head>


<body>
	<div id="head">
		<p>Facebook</p>
	</div>
	<div id="content">
		<form action="DoRegister" method="post" autocomplete="on">
			<center>
				<table>
					<tr>
						<td>First Name</td>
						<td><input type="text" name="fName" required
							></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><input type="text" name="lName" required
							></td>
					</tr>
					<tr>
						<td>User Name</td>
						<td><input type="text" name="uName" required
							 minlength="8" maxlength="10"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="pWord" required
							minlength="6"> A-Z,a-z,0-9 and 10 characters
						</td>
					</tr>
					<tr>
						<td>State</td>
						<td><select name="state" required>
								<option value="tamilnadu" selected>Tamilnadu</option>
								<option value="andra">Andra</option>
								<option value="karnataka">Karnataka</option>
								<option value="kerala">Kerala</option>
						</select></td></tr>
					<tr><td colspan="2"><center><input type="submit" value="Register"></center></td></tr>
				</table>
		</form>
		</center>
	</div>
</body>
</html>
