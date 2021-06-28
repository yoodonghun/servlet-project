<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 예제</title>
</head>
<body>
    <!-- HTML 주석 문법 : 소스보기에서 보임 -->
    <%-- JSP의 주석 : 소스보기에서 안보임 --%>
    <h1>Hello World!</h1>
    
    <% 
       //java 문법 시작 --> 자바 주석
       //scriptlet 
       //--메인 함수에 구현하는 느낌
       //1+2+3+...+10
       
       int sum = 0;
       for(int i=0; i<=10; i++){
    	   sum+=i;
       }
    %>
    
    <strong>합계:</strong>
    <input type="text" value="<%=sum%>">
    <br>
    
    <%!
       //선언문
       //-- 일반 클래스 같은 느낌
       //field
       private int num = 100;
    
       
       //method
       public String getHelloWorld(){
    	   return "hello world";
       }
    %>
    <%--표현식 : 선언되어 있는 변수값이나 메소드의 기턴값을 출력한다. --%>
    <%=getHelloWorld() %>
    <br>
    
    <%=num + 200 %>
</body>
</html>