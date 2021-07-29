<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dguan
  Date: 7/29/2021
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<%--insert student--%>
<a href="/SSM_CRUD/view/insertStudent.jsp">Insert Student</a>
<table>
    <tr>
        <td>Student ID</td>
        <td>Student Name</td>
        <td>Student Age</td>
        <td>Student Gender</td>
        <td>Student MajorID</td>
        <td>Operations</td>
    </tr>
    <tbody>
    <c:forEach items="${studentList}" var="student">
        <tr>
            <td>${student.stuid}</td>
            <td>${student.stuname}</td>
            <td>${student.age}</td>
            <td>${student.gender}</td>
            <td>${student.major_id}</td>
            <td>
                <a href="/SSM_CRUD/student/deleteStudentByID?id=${student.stuid}">delete</a>
                <a href="/SSM_CRUD/student/fetchStudentByID?id=${student.stuid}">update</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
