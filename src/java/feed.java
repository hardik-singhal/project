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
public class feed extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
         res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("cname");
        String email= req.getParameter("cemail");
        String subject = req.getParameter("csubject");
        String message = req.getParameter("cmessage");
        
         feedback rs = new feedback();
         out.println("Your response has been recorded");
        try {
            rs.insert(name,email,subject,message);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(feed.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(feed.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
