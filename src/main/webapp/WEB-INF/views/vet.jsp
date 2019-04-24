<%@ page import="com.dp.petclinic.petclinic.services.VetService" %>
<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
<link rel="stylesheet" href="resources/stylesheets/index.css" type="text/css"/>
<title>Pet Clinic | Veterinarians</title>
</head>

<body>
    <jsp:include page="nav.jsp"></jsp:include>

    <h1> Veterinarians </h1>

    <div class="vets-list">
        <table>
            <th>Name</th>
            <th>Specialization</th>
            <th>Email</th>
            <th>Office Phone</th>
        <c:forEach items="${vetList}" var="item">
            <tr>
                <td>${item.getFullName()}</td>
                <td>${item.getSpecialization()}</td>
                <td>${item.getEmail()}</td>
                <td>${item.getTelephone()}</td>
            </tr>
        </c:forEach>
        </table>
    </div>

    <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>