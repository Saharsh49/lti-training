package com.lti.jdbc;

import java.sql.*;

public class DemoJdbc {

	public static void main(String[] args) {
	Connection con = null;
	//Statement statement = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	
	try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "oracle");
		System.out.println("Connection Successful");
		//statement = con.createStatement();
		//rs = statement.executeQuery("select * from product");
		//while(rs.next()) {
			//System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		//}
		
		ps = con.prepareStatement("update product set product_name = ? where product_id = ?");
		ps.setString(1, "VR Set");
		ps.setInt(2, 101);
		int result = ps.executeUpdate(); 
		System.out.println(result + " Rows updated");
	
	} catch(SQLException | ClassNotFoundException e){
		System.out.println(e);
	}finally {
		try {
			con.close();
			//statement.close();
			//rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}

}
