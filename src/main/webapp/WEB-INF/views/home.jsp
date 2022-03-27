<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<meta charset="UTF-8">
<head>
<title>Test main</title>
<style>
a {
	text-decoration: none
}
</style>
</head>
<body>
	<table border=1 align="center">
		<tr>
			<th colspan=3>CRUD복습
		</tr>
		<c:choose>
			<c:when test="${empty name}">
				<form action="Login" method="post">
				<tr>
					<td>이름
					<td colspan=2><input type="text" name="name">
				</tr>
				<tr>
					<td>비밀번호
					<td colspan=2><input type="password" name="pass">
				</tr>
				<tr align="center">
					<td colspan=3>
						<button type="submit">로그인</button>
						<button type="button" onclick="location.href='SignUp';">회원가입</button>
				</tr>
				</form>
			</c:when>

			<c:when test="${name != null}">
				<tr>
					<td><a href="BoardList">게시판</a>
					<td><a href="LogOut">로그아웃</a>
					<td><a href="Update">정보수정</a>
				</tr>
			</c:when>
		</c:choose>
	</table>
</body>
</html>
