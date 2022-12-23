package org.project.commend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class LoginOkDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("�α���");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		MemberDao dao =MemberDao.getInstance();
		int result = dao.loginOk(userId,userPw);
		String forwardURL="";
		
		HttpSession session = request.getSession();
		if(result!=1) {
			System.out.println("login Fail!");
			forwardURL="/loginFail.jsp";
		}else {
			System.out.println("login Success!");
			forwardURL="/loginSuccess.jsp";
			//�α��� ������ ���� ����
			session.setAttribute("sessionId", userId);
			session.setMaxInactiveInterval(60*60);
			//������ ����ִµ��ȿ��� ������ 3600�ʵ��� ����ִ´�.
		}
		request.setAttribute("forwardURL", forwardURL);
	}

}
