/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author dell
 */
public class RecordCheck {
    
    public void insert(String name,String username,String email,int uid,String password) throws ClassNotFoundException, SQLException, IOException
    {
        
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");  
        PreparedStatement ps = con.prepareStatement("insert into data values(?,?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, username);
        ps.setString(3, email);
        ps.setInt(4, uid);
        ps.setString(5,password);
        int rs=ps.executeUpdate();       
        
       
    }    
}
