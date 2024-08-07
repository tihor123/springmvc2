<%--
  Created by IntelliJ IDEA.
  User: RohitKumarSingh
  Date: 01-08-2024
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Student name is ${student.name}</h3>
<h3>Student id is ${student.id}</h3>
<h3>Student date of birth is ${student.date}</h3>
<h3>Student courses are ${student.courses}</h3>
<h3>Student is ${student.gender}</h3>
<hr>
<h3>Student address is ${student.address.street}, ${student.address.city}</h3>
</body>
</html>
