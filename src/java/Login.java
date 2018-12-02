/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author HP
 */
public class Login extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String email1 = request.getParameter("semail");
        String password = request.getParameter("spassword");
        
        PrintWriter out = response.getWriter();
        
        
        try {
            LoginDAO l = new LoginDAO();
            String result = l.checkInfo(email1, password);
            
            if(result.equals("Login successfull"))
            {
                RequestDispatcher rd=request.getRequestDispatcher("main.html");
                rd.forward(request,response);
            }
            else
            {
                RequestDispatcher rd=request.getRequestDispatcher("signup.html");
                rd.include(request,response);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }




}
