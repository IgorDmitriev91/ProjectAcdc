<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ты проиграл</title>
</head>
<body>
<h1>${requestScope.answer}</h1>

<h2>Сожалеем вы проиграли, хотите начать заново?</h2>
<form action="first" method="GET">
    <input type="submit" value="Рестарт">
</form>
</body>
</html>
