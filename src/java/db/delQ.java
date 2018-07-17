package db;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class delQ extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String qno = req.getParameter("qm");
        HttpSession ses = req.getSession();
        String uid = (String)ses.getAttribute("ucllgid");
        if(uid==null) // page direct open hai to
        {
           req.setAttribute("msg","Plz Login with Admin User for Delete User.");
           req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
        else if(!"1614310051".equals(uid))
        {
            req.setAttribute("msg","Plz Login with Admin User for Delete User.");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
        else
        {
          
             String msg = null;
              try {
                  msg = Admin.deleteQ(qno);
              } catch (Exception ex) {
                  Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
              }
             req.setAttribute("msg",msg);
          
          req.getRequestDispatcher("dispQ").forward(req, resp);
        }
    }
   
}
