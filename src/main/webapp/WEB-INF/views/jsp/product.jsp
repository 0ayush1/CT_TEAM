<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>


<html>
<head>
<title>Product List Page</title>
</head>
<body bgcolor="lightblue" modelAttribute="img" >

 <h1> Welcome to ComerceTools </h1>
 <h5>Name ${pd} </h5>



 <table>
             <tr>
                  <th> ID </th>
            </tr>
        <c:forEach items="${img}" var="item">
          <tr>
            <td><a href=/Product/${item.id}> ${item.masterData.current.name.get("en")} </a>
          </td>
          </tr>
        </c:forEach>
</table>


<table>
            <tr>
                  <th> SKU </th>
                  <th> URL </th>
            </tr>
 <c:forEach items="${img}" var="categoryLevel1">


     <c:forEach items="${categoryLevel1.masterData.current.variants}" var="categoryLevel2">


            <tr>
                <td>value="${categoryLevel2.sku}" /></td>
            </tr>

         <c:forEach items="${categoryLevel2.images}" var="categoryLevel3">
              <tr>
                   <td>value="${categoryLevel3.url}" /></td>
              </tr>
         </c:forEach>



     </c:forEach>



 </c:forEach>
</table>

</body>
</html>