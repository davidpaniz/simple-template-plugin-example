<form action="${pageContext.request.contextPath}/posts/${post.id}" method="post">
	<input type="hidden" name="_method" value="put" />
	
	<%@include file="form.jsp"%>
	
</form>
<a href="${pageContext.request.contextPath}/posts">Back</a>
