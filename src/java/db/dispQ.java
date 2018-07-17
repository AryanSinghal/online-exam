
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

public class dispQ extends HttpServlet
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
      PrintWriter out = resp.getWriter();
     out.println("<body bgcolor=lightyellow><tt>");
     try 
     {
         out.println("<center><table width=98% border=1><tr>");
         ResultSet rs = Admin.getQt();
         ResultSetMetaData mt = rs.getMetaData();
         for(int i=1;i<=mt.getColumnCount();i++)
            out.print("<th>"+mt.getColumnName(i));
         out.println("<th>Action");
         while(rs.next())
         {
            out.println("<tr>");
            for(int i=1;i<=mt.getColumnCount();i++)
                    out.print("<td>"+rs.getString(i));
            out.print("<td><a href=delQ?qm="+rs.getString(1)+">Delete</a>");
         
            out.println("</tr>");
         }
         out.println("</table></center>");
     }catch(Exception ex) {out.print(ex.getMessage()); }
     String msg = (String)req.getAttribute("msg");
     if(msg!=null)
         out.print(msg);
      out.println(" <br><br><br><a href=editQuestion.jsp>Update Question</a>    <br><br><br>     ");
      out.println("<a href=\"addQues.jsp\">Add questions</a>   <br><br><br>       ");
      out.println("<a href=Welcome.jsp>DONE</a>       <br><br><br>        ");
      
     
  }
 }

