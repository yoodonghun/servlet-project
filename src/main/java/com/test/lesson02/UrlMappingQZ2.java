package com.test.lesson02;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/qz2")
public class UrlMappingQZ2 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>뉴스</title></head></html>");
		out.print("<h1>[단독] 고양이가 야옹해</h1>");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		out.print("<p>기사 입력 시간:" + sdf.format(date) + "</p>");
		out.print("<hr>끝");
	}

}
