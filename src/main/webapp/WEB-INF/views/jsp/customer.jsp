<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>


<html>
<head>
<title>Hello World</title>
</head>
<body modelAttribute="cus" modelAttribute"count">

 <h1> Welcome to ComerceTools </h1>
          <h3> Customer List </h3>
          <p> Total Customer : ${count} </p>

      <table>
         <tr>
                 <th> ID </th>
                 <th> Name </th>
                 <th> Email </th>
         </tr>
      <c:forEach items="${cus}" var="trainingProductData">
      <tr>
      <td>${trainingProductData.id}</td>
      <td>${trainingProductData.firstName}</td>
      <td>${trainingProductData.email}</td>
      </tr>
      </c:forEach>
      </table>
    </body>
</html>