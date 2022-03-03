<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>

<p>Guess the number I have in mind:</p>

<form action="Guess" method="POST">
    <label for="myGuess">My Guess: </label>
    <input type="number" id="myGuess" name="guess">
    <input id="guessButton" type="submit" value="Take a guess">
</form>

</body>
</html>