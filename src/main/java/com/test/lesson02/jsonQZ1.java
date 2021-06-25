package com.test.lesson02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/qz2-1")
public class jsonQZ1 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
		response.setContentType("text/json");
		
		PrintWriter out = response.getWriter();
		String numb1Param = request.getParameter("number1");
		String numb2Param = request.getParameter("number2");
		Integer number1 = Integer.valueOf(numb1Param);
		Integer number2 = Integer.valueOf(numb2Param);
		
		out.print("{\"addition\":" + (number1+number2) + ", \"subtraction\":" + (number1-number2));
		out.print(",\"multiplication\":" + (number1*number2) + ", \"division\":" + (number1 / number2));
		
		
	}

}
