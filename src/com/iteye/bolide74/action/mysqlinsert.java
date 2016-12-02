package com.iteye.bolide74.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysqlinsert {
public static void main(String args[]) {  
		
	    try {  
	      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序     
	      //Class.forName("org.gjt.mm.mysql.Driver");  
	     System.out.println("Success loading Mysql Driver!");  
	    }  
	    catch (Exception e) {  
	      System.out.print("Error loading Mysql Driver!");  
	      e.printStackTrace();  
	    }  
	    try {  
	    	PreparedStatement pst=null;
	      Connection con = DriverManager.getConnection(  
	          "jdbc:mysql://localhost:3306/new_schema","root","");  
	           //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码  
	  
	      System.out.println("Success connect Mysql server!");  
	      Statement stmt = con.createStatement();  
	      String sql = "insert into user values(?,?,?) ";  
	      pst = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);  
	      
	      pst.setString(1, "6279229d81");  
	      pst.setString(2, "flh");  
	      pst.setString(3, "mangguo");  
	      pst.executeUpdate();  
	      pst.close();  
	      con.close();  
	      
	    }  
	    catch (Exception e) {  
	      System.out.print("get data error!");  
	      e.printStackTrace();  
	    }  
	  }  
}
