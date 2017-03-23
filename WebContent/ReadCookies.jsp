<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쿠키 데이터 읽기</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
%>

	<h2>이름 : <%=  getCookiesValue(cookies, "NAME") %></h2>
	<h2>성별 : <%=  getCookiesValue(cookies, "GENDER") %></h2>
	<h2>나이 : <%=  getCookiesValue(cookies, "AGE") %></h2>
	<h2>좋아하는 언어 : <%=  getCookiesValue(cookies, "LANGUAGE") %></h2>
	<h2>주소 : <%=  getCookiesValue(cookies, "ADDRESS") %></h2>
	
</body>
</html>

<%!
	private String getCookiesValue(Cookie[] cookies, String name) {
		String value = null;
		if(cookies == null) {
			return null;
		}
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals(name)){
				return cookie.getValue();
			}
		}
		return null;
}	
%>