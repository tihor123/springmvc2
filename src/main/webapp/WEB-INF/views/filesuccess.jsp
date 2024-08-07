<%--
  Created by IntelliJ IDEA.
  User: RohitKumarSingh
  Date: 05-08-2024
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>File upload status</title>
</head>
<body>
<h2>${msg}</h2>
<img src="<c:url value="/resources/images/${filename}"/>" alt="profile image">
</body>
</html>
