package org.project.commend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class LoginOkDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("·Î±×ÀÎ");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		MemberDao dao =MemberDao.getInstance();
		
	}

}
