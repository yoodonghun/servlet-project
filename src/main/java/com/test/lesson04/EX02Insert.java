package com.test.lesson04;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/ex02_insert")
public class EX02Insert extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		String introduce = request.getParameter("introduce");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connection();
		
		
		
		
		//목록 화면 이동 => redirect
		response.sendRedirect("/lesson04/ex02/ex02_1.jsp");
		
	}

}
