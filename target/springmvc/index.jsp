<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<body>
<h2>Hello World!</h2>

<form action="/testModelModelAttribute" method="post">
    <input type="hidden" name="id" value="1"/>
    username:<input type="text" name="username" value="tom"/><br>
    email:<input type="text" name="email" value="tom@163.com"/><br>
    age:<input type="text" name="age" value="22"/><br>
    <input type="submit" value="submit"/>
</form>

<br/><br/>
    <form action="/testConversionServiceConver" method="post">
        Employee : <input type="text" name="employee"/>
    </form>
<br/><br/>

<fmt:message key="i18n.username"></fmt:message>
<fmt:message key="i18n.password"></fmt:message>
</body>
</html>
