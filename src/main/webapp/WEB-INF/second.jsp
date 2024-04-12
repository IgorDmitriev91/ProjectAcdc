<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Завязка сюжета</title>
</head>
<body>
<h1>Ты принял вызов. Поднимаешься на мостик к капитану?</h1>
<form action="first" method="post">
  <input type="hidden" name="answer" value="Принять2">
  <input type="submit" value="Подняться на мостик">
</form>
<form action="first" method="post">
  <input type="hidden" name="answer" value="Отклонить">
  <input type="submit" value="Отказаться подниматься на мостик">
</form>
</body>
</html>