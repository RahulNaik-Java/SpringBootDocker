<%@include file="header.jsp" %>
<body>

	<div class="container mt-2">
	  <br>
      	<div align="left">
      		<h3 style="color:dark;">List of Your Todos:</h3>
      		<br>
      		<a href="/welcome" type="button" class="btn btn-warning btn-sm">Go Back</a><br><br>
      	</div>
      <table class="table">
        <thead class="table-success">
          <tr>
            <th>ID</th>
            <th>User</th>
            <th>Description</th>
            <th>Target Date</th>
          </tr>
        </thead>
        <tbody>
            <c:forEach var="todo" items="${todos}">
              <tr>
                <td>${todo.id}</td>
                <td>${todo.user}</td>
                <td>${todo.desc}</td>
                <td>${todo.targetDate}</td>
              </tr>
            </c:forEach>
        </tbody>
      </table>
    </div>
	<%@include file="footer.jsp" %>
</body>
</html>