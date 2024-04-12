<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Финальный вопрос</title>
</head>
<body>
<h1>Ты поднялся на мостик. Ты кто?</h1>
<form action="first" method="post">
    <input type="hidden" name="answer" value="Принять3">
    <input type="submit" value="Рассказать правду о себе">
</form>
<form action="first" method="post">
    <input type="hidden" name="answer" value="Отклонить">
    <input type="submit" value="Солгать о себе">
</form>
</body>
</html>