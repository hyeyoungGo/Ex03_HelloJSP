<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<HTML>
	<HEAD><title>쿠키 데이터 수정하기</title></HEAD>
	<BODY>
	<% response.addCookie(new Cookie("AGE","16")); %>
		AGE쿠키에 새로운 값이 저장되었습니다.
	</BODY>
</HTML>

