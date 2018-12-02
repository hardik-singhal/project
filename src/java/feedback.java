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
public class feedback {
    
    public void insert(String name,String email,String subject,String message) throws ClassNotFoundException, SQLException, IOException
    {
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");  
        PreparedStatement ps = con.prepareStatement("insert into feedback values(?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, subject);
        ps.setString(4, message);
        int rs=ps.executeUpdate();
    }    
}
