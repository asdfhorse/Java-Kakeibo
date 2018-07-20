<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>ログイン画面</title>
</head>
<body>
	<form action="/Kakeibo/LoginCheck" method="post">
	ユーザー名<input type="text" name="name"><br>
	Password<input type="password" name="pass">
	<input type="submit" value="ログイン"></form>
	<a href="/Kakeibo/Adduser">新規ユーザー登録はこちら</a>
</body>
</html>