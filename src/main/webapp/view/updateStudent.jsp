<%--
  Created by IntelliJ IDEA.
  User: dguan
  Date: 7/29/2021
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Update Student</title>
</head>
<body>
<form method="post" action="/SSM_CRUD/student/updateStudent">
    Student ID: <br>
    <input name="stuid" value="${student.stuid}"><br>
    Student Name: <br>
    <input name="stuname" value="${student.stuname}"><br>
    Student Age: <br>
    <input name="age" value="${student.age}"><br>
    Student Gender: <br>
    <input name="gender" value="${student.gender}"><br>
    Student MajorID: <br>
    <input name="major_id" value="${student.major_id}"><br>
    <input type="submit" value="Save">
</form>
</body>
</html>
