package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQZ01 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();		
		
		Date now = new Date();
		
		//1
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		out.println("오늘의 날짜는"+ " " + sdf.format(now));
		
		//2
		SimpleDateFormat sdf1 = new SimpleDateFormat("a HH:mm:ss");
		out.println("현재 시간은"+ " " + sdf1.format(now) + "입니다");
		
		
	}

}
