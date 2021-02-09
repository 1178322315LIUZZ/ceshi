<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
     <link href="<%=request.getContextPath()%>/css/index3.css" rel="stylesheet">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.2.1.js"></script>
    <link rel="stylesheet" type="text/css" href="/bootstrap-4.4.1-dist/css/bootstrap.min.css"/>
    <script type="text/javascript" src="/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.validate.js"></script>
</head>
<body>
    <table class="table">
        <tr>
            <td>编号</td>
            <td>年龄</td>
            <td>邮箱</td>
            <td>姓名</td>
            <td>密码</td>
            <td>电话</td>
        </tr>
        <c:forEach items="${g }" var="c">
            <tr>
                <td>${c.id }</td>
                <td>${c.age }</td>
                <td>${c.email }</td>
                <td>${c.name }</td>
                <td>${c.password }</td>
                <td>${c.phone }</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
