<%--
  Created by IntelliJ IDEA.
  User: boyng
  Date: 18/11/2022
  Time: 10:57 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
      <form action="calcu" method="post">
        <table>
          <tr>
            <td>First: </td>
            <td>
              <input type="text" name="a" value="${first}">
            </td>
          </tr>
          <tr>
            <td>Second: </td>
            <td>
              <input type="text" name="b" value="${second}">
            </td>
          </tr>
          <tr>
            <td>Operator: </td>
            <td>
              <select name="ope">
                <option ${add}>+</option>
                <option ${sub}>-</option>
                <option ${mul}>*</option>
                <option ${divv}>/</option>
              </select>
            </td>
          </tr>
          <tr>
            <td></td>
            <td>
              <button type="submit">Compute</button>
            </td>
          </tr>
          <tr>
            <td>Result: </td>
            <td>
              <input type="text" value="${r}">
            </td>
          </tr>
        </table>
      </form>
</body>
</html>
