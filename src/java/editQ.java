
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class editQ extends HttpServlet{
    
    
    @Override
    protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
    
        HttpSession ses = req.getSession(true);
       String u = (String)ses.getAttribute("ucllgid");
       if(u==null)
       {
          u="";
          req.setAttribute("msg", "Sorry U can't Contd.. without Login, Plz Login with ur Id");
          req.getRequestDispatcher("login.jsp").forward(req, res);
       }
        String qno=req.getParameter("qno");
        String q=req.getParameter("q");
        String a=req.getParameter("a");
        String b=req.getParameter("b");
        String c=req.getParameter("c");
        String d=req.getParameter("d");
        String r=req.getParameter("r");
        String msg = db.Admin.editQues(qno,q,a,b,c,d,r);
            req.setAttribute("msg", msg);
        req.getRequestDispatcher("editQuestion.jsp").forward(req,res);
        
    }

}