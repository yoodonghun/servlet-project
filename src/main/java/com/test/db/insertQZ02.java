package com.test.db;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/qz02_insert")
public class insertQZ02 extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
		String name = request.getParameter("name");
		String url = request.getParameter("id");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connection();
		
		String query = 
	}

}
