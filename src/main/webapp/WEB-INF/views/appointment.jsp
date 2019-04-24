<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
<link rel="stylesheet" href="resources/stylesheets/index.css" type="text/css"/>
<title>Pet Clinic | Make an appointment</title>
</head>

<body>
    <jsp:include page="nav.jsp"></jsp:include>

    <h1> Make an appointment </h1>
    <form>
        <div class="wrapper-grid">
        <label>Full Name</label>
        <input type="text" name="fullname" placeholder="Full Name">
        <label>Email</label>
        <input type="text" name="email" placeholder="Email">
        <label>Telephone</label>
        <input type="text" name="telephone" placeholder="Telephone">
        <label>Preferred Date</label>
        <input type="date" name="date">
        <label>Pet Type</label>
        <select>
            <option value="" disabled selected>Choose pet type</option>
            <option value="dog">Dog</option>
            <option value="cat">Cat</option>
            <option value="rodent">Rodent</option>
            <option value="horse">Horse</option>
            <option value="bird">Bird</option>
            <option value="fish">Fish</option>
            <option value="other">Other(please specify down below)</option>
        </select>
        <label>Description</label>
        <textarea cols="50" placeholder="Description (symptoms, other illnesses)" rows="4"></textarea>
        </div>
        <input class="btn" type="submit" value="Submit">
    </form>

    <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>