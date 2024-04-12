<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Начало квеста</title>
</head>
<body>
<h1>Ты потерял память. Принять вызов НЛО?</h1>
<form action="first" method="post">
    <input type="hidden" name="answer" value="Принять1">
    <input type="submit" value="Принять вызов">
</form>
<form action="first" method="post">
    <input type="hidden" name="answer" value="Отклонить">
    <input type="submit" value="Отклонить вызов">
</form>

</body>
</html>