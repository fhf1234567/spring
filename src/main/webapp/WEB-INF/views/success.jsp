<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/11/25
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
success jsp page hello <br/>

request user:${requestScope.user}<br/>
session user:${sessionScope.user}<br/>
request school : ${requestScope.school}<br/>
session school : ${sessionScope.school}<br/>
</body>
</html>
