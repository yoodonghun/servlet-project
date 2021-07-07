package com.test.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/db/qz01")
public class Mysql_QZ1 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connection();
		
        
        
        
        
		PrintWriter out = response.getWriter();
		
		try {
			String query = "INSERT INTO `real_estate` "
        		+ "(`realtorId`, `address`, `area`, `type`, `price`)"
        		+ "VALUES"
        		+ "(3, '헤라펠리스 101동 5405호', 350, '매매', 1500000, NULL);";
			mysqlService.update(query);
			String selectQuery = "SELECT * FROM `real_estate`"
					+ "ORDER BY `id` DESC"
					+ "LIMIT 10";
			
			ResultSet resultSet = mysqlService.select(query);
			while (resultSet.next()) {
				String address = resultSet.getString("address");
				int area = resultSet.getInt("area");
				String type = resultSet.getString("type");
				out.println("매물 주소:" + address + "면적:" + area + "타입:" + type);
				
                
			}
		} catch (SQLException e) {
            e.printStackTrace();
        }
		mysqlService.disconnect();
	}
}
