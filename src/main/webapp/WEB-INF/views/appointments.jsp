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

    <h1> Appointments </h1>

    <table>
            <th>Date</th>
            <th>Name</th>
            <th>Pet Type</th>
            <c:forEach items="${appointmentsList}" var="item">
                <tr>
                    <td>${item.getDate()}</td>
                    <td>${item.getFullName()}</td>
                    <td>${item.getPetType()}</td>
                </tr>
            </c:forEach>
        </table>

    <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>