<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<%@ page import="java.text.SimpleDateFormat" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<%
	    Calendar today = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
	   
		//월의 첫날
		Calendar firstDateofMonth = Calendar.getInstance();
		firstDateofMonth.set(Calendar.DAY_OF_MONTH, 1);
		
	    //월의 첫 요일
	    int firstDayofMonth =  firstDateofMonth.get(Calendar.DAY_OF_WEEK);
	    
	    //월의 말일 구하기
	    int lastDateOfMonth = firstDateofMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
	    out.print("lastDayOfMonth:" + lastDateOfMonth);
	%>
   <div class="container">
      <h2 class="text-center"><%= sdf.format(today.getTime()) %></h2>
       
       <table class="table text-center">
	     <thead> 
		     <tr>
		       <th class="text-danger">일</th>
		       <th>월</th>
		       <th>화</th>     
		       <th>수</th>
		       <th>목</th>
		       <th>금</th>
		       <th>토</th>
		     </tr>  
	     </thead>
	     <tbody>
	     <%
	       int day = 1 - firstDayofMonth + 1; //마이너스부터 시작해서 1부터 시작한다
	       for(int i=0; i < 6; i++){ //행
	    	   out.print("<tr>");
	       
	           for (int j=0; j < 7; j++) {
	        	   out.print("<td>");
	        	   if(day > 0){
	        		   out.print(day);
	        	   }
	        	   out.print(day);
	        	   out.print("</td>");
	        	   
	        	   day++;
	        	   
	        	   if(day > lastDateOfMonth){
	        		   break;
	        	   }
	        	   
	           }
	           out.print("</tr>");
	           
	           if(day > lastDateOfMonth){
	        	   break;
	           }
	       
	       	   
	       }
	     %>
	     
	     
	       
	     </tbody>
   </div>
</body>
</html>