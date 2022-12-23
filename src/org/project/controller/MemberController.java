package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.LoginOkDo;
import org.project.commend.LogoutDo;
import org.project.commend.MemberCommend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;

@WebServlet("*.do")
public class MemberController extends HttpServlet{
	//get, post -> 매서드 webApp(); 구현
		
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("GET");
		webApp(request, response);
	}
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("POST");
		webApp(request, response);
	}
	
	protected void webApp(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String basicURL=uri.substring(path.length());
		
		String forwardURL = "";
		MemberCommend commend = null;
		if(basicURL.equals("/memberInsert.do")) {
			//일시키고 -> commend
			commend = new MemberInsertDo();
			commend.excuteQueryCommend(request, response);
			//view -> url,값
			forwardURL=(String) request.getAttribute("forwardURL");
		}else if(basicURL.equals("/memberUpdate.do")){
			commend = new MemberUpdateDo();
			commend.excuteQueryCommend(request, response);
			forwardURL=(String) request.getAttribute("forwardURL");
		}else if(basicURL.equals("/memberDelete.do")){
		commend = new MemberDeleteDo();
		commend.excuteQueryCommend(request, response);
		forwardURL=(String) request.getAttribute("forwardURL");
		}else if(basicURL.equals("/memberSelect.do")){
		commend = new MemberSelectDo();
		commend.excuteQueryCommend(request, response);
		forwardURL=(String) request.getAttribute("forwardURL");
		}else if(basicURL.equals("/loginOk.do")){
		commend = new LoginOkDo();
		commend.excuteQueryCommend(request, response);
		forwardURL=(String) request.getAttribute("forwardURL");
		}else if(basicURL.equals("/logoutOk.do")){
			commend = new LogoutDo();
			commend.excuteQueryCommend(request, response);
			forwardURL=(String) request.getAttribute("forwardURL");
			}
		else if(basicURL.equals("/index.do"))	{
			forwardURL="/index.jsp";
		}else if(basicURL.equals("/joinView.do"))	{
			forwardURL="/join.jsp";
		}else if(basicURL.equals("/loginView.do"))	{
			forwardURL="/login.jsp";
		}
		
		
		//view -> url,값
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardURL);
		dispatcher.forward(request, response);
		
		
		
		
	}
	
}
