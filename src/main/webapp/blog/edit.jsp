<%@page pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<c:import url="/layout.jsp">
<c:param name="title" value="Blog(Slim3)"/>
<c:param name="content">
  <ul>
<c:forEach var="e" items="${f:errors()}">
<li class="bg-danger">${f:h(e)}</li>
</c:forEach>
</ul>
<form action="${f:url('update')}" method="post" role="form">
<input type="hidden" ${f:hidden("key")}/>
<input type="hidden" ${f:hidden("version")}/>
<div class="form-group">
    <label for="title">Title</label>
    <input type="text" ${f:text("title")} class="form-control"/>
  </div>
  <div class="form-group">
    <label for="content">Content</label>
    <textarea name="content" class="form-control">${f:h(content)}</textarea>
  </div>
<input type="submit" value="Update" class="btn btn-default"/>
</form>
</c:param>
</c:import>