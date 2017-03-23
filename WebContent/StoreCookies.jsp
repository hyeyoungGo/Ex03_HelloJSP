<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쿠키 데이터 저장하기</title>
</head>
<body>
<%
	response.addCookie(new Cookie("NAME", "HONG"));
	response.addCookie(new Cookie("GENDER", "M	ALE"));
	response.addCookie(new Cookie("AGE", "23"));
	response.addCookie(new Cookie("LANGUAGE", "JAVA"));
	response.addCookie(new Cookie("ADDRESS","SOULE"));
%>
	<h2>쿠키 데이터가 저장되었습니다.</h2>
</body>
</html>