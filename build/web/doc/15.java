/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
public class RecordCheck {
    
    public void insert(int id,String first,String last,String pass) throws ClassNotFoundException, SQLException, IOException
    {
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");  
        PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, first);
        ps.setString(3, last);
        ps.setString(4,pass);
        int rs=ps.executeUpdate();
    }    
}
