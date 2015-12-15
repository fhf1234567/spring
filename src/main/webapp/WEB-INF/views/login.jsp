<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/12/15
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${!empty error}">
        <font color="red"><c:out value="${error}"/></font> <br/>
    </c:if>

    <form action="<c:url value='/admin/loginCheck.html'/>" method="post">
        用户名: <input type="text" name="userName" id="userName" value=""/>
        <br/>
        密码: <input type="password" name="password" id="password" value=""/>
        <br/>
        <input type="submit" value="submit"/>
        <input type="reset" value="reset"/>
    </form>
</body>
</html>
