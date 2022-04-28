<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시물 조회</title>
</head>
<body>
	<label>제목</label>
	<input type="text" name="bd_title" value="${view.bd_title}" readonly /><br />
	
	<label>작성자</label>
	<input type="text" name="bd_writer" value="${view.bd_writer}" readonly /><br />
	
	<label>내용</label>
	<textarea cols="50" rows="5" name="bd_content" readonly >${view.bd_content}</textarea>
	
	<a href="/board/modify?bd_no=${view.bd_no}">수정</a>
	<a href="/board/delete?bd_no=${view.bd_no}">삭제</a>
</body>
</html>