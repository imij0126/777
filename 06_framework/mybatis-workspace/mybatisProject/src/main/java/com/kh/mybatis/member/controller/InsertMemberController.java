package com.kh.mybatis.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.mybatis.member.model.vo.Member;
import com.kh.mybatis.member.service.MemberServiceImpl;

/**
 * Servlet implementation class InsertMemberController
 */
@WebServlet("/insert.me")
public class InsertMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		String birthday = request.getParameter("birthday");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		
		
		if (birthday.length() > 6 && birthday.contains("-")) {
			birthday = birthday.replaceAll("-", "");
		}
		
		Member m = new Member(userId
							, userPwd
							, userName
							, email
							, birthday
							, gender
							, phone
							, address);
		
		int result = new MemberServiceImpl().insertMember(m);
		
		if (result > 0) {	// 회원가입 성공
			HttpSession session = request.getSession();
			session.setAttribute("alertMsg", "회원가입에 성공했습니다!");
			
			// url 재요청 (/jsp)
			response.sendRedirect(request.getContextPath());
		} else {			// 회원가입 실패
			request.setAttribute("errorMsg", "회원가입에 실패했습니다.");
			
			// 에러페이지로 응답 (errorPage.jsp 페이지 포워딩)
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
	}

}
