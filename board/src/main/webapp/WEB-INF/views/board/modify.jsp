<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시물 수정</title>
</head>
<body>
	<form method="post">
		<label>제목</label>
		<input type="text" name="bd_title" value="${view.bd_title}" /><br />
		
		<label>작성자</label>
		<input type="text" name="bd_writer" value="${view.bd_writer}" readonly /><br />
		
		<label>내용</label>
		<textarea cols="50" rows="5" name="bd_content" >${view.bd_content}</textarea>
		<button type="submit">저장</button>
	</form>
	
	<!-- 
		입력요소의 name속성값은 boardVO에 있는 각각의 필드명과 같아야함.
		프론트단에서 전송하는 데이터 타입을 VO화 시키고, 
		백단인 컨트롤러에서도 같은 VO타입으로 받도록 해주면 알아서 데이터가 들어가기 때문에 편리함.
	 -->
</body>
</html>