<%--
  Created by IntelliJ IDEA.
  User: CONG
  Date: 6/11/2021
  Time: 1:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/result">
    <input name="firstNumber" placeholder="firstNumber">
    <input name="secondNumber" placeholder="secondNumber">
    <c:if test="${not empty result}">
      <p>result: ${result}</p>
    </c:if>
    <button type="submit" name="cal" value="+">Addition(+)</button>
    <button type="submit" name="cal" value="-">Subtraction(-)</button>
    <button type="submit" name="cal" value="*">Multiplication(*)</button>
    <button type="submit" name="cal" value="/">Division(/)</button>
  </form>
  </body>
</html>
