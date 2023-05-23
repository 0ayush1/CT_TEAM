<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>


<html>
<head>
<title>Hello World</title>
</head>
<body>
  <div class="pdp">

     <div class="pdpImage">
     <img src="${pdsById}" width="100" height="120">
     </div>

      <div class="productName">
      <h2> Product Name : ${name}</h2>
      <h4>SKU :- ${pdSku} </h4>
      <h4>Price :- ${price} </h4>
      </div>




    </div>




</body>
</html>