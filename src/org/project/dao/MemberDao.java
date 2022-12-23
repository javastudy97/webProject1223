package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberDao {

	private static class SingleTonEx {
		private static final MemberDao INSTACE = new MemberDao();
	}

	private MemberDao() {
		System.out.println("Dao");
	}

	public static MemberDao getInstance() {
		return SingleTonEx.INSTACE;
	}

	public int insertDo(String userId, String userPw, String gender, String hobbys, String city, String memo) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into login1222(userid,userpw,gender,hobbys,city,memo) values(?,?,?,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, gender);
			pstm.setString(4, hobbys);
			pstm.setString(5, city);
			pstm.setString(6, memo);

			result = pstm.executeUpdate();
			System.out.println("SQL문 실행 SUCCESS!!");
		} catch (SQLException e) {
			System.out.println("SQL문 실행 FAIL!!");
			e.printStackTrace();
			
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
			}
		}

		return result;
	}

	public int loginOk(String userId, String userPw) {
		
		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs =null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from login1222 where userId=? and userPw =?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);

			rs = pstm.executeQuery();
			if(rs != null) {
					while(rs.next()) {
						result=rs.getInt(1);
					}
			}
			System.out.println("SQL문 실행 SUCCESS!!");
		} catch (SQLException e) {
			System.out.println("SQL문 실행 FAIL!!");
			e.printStackTrace();
			
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if(rs!=null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
			}
		}
		
		
		return result;
	}

}
