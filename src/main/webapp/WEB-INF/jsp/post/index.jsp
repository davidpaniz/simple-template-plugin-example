	<h1>Listing Posts</h1>

	<table>
		<tr>
			<th>Title</th>
			<th>Body</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${postList}" var="post">
			<tr>
				<td>${post.title}</td>
				<td>${post.body}</td>
				<td><a href="${pageContext.request.contextPath}/posts/${post.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/posts/${post.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/posts/${post.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/posts/new">New Post</a> 