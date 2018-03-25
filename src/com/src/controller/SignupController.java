package com.src.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.model.SignupModel;


/**
 * Servlet implementation class SignupController
 */
@WebServlet("/SignupController")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String phone_no=request.getParameter("phone_no");
		String email=request.getParameter("email");
		
		
		
		HashMap<String,String> errors =new HashMap<>();
		
		if(name==null||name.length()<=0)
		{
			errors.put("name_error", "name must not be blank");
			
		}
		else
		{
			 request.setAttribute("name", name);
		}
		
		if(password==null||password.length()<8)
		{
			errors.put("password_error","password must be greater than 8 characters");
			
		}
		else
		{
			 request.setAttribute("password",password);
		}
		
		if(address==null||address.length()<=0)
		{
			errors.put("address_error", "address must not be blank");
			
		}
		else
		{
			 request.setAttribute("address",address);
		}
		if(phone_no==null||phone_no.length()<=0)
		{
			errors.put("phone_no_error","phone number must not be blank");
			
		}
		else
		{
			 request.setAttribute("phone_no",phone_no);
        }
		
		if(email==null||email.length()<=0)
		{
			errors.put("email_error", "email must not be blank");
			
		}
		else
		{
			 request.setAttribute("email", email);
		}
		
		
		
		if(errors.isEmpty()){
			SignupModel rm=new SignupModel();
			rm.setName(name);
			rm.setPassword(password);
			rm.setAddress(address);
			rm.setPhone_no(phone_no);
			rm.setEmail(email);
			try{
				int row=Factory.getinstance().insert(rm);
				
				 
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			

		
			request.setAttribute("registerdata", rm);
			
				request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		else
		{

			request.setAttribute("errors", errors);
			request.getRequestDispatcher("signup.jsp").forward(request, response);
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
