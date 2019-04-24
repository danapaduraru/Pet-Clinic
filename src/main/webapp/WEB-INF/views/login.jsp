<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
<link rel="stylesheet" href="resources/stylesheets/index.css" type="text/css"/>
<title>Pet Clinic | Login</title>
</head>

<body>

    <div class="above-header"></div>

    <nav>
        <h1> Pet Clinic </h1>
        <p><em> Purrfect for your pet! </em></p>
        <a href="/"> Home </a>
        <a href="/veterinarians"> Veterinarians </a>
        <a href="/login"> Login </a>
    </nav>

    <h1> Login as a veterinarian </h1>
    <form>
        <input type="text" name="email" placeholder="email"> <br>
        <input type="text" name="password" placeholder="password"> <br>
        <input class="btn" type="submit" value="Submit">
    </form>

</body>

</html>