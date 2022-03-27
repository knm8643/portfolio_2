<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<meta charset="UTF-8">
<title>SignUp</title>
</head>
<body>
	<form action="/Member/MemberSignUp" method="get">
		<table border=1 align="center">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td>비밀번호중복체크</td>
				<td><input type="password"></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="number" name="age"></td>
			</tr>
			<tr>
				<td colspan=2 align="center">
					<button type="submit">등록</button>
					<button type="reset">초기화</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>