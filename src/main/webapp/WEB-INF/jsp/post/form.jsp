<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>



<div class="field">
	Title:<br /> <input type="text" name="post.title"
		value="${post.title}" />
</div>
<div class="field">
	Body:<br /> <input type="text" name="post.body" value="${post.body}" />
</div>

<div class="actions">
	<button type="submit">send</button>
</div>