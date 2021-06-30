<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
    Integer number = Integer.valueOf(request.getParameter("number"));
    String[] types = request.getParameterValues("type");
    
    %>
    
    <div class="container">
       <h1>길이 변환 결과</h1>
       <h3><%= number %>cm</h3>
       <hr>
       
       <h2>
           <%
              for(String type : types){
            	if(type.equals("inch")){
            		double inch = number * 0.393701;
            		out.print("<h2>" + inch + "in</h2>");
            	}else if (type.equals("yard")){
            		double yard = number * 0.010936;
            		out.print("<h2>" + yard + "yd</h2>");
            	}else if (type.equals("feet")){
            		double feet = number * 0.032808;
            		out.print("<h2>" + feet + "ft</h2>");
            	}else if (type.equals("meter")){
            		double feet = number * 100.0;
            		out.print("<h2>" + meter + "m</h2>");
              }
           %>
       </h2>
    </div>
    
    
    
    
    
</body>
</html>