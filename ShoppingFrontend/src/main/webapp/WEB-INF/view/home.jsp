<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

  <head>

<spring:url value="/resources/css" var="css"></spring:url>
<spring:url value="/resources/js" var="js"></spring:url>
<c:set value="${pageContext.request.contextPath}" var="contextRoot"></c:set>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shop Homepage - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/shop-homepage.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
  
<%@include file="./shared/nav.jsp" %>

    <!-- Page Content -->
    <c:if test="${userclickedhomepage==true}">
    <%@include file="pagecontent.jsp" %> 
    </c:if>
  
    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; rms 2018</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.min.js"></script>
    <script src="${js}/bootstrap.bundle.min.js"></script>

  </body>

</html>
