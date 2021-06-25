package com.test.lesson02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/qz05")
public class GetMethodQZ04 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		String search = request.getParameter("search");
		List<String> list = new ArrayList<>(Arrays.asList(
				"강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
		PrintWriter out = response.getWriter();
		out.print("<html><head><title></title></head><body>");
		//money in pocket
		for (String text : list) {
//			out.print(text+ "<br>");
//			//추가 풀이 방법
//			int index = text.indexOf(search);
//			if(index > -1) {
//				StringBuffer sb = new StringBuffer();
//				sb.append(text);
//				sb.insert(index, "<b>"); //ex) |맛집 앞 부분에 <b>태그 추가
//				sb.insert(index + search.length() + 3, "</b>"); // <b>맛집| 부분에 </b> 추가
//				// 키워드 단어 길이와 <b> -> 3을 더함
//				out.print(sb + "<br>");
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//			String[] words = text.split(search);
//			if (text.contains(search)) {
//				out.print(words[0] + "<b>" + search + "</b>" + words[1] + "<br>");
//			}
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			String[] words = text.split(search);
			if (text.contains(search)) {
				text.replaceAll(search, "<b>" + search + "</b>");
				out.print(text + "<br>");
			}
		}
		out.print("</body></html>");
		
	}

}
