package com.test.lesson02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/qz10")
public class PostMethodQz10  extends HttpServlet{
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("Id", "marobiana");
	        put("password", "qwerty1234");
	        put("name", "신보람");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
		response.setContentType("text/html");
		
		String id = request.getParameter("Id");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title></title></head><body>");
//		id가 일치하지 않는 경우 id가 일치하지 않습니다. 를 출력하세요.
//		password가 일치하지 않는 경우 password가 일치하지 않습니다. 를 출력하세요.
		if(userMap.get("Id").equals(id) == false) {
			out.print("아이디가 일치하지 않습니다");
		}else if (userMap.get("password").equals(password) == false) {
			out.print("비밀번호가 일치하지 않습니다");
		}else {
			out.print(userMap.get("name")+"님 환영합니다");
		}
		out.print("</body></html>");
	}

}
