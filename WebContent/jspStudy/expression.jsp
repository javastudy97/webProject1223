<%@page import="java.util.ArrayList"%>
<%@page import="org.project.dto.MemberDto2"%>
<%@page language="java" contentType= "text/html; charset=UTF-8" 
 pageEncoding="UTF-8" %>
 
 <%@page %>
   <%
	ArrayList<MemberDto2> members = new ArrayList<MemberDto2>();
   
   members.add(new MemberDto2("m1", "1111", "m1Name",11, "남자"));
   members.add(new MemberDto2("m2", "2111", "m2Name",21, "여자"));
   members.add(new MemberDto2("m3", "3111", "m3Name",31, "남자"));
   members.add(new MemberDto2("m4", "4111", "m4Name",41, "여자"));
   members.add(new MemberDto2("m5", "5111", "m5Name",51, "남자"));
   
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>expression(표현식)</title>
</head>
<body>
	<div>
		<ul>
		<%
			for(MemberDto2 list:members){
			%>
				<li>
					<span>아이디: <%=list.getUserId()%></span>
					<span>비밀번호: <%=list.getUserPw()%></span>
					<span>이름: <%=list.getUserName()%></span>
					<span>나이: <%=list.getAge()%></span>
					<span>성별: <%=list.getGender()%></span>
				</li>	
			<%
			}
		%>
		</ul>
	</div>
	<table>
		<%
			for(MemberDto2 list:members){
			%>
				<tr>
					<td>아이디: <%=list.getUserId()%></td>
					<td>비밀번호: <%=list.getUserPw()%></td>
					<td>이름: <%=list.getUserName()%></td>
					<td>나이: <%=list.getAge()%></td>
					<td>성별: <%=list.getGender()%></td>
				</tr>
			<%
			}
		%>
	</table>
</body>
</html>