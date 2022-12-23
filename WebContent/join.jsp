<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
<link rel="stylesheet" href="css/join.css" />
</head>
<body>
	<div id="wrap">
		<div class="header">
			<div class="nav">
				<h1 class="logo">
					<a href="index.do">LOGO</a>
				</h1>
				<div class="gnb">
					<ul>
						<li><a href="index.do">HOME</a></li>
						<li><a href="#">게시판</a></li>
						<li><a href="#">INFO</a></li>
						<li><a href="joinView.do">회원가입</a></li>
						<li><a href="loginView.do">로그인</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="join">
				<div class="join-con">
					<form action="memberInsert.do" method="POST" id="joinForm">
						<table>
							<tr>
								<th colspan="2">회원가입</th>
							</tr>
							<td><label for="userId">아이디</label></td>
							<td><input type="text" name="userId" id="userId"></td>
							<tr>
								<td><label for="userPw">비밀번호</label></td>
								<td><input type="password" name="userPw" id="userPw"></td>
							</tr>
							<tr>
								<td><label for="gender">성별</label></td>
								<td><input type="radio" name="gender" id="gender1"
									value="남자" checked>남자 <input type="radio" name="gender"
									id="gender2" value="여자">여자</td>
							</tr>
							<tr>
								<td><label for="hobbys">취미</label></td>
								<td><input type="checkbox" name="hobbys" id="hobby1"
									value="등산" checked>등산 <input type="checkbox"
									name="hobbys" id="hobby2" value="영화">영화 <input
									type="checkbox" name="hobbys" id="hobby3" value="게임">게임
									<input type="checkbox" name="hobbys" id="hobby4" value="여행">여행
								</td>
							</tr>
							<tr>
								<td><label for="city">출신고향</label></td>

								<td><select name="city" id="city" class="city">
										<option value="" selected>::출신고향선택::</option>
										<option value="서울">서울</option>
										<option value="부산">부산</option>
										<option value="대구">대구</option>
										<option value="인천">인천</option>
										<option value="광주">광주</option>
										<option value="경기">경기</option>
								</select></td>
							</tr>
							<tr>
								<td colspan="2"><label for="memo">자기소개</label></td>
							</tr>
							<tr>
								<td colspan="2">
								<textarea name="memo" id="memo" cols="50"rows="10"></textarea>
								</td>
							</tr>
							<tr class="lastTr">
								<td colspan="2">
								<input type="reset" value="초기화"> 
								<input type="submit" value="회원가입 실행">
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
		<div class="footer">
			<div class="footer-con">FOOTER</div>
		</div>
	</div>
</body>
</html>