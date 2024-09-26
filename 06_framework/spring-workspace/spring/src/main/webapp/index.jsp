<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello spring</h1>
	<%-- main.jsp 페이지로 포워딩 --%>
	<jsp:forward page="WEB-INF/views/main.jsp"/> <!-- 포워딩 하는 방법 -->
</body>
</html>