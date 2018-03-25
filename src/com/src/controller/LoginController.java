package com.src.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.src.model.LoginModel;

import com.src.controller.Factory;
import com.src.controller.*;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		//boolean b=Factory.getinstance().getUser(rm);
		
		HashMap<String,String> errors =new HashMap<>();
		
		
		
		
		LoginModel l=new LoginModel();
		String s="username or password is invalid";
		l.setUsername(username);
		l.setPassword(password);
		
		if((username.equals(l.getUsername()))&&(password.equals(l.getPassword())))
{
	errors.put("Login_error","Username or Password is invalid ");
}
			
		try {
			boolean b=Factory.getinstance().getuser(l);
			if(b==true)
			{
				request.setAttribute("logindata",l);
				HttpSession session = request.getSession();
				session.setAttribute("logindata", l);
				request.getRequestDispatcher("Homepage.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("errors", errors);
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
