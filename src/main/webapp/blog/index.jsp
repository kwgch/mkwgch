<%@page pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<!-- Custom styles for this template -->
<link href="http://getbootstrap.com/examples/blog/blog.css" rel="stylesheet">
<c:import url="/layout.jsp">
<c:param name="title" value="Blog(Slim3)"/>
<c:param name="content">
<a href="${f:url('create')}" class="btn btn-primary btn-lg active" role="button">Create</a>
<div class="container">
  <div class="blog-header">
    <h1 class="blog-title">The Bootstrap Blog</h1>
    <p class="lead blog-description">The official example template of creating a blog with Bootstrap.</p>
  </div>
  <div class="row">
    <div class="col-sm-8 blog-main">
      <c:forEach var="e" items="${blogList}">
      <div class="blog-post">
        <h2 class="blog-post-title">${f:h(e.title)}</h2>
        <p>${f:br(f:nbsp(f:h(e.content)))}</p>
        <c:set var="editUrl" value="edit/${f:h(e.key)}/${e.version}"/>
        <c:set var="deleteUrl" value="delete/${f:h(e.key)}/${e.version}"/>
        <a href="${f:url(editUrl)}" class="btn btn-primary btn-lg active" role="button">Edit</a>
        <a href="${f:url(deleteUrl)}" onclick="return confirm('delete OK?')" class="btn btn-warning btn-lg active" role="button">Delete</a>
      </div>
      </c:forEach>
    </div>
  </div>
</div>
</c:param>
</c:import>