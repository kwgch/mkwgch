<%@page pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<c:import url="/layout.jsp">
<c:param name="title" value="Blog(Slim3)"/>
<c:param name="content">
<form action="${f:url('insert')}" method="post" role="form">
  <div class="form-group ${f:errorClass('title', 'has-error')}">
    <label for="title">Title</label>
    <input type="text" ${f:text("title")} class="form-control"/>
    <span class="${f:errorClass('title', 'bg-danger')}">${f:h(errors.title)}</span>
  </div>
  <div class="form-group ${f:errorClass('content', 'has-error')}">
    <label for="content">Content</label>
    <textarea name="content" class="form-control ${f:errorClass('content', 'err')}">${f:h(content)}</textarea>
    <span class="${f:errorClass('title', 'bg-danger')}">${f:h(errors.content)}</span>
  </div>
  <input type="submit" value="Insert" class="btn btn-default"/>
</form>
</c:param>
</c:import>