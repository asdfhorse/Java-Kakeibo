<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dto.Spending"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>収入</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		ArrayList<Spending> SpendingList1 = (ArrayList<Spending>) request.getAttribute("syunyu");
	%>
	<h1>家計簿・収入</h1>
	<table border="1">
		<tr>
			<th>日</th>
			<th>人物</th>
			<th>項目</th>
			<th>金額</th>
			<th>メモ</th>
		</tr>
		<%
			for (Spending sp : SpendingList1) {
		%>
		<tr align="center">
			<td><%=sp.getDay()%></td>
			<%if(sp.getHid() == 1)	{%>
			<td>全員</td>
			<%} %>
			<%if(sp.getHid() == 2) {%>
			<td>父</td>
			<%} %>
			<%if(sp.getHid() == 3) { %>
			<td>母</td>
			<%} %>
			<%if(sp.getIid() == 1)	{%>
			<td>食費</td>
			<%} %>
			<%if(sp.getIid() == 2) {%>
			<td>生活費</td>
			<%} %>
			<%if(sp.getIid() == 3) { %>
			<td>交通費</td>
			<%} %>
			<%if(sp.getIid() == 4)	{%>
			<td>家賃</td>
			<%} %>
			<%if(sp.getIid() == 5) {%>
			<td>光熱費</td>
			<%} %>
			<%if(sp.getIid() == 6) { %>
			<td>給料</td>
			<%} %>
			<%if(sp.getIid() == 7) {%>
			<td>その他</td>
			<%} %>
			<td><%=sp.getMoney()%>円</td>
			<td><%=sp.getMemo() %></td>
			<%} %>
		</tr>
	</table>
	<a href="/Kakeibo/Kakeibo">メニュー画面に戻る</a>
</body>
</html>