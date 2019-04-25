<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
    <meta charset="UTF-8">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
    <link rel="stylesheet" href="resources/stylesheets/index.css" type="text/css"/>
    <title>Pet Clinic | Home</title>
</head>

<body>
    <jsp:include page="nav.jsp"></jsp:include>
    <!-- <a href="/login"> Login </a> -->
    <h1> Login to enter the application </h1>
    <form>
        <input type="text" name="email" placeholder="email"> <br>
        <input type="password" name="password" placeholder="password"> <br>
        <input class="btn" type="submit" value="Submit">
    </form>
    <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>