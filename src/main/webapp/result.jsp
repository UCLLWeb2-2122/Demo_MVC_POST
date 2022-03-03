<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Guess</title>
</head>
<body>

<h2>Thinking of a number...</h2>

<p id="result">You guessed <%=request.getParameter("guess")%>...</p>
<h2><%= request.getAttribute("result") %>
</h2>
<a href="form.jsp">Guess again</a>

</body>
</html>