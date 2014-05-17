<!DOCTYPE html>
<%@page pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    <!-- Optional theme -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
    
    <!-- Custom styles for this template -->
    <link href="//getbootstrap.com/examples/dashboard/dashboard.css" rel="stylesheet">
    
    <link href="//getbootstrap.com/2.3.2/assets/css/bootstrap-responsive.css" rel="stylesheet">
    
    <link href="//getbootstrap.com/examples/sticky-footer-navbar/sticky-footer-navbar.css" rel="stylesheet">
    
    <title>${param.title}</title>
    <!--<link rel="stylesheet" type="text/css" href="/css/global.css" />-->
  </head>
  <body>
    <div class="container-fluid">
      <div class="row">
        <c:import url="/header.jsp"/>
        <c:import url="/menu.jsp" />
        <div id="main" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          ${param.content}
        </div>
        <c:import url="/footer.jsp" />
      </div>
    </div>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <!-- Latest compiled and minified JavaScript -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
  </body>
</html>