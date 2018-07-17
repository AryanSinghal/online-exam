

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EXAM_1 extends HttpServlet
{   
    @Override
 protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException 
 {
       int k=1;
       HttpSession ses = req.getSession();
       String u = (String)ses.getAttribute("ucllgid");
       if(u==null)
       {
          u="";
          req.setAttribute("msg", "Sorry U can't Contd.. without Login, Plz Login with ur Id");
          req.getRequestDispatcher("login.jsp").forward(req, resp);
       }
      
      
          try{     
               
               ResultSet rs = db.Admin.getQues(k);
               int ms =db.Admin.maxQ();
               PrintWriter out = resp.getWriter();
               int m=rs.getInt(1);
               if(ms==m){
                   req.getRequestDispatcher("Score.jsp").forward(req, resp);
                   
                  
               } else {  
                   req.getRequestDispatcher("Exam.jsp").forward(req, resp);
               }
                String radio= req.getParameter("r");
                db.Admin.marks(radio,u);
                 
          } catch (Exception ex) {
            Logger.getLogger(EXAM_1.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
 }

