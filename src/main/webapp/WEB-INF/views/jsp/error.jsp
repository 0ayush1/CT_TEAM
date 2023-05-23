<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
    <h1>Error</h1>

    <%-- Display validation error messages --%>
    <c:if test="${not empty errors}">
        <ul>
            <c:forEach items="${errors}" var="error">
                <li>${error.defaultMessage}</li>
            </c:forEach>
        </ul>
    </c:if>
     <form:form action="qwerty" method="POST" modelAttribute="form">
                <form:label path="customerId">Customer ID</form:label>
                <form:input path="customerId"/>
                <form:errors path="customerId" cssClass="error" />
     </form:form>


    <%-- Add any additional error handling or content as needed --%>
</body>
</html>
