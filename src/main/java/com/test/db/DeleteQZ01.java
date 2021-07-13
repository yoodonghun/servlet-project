package com.test.db;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/db/ex01")
public class DeleteQZ01 extends HttpServlet {
	@Override
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
	   Integer id = Integer.valueOf(request.getParameter("id"));
	   
	   MysqlService mysqlService = MysqlService.getInstance();
	   mysqlService.connection();
	   
	  
   }
}
