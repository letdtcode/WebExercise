<%--
  Created by IntelliJ IDEA.
  User: boyng
  Date: 17/11/2022
  Time: 8:17 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thank you</title>
    <link rel ="stylesheet" href ="main.css" type ="text/css">
</head>
<body>
<h1>Thank for joining our email list</h1>
<p>Here is the information that you entered</p>

<label>Email:</label>
<span>${user.email}</span><br>

<label>First name:</label>
<span>${user.firstName}</span>	<br>

<label>Last Name:</label>
<span>${user.lastName}</span>

<p>To enter another email address, click on back button or the return button
    shown below</p>

<form action="" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>
</body>
</html>

