package com.src.controller;



import java.sql.SQLException;

import com.src.model.LoginModel;
import com.src.model.OrderModel;
import com.src.model.SignupModel;



public interface Dbintr {
	 public int insert( SignupModel rm1) throws SQLException;
	 public boolean getuser(LoginModel rm1) throws SQLException;
	 public OrderModel getfaculty(String name) throws SQLException;
	 public int insertorder() throws SQLException;
	 public OrderModel getOrder_no(String order_no) throws SQLException;

}
