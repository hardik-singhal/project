/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;    
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
public class check extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
         res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("sname");
        String username = req.getParameter("suname");
        String email=req.getParameter("semail");
        int uid =Integer.parseInt(req.getParameter("suid"));
        String password = req.getParameter("spassword");
        
         RecordCheck rs = new RecordCheck();
         out.println("you are successfully registered...");
        try {
            rs.insert(name, username, email, uid, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
