<%--
  Created by IntelliJ IDEA.
  User: boyng
  Date: 19/11/2022
  Time: 12:31 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>JSP Page</title>
  </head>
  <body>
        <h1>Login form</h1>
        <form action="login" method="post">
            username: <input type="text" name="username">
            password: <input type="text" name="password">
            <input type="submit" value="login">
        </form>
  </body>
</html>
