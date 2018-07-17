
package db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class tryy extends HttpServlet
{
    @Override
 protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException 
 {
      
       HttpSession ses = req.getSession(true);
       String u = (String)ses.getAttribute("ucllgid");
       if(u==null)
       {
          u="";
          req.setAttribute("msg", "Sorry U can't Contd.. without Login, Plz Login with ur Id");
          req.getRequestDispatcher("login.jsp").forward(req, resp);
       }
          int k = 1;
          int ms =db.Admin.maxQ();
          k = (int)ses.getAttribute("c");
      PrintWriter out = resp.getWriter();
     out.println("<body bgcolor=lightyellow><tt><form action=\"Exam_1\" method=\"post\">");
     try 
     {
         out.println("<center><table width=98% border=1><tr>");
         ResultSet rs = db.Admin.getQues(k);
         
         
         if(k<ms)
         {
            out.println("<tr>");
                    out.println("Q U E S T I O N <tr><td colspan=2> "+rs.getString(2)+"</td></tr>");   
        out.println(" <tr>");
           out.println("<td><input type=radio name=r value=a />"+rs.getString(3));
            out.println(" <td><input type=radio name=r value=b />"+rs.getString(4));    
         out.println("</tr><tr>");
          out.println("<td><input type=radio name=r value=c />"+rs.getString(5));
            out.println(" <td><input type=radio name=r value=d />"+rs.getString(6));    
        out.println("</tr><tr>");
        out.println(" <td>  <input type=submit value=N E X T  Q U E S T I O N /></td> ");
        out.println(" <td><input type=reset value=C A N C E L /></td>");
    
             
        out.println(" </tr>");
                
          k++;
         }
         out.println("</form></table></center>");
     }catch(Exception ex) {out.print(ex.getMessage()); }
     String msg = (String)req.getAttribute("msg");
     if(msg!=null)
         out.print(msg);
      
      
     
  }
 }

