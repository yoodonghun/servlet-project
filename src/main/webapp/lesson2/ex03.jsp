<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST METHOD 폼 태그</title>
</head>
<body>
    <form method="post" action="/lesson2/ex03_1.jsp">
       1. 별명은 무엇입니까? <input type="text" name="nickname"><br><br>
       2. 취미는 무엇입니까? <input type="text" name="hobby"><br><br>
       3. 강아지 or 고양이 
       <label for="dog">강아지</label><input type="radio" id="dog" name="animal" value="dog">
       <label for="cat">고양이</label><input type="radio" id="cat" name="animal" value="cat"><br><br>
       
       4. 다음 중 선호하는 음식을 모두 고르시오<br>
       <label for="mintchoco">민트초고</label><input type="checkbox" name="food" id="mintchoco" value="mintchoco"></label>
       <label for="pizza">하와이안 피자</label><input type="checkbox" id="pizza" name="food" value="pizza">
       <label for="pupa">번대기</label><input type="checkbox" name="food" id="pupa" value="pupa"><br><br>
       
       5. 좋아하는 과일을 선택하세요<br>
       <select name="fruit">
           <option>복숭아</option>
           <option>레몬</option>
           <option>파인애플</option>
           <option>오랜지</option>
           <option>자몽</option>
       </select>
       
       <button type="submit">제출</button>
    </form>
</body>
</html>