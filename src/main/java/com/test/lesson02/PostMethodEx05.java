package com.test.lesson02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class PostMethodEx05 extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		//POST 메소드일때 톰캣 서버가 기본적으로 IOS-8859-1 인코딩 하기 때문에 필터 설정을 추가해야 한다
		
		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
//		out.print(userId+"<br>");
//		out.print(name+"<br>");
//		out.print(birth+"<br>");
//		out.print(email);
		
		//테이블로 출력
		out.print("<html><head><title></title></head><body>");
		out.print("<table border=1>");
		out.print("<tr><th>아이디</th><td>" + userId + "</td></tr>");
		out.print("<tr><th>이름</th><td>" + name + "</td></tr>");
		out.print("<tr><th>생년월일</th><td>" + birth + "</td></tr>");
		out.print("<tr><th>이메일</th><td>" + email + "</td></tr>");
		out.print("</table>");
		out.print("</body></html>");
	}

}
