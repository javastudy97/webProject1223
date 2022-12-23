<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sessionId = (String)session.getAttribute("sessionId");

	if(sessionId==null){ //로그인이 안된 경우
		out.write("<script>");
		out.write("alert('로그인 후 이용해 주세요! 로그인페이지로 이동합니다.'); ");
		out.write("location.href='loginView.do';");
		out.write("</script>");
	}
%>                
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인성공</title>
</head>
<body>
	<div>
	<%=sessionId %>님 환영합니다~!! <br />
	즐거운 쇼핑 되세요!! <br />
	<a href="logoutOk.do">로그아웃</a>
	<a href="index.do">HOME</a>
	</div>
</body>
</html>