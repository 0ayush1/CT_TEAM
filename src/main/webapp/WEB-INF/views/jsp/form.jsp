<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>User Registration</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <div align="center">
        <h2>User Registration</h2>
        <form:form action="qwerty" method="POST" modelAttribute="form">
            <form:label path="customerId">Customer ID</form:label>
            <form:input path="customerId"/>
            <form:errors path="customerId" cssClass="error" />

            <br/>

            <form:label path="externalId">External ID:</form:label>
            <form:input path="externalId"/>
            <form:errors path="externalId" cssClass="error" />

            <br/>

            <form:label path="title">Title</form:label>
            <form:input path="title"/>
            <form:errors path="title" cssClass="error" />

            <br/>

            <form:label path="firstName">First Name</form:label>
            <form:input path="firstName"/>
            <form:errors path="firstName" cssClass="error" />

            <br/>

            <form:label path="lastName">Last Name</form:label>
            <form:input path="lastName"/>
            <form:errors path="lastName" cssClass="error" />

            <br/>

            <form:label path="email">Email:</form:label>
            <form:input path="email"/>
            <form:errors path="email" cssClass="error" />

            <br/>

            <form:label path="password">Password:</form:label>
            <form:password path="password"/>
            <form:errors path="password" cssClass="error" />

            <br/>

            <form:label path="company">Company Name:</form:label>
            <form:input path="company"/>
            <form:errors path="company" cssClass="error" />

            <br/>

            <form:button>Register</form:button>
        </form:form>
    </div>
</body>
</html>
