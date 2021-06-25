package com.test.lesson02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/EX01")
public class getMethodEx01 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
		
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		PrintWriter out = response.getWriter();
//		out.println("user_id:" + userId);
//		out.println("name:" + name);
//		out.println("age:" + age);
		
		//JSON(JavaScript Object Notation)으로 response를 구성하기(데이터를 담기위한 맵)
		//{"user_id":"dlwlrma","name":"jieun","age":"29}
		response.setContentType("text/json");
		out.print("{\"user_id\":\"" + userId + "\",\"name\":\"" + name + "\", \"age\":" + Integer.valueOf(age) +"}");
	}

}
