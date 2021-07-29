<%--
  Created by IntelliJ IDEA.
  User: dguan
  Date: 7/29/2021
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Student</title>
</head>
<body>
<form method="post" action="/SSM_CRUD/student/insertStudent">
    Student ID: <br>
    <input name="stuid"><br>
    Student Name: <br>
    <input name="stuname"><br>
    Student Age: <br>
    <input name="age"><br>
    Student Gender: <br>
    <input name="gender"><br>
    Student MajorID: <br>
    <input name="major_id"><br>
    <input type="submit" value="Save">
</form>
</body>
</html>
