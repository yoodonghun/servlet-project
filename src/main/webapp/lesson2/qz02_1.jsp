<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%-- 서버 --%>
    <h1>현재 시간은 <%= request.getParameter("time") %></h1>
    <h1>현재 시간은 <%= request.getParameter("date") %></h1>
</body>
</html>