<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<style>
  .logo {height:50px; font-size: 27px; background-color:#FF8C0A}
  nav {height:40px; background-color:#FF8C0A}
</style>

<body>
   <div id="wrap" class="container">
      <div id="wrap" class="container">
      <jsp:include page="header.jsp" />
      <jsp:include page="menu.jsp" />
      <section class="item_raise">
        <div class="ml-4 mt-4">
          <h1>물건 올리기</h1>
          <div class="d-flex">
            <select class="form-control col-2">
              <option>-아이디 선택-</option>
              <option>마로비</option>
              <option>아메리카노</option>
              <option>최준</option>
              <option>빠다</option>
              <option>하구루</option>
              <option>다팔아</option>
            </select>
            <input type="text" class="form-control ml-3 col-4" name="title" placeholder="제목">
            
            <div class="input-group">
               <input type="text" class="form-control ml-3 col-3" name="price" placeholder="가격">
               <div>원</div>
            </div>
          </div>
        </div>
      </section>
      <jsp:include page="footer.jsp" />
      
   </div>
   </div>
</body>
</html>