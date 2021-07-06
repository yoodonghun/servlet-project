<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<link rel="stylesheet" type="text.css" href="qz02.style.css">

<style>
  #wrap {width: 1500px; height: 800px;}
  a {text-decoration: none; color:#31B716}
  a hover {text-decoration: none;}
  
  header{height: 100px}
  
  .box {width: 500px; height:50px}
  .btn {width:80px; height:50px}
  nav{height: 70px}
  .content{height:700px}
  .singer {border-style:solid; border-color:#14FC23; height:250px;
            border-width: 3px
            }

  .music {height:350px}
  footer{height:50px}
</style>
</head>
<body>
   <div id="wrap" class="ml-5">
      <jsp:include page="header.jsp" />
      <jsp:include page="menu.jsp" />
      <jsp:include page="content.jsp" />
      <jsp:include page="footer.jsp" />
   </div>

</body>
</html>