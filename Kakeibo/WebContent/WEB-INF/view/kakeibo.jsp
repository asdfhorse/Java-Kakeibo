<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>家計簿システム</title>
</head>
<body>
	<h1><a href="/Kakeibo/Sisyutu">支出</a></h1>
	<h1><a href="/Kakeibo/Syunyu">収入</a></h1>
	<form action="/Kakeibo/AddSpending">
	日にち<input type="text" placeholder="入力例:0000年00月00日" name="day"><br>
	人物<input type="text" name="human">1:全員 2:父 3:母<br>
	項目<input type="text" name="items">1:食費 2:生活費 3:交通費 4:家賃 5:光熱費 6:給料 7:その他<br>
	支出・収入<input type="text" name="kubetu">0:支出 1:収入<br>
	金額<input type="text" name="money"><br>
	メモ<input type="text"  name="memo"><br>
	<input type="submit" value="登録">
	</form>
</body>
</html>