package com.src.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.src.model.LoginModel;
import com.src.model.OrderModel;
import com.src.model.SignupModel;




public class DBimp implements Dbintr{
	 static Connection c;
	static ResultSet r;
	static 
	{
		try
       {
       Class.forName("oracle.jdbc.driver.OracleDriver");
        c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle1234");
       }
       catch(Exception e)
       {
          System.out.println(e);
          }
	}
	public int insert(SignupModel rm1) throws SQLException
	{
		PreparedStatement pst;
		
			pst = c.prepareStatement("insert into signup values(?,?,?,?,?)");
			pst.setString(1,rm1.getName());
			pst.setString(2,rm1.getPassword());
			pst.setString(3,rm1.getAddress());
			pst.setString(4,rm1.getPhone_no());
			pst.setString(5,rm1.getEmail());
			
			return pst.executeUpdate();
		} 
	
	public int insertorder() throws SQLException
	{
		PreparedStatement pst;
		
			pst = c.prepareStatement("insert into order_no (order_num) values (order_num_sequence.nextval)");
			
			return pst.executeUpdate();
	}
	
	
	 public boolean getuser(LoginModel rm1) throws SQLException
	 {
	     boolean value=false;

	 try
	 {
	         
	 	
	 	PreparedStatement stmt=c.prepareStatement("select name,password from signup where name=?");



	 stmt.setString(1,rm1.getUsername());
	// stmt.setString(2,rm1.getPassword());
	 	r=stmt.executeQuery();
	         
	         while(r.next())
	         {
	            
	         
	         if((r.getString(1).equals(rm1.getUsername()))&&(r.getString(2).equals(rm1.getPassword())))
	         {
	            
	            value=true;
	            break;
	         }
	         }
	 }
	 catch(Exception e)
	 {
		 
	 }
	         
	        return value;
	        
	   }
	 
	 

	 public OrderModel getfaculty(String name) throws SQLException {
		 
		 String query="select * from signup where name='"+name+"'";
		 System.out.println(query);
		 PreparedStatement pst=c.prepareStatement(query);
		 ResultSet r=pst.executeQuery();
		 OrderModel o= new OrderModel();
		 while(r.next()){
			// o.setOrder_no(r.getString(1));
			 o.setName(r.getString(1));
			
			 o.setAddress(r.getString(3));
			 o.setPhone_no(r.getString(4));
			 o.setEmail(r.getString(5));
			 
		
			 
			}
		 return o;
	         
	 }
	 
public OrderModel getOrder_no(String order_no) throws SQLException {
		 
		 String query="select * from order_no";
		 System.out.println(query);
		 PreparedStatement pst=c.prepareStatement(query);
		 ResultSet r=pst.executeQuery();
		 OrderModel o= new OrderModel();
		 while(r.next()){
			 o.setOrder_no(r.getString(1));
		 }
		return o;

	
}
}