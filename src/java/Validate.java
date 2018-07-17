
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Validate extends HttpServlet {
   @Override
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String ucllgid = req.getParameter("ucllgid");
      String upass = req.getParameter("upass");
      String msg = db.Admin.checkId(ucllgid,upass);
      int k=1;
      if(msg.startsWith("Sorry"))
      {
         req.setAttribute("msg",msg);
         req.getRequestDispatcher("login.jsp").forward(req, resp);
      }
      else
      {
          HttpSession ses = req.getSession(true);
          ses.setAttribute("ucllgid",ucllgid);
           if("ADMIN".equals(msg))
           {
              resp.sendRedirect("Welcome.jsp");
          }
          else
          {
              ses.setAttribute("c",k);
              resp.sendRedirect("Exam.jsp");
          }          
      }
   }
  
}
