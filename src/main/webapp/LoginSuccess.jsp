<%--
  Created by IntelliJ IDEA.
  User: revatitekale
  Date: 25/04/20
  Time: 2:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html"; charset="US-ASCII">
</head>
<body>
<h1>Hi <%= request.getAttribute("user") %>, Login successful.</h1>
<a href="login.html">Login Page</a>
</body>
</html>
