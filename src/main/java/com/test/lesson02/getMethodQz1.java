package com.test.lesson02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz1")
public class getMethodQz1 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String numberParam = request.getParameter("number");
		Integer number = Integer.valueOf(numberParam);
		
		
		out.print("<html><head><title>구구단</title></head><body><ul>");
		
		for(int i = 1; i<=9; i++) {
			out.print("<li>" + number + " X " + i + " = " + (number * i) + "</li>");						
		}
		out.print("</ul><body></html>");
	}

}
