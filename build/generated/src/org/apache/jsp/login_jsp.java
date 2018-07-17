package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title> L O G I N </title>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function check()\n");
      out.write("    {\n");
      out.write("       var y=confirm(\"do you really want to submit\");\n");
      out.write("       if(y==true)\n");
      out.write("       {\n");
      out.write("           return true;\n");
      out.write("       }\n");
      out.write("       else\n");
      out.write("       {\n");
      out.write("           return false;\n");
      out.write("       }\n");
      out.write("    }\n");
      out.write("   </script>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=#233333>\n");
      out.write("<br><br><br><br><br><br><br><br><br><br>\n");
      out.write("<form action=\"Validate\" method=\"post\" onsubmit=\"return check()\">\n");
      out.write("<table border=0 align=center bgcolor=#999>\n");
      out.write("<tr>\n");
      out.write("<th colspan=2> L O G I N </th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <th>______________________________________________________</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <th colspan=\"2\">COLLEGE ID</th>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th colspan=2><input type=text name=\"ucllgid\" placeholder=1614310051 size=\"30\" maxlength=10></th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <th colspan=2 >PASSWORD</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th colspan=2><input type=password name=\"upass\" placeholder=abc@329.$$#  size=30 maxlength=12></th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <th> <a href=\"forget password\"> forget password?</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <th colspan=2 rowspan=\"2\"> <input type=submit value=\"L O G I N\"> <input type=reset value=\"C A N C E L\"> </th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <th> \n");
      out.write("              <a href=signup.jsp><align= right>Sign Up</a>\n");
      out.write("    </th>\n");
      out.write("</tr>    \n");
      out.write("<tr>\n");
      out.write("    <th>  ");

        String msg = (String)request.getAttribute("msg");
        if(msg!=null)
           out.print(msg);
   
      out.write("\n");
      out.write("    </th>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
