
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class saveinfo extends HttpServlet{

   
    
    protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
    
        String uname=req.getParameter("uname");
        String umobile=req.getParameter("umobile");
        String uemailid=req.getParameter("uemailid");
        String udob=req.getParameter("udob");
        String ucllgname=req.getParameter("ucllgname");
        String upass=req.getParameter("upass");
        String ucllgid=req.getParameter("ucllgid");
        String msg = null;
        if(upass=="")
           msg  ="please enter password";
        else if(ucllgname=="")
              msg="please enter college name";
        else
             msg = db.Admin.signup(uname,umobile,uemailid,udob,ucllgname,upass,ucllgid);
        req.setAttribute("msg", msg);
        req.getRequestDispatcher("signup.jsp").forward(req,res);
        
    }

}