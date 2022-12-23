package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("�α׾ƿ�");
		
		String forwardURL="";
		HttpSession session=request.getSession();
		if(session!=null) {
			session.invalidate();
			forwardURL="/index.jsp";
		}
		
		request.setAttribute("forwardURL", forwardURL);
	}

}
