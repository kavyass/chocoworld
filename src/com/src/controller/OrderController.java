package com.src.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.src.model.LoginModel;
import com.src.model.OrderModel;
import com.src.model.SignupModel;



/**
 * Servlet implementation class OrderController
 */
@WebServlet("/OrderController")
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderController() {
        super();
        try {
    		int row=Factory.getinstance().insertorder();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
        
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	        OrderModel rm=new OrderModel();
	        try {
				rm=Factory.getinstance().getOrder_no(rm.getOrder_no());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			request.setAttribute("Facultyorder",rm);
	    	
			OrderModel rm1=new OrderModel();
	
		try{
			
			HttpSession session = request.getSession(false);
			LoginModel lm=(LoginModel)session.getAttribute("logindata");
			
			
			rm1=Factory.getinstance().getfaculty(lm.getUsername());

			request.setAttribute("Faculty",rm1);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		String name=request.getParameter("name");
		System.out.println(name);
		request.setAttribute("iname", name);
	
	
		request.getRequestDispatcher("Order.jsp").forward(request, response);
		
		
		}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
