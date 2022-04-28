<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> content list </title>
</head>
<body>

<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성일</th>
			<th>작성자</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="list">
			<tr>
				<td>${list.bd_no}</td>
				<td><a href="/board/view?bd_no=${list.bd_no}">${list.bd_title}</a></td>
				<td>
					${list.bd_regDate}
<%-- 					<fmt:formatDate value="${list.bd_regDate}" pattern="yyyy-mm-dd" /> --%>
				</td>
				<td>${list.bd_writer}</td>
				<td>${list.bd_viewCnt}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>