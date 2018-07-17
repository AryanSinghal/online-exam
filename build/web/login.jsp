<%-- 
    Document   : login
    Created on : Jun 3, 2018, 1:50:22 PM
    Author     : Aryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> L O G I N </title>
<script type="text/javascript">
    function check()
    {
       var y=confirm("do you really want to submit");
       if(y==true)
       {
           return true;
       }
       else
       {
           return false;
       }
    }
   </script>
</head>
<body bgcolor=#233333>
<br><br><br><br><br><br><br><br><br><br>
<form action="Validate" method="post" onsubmit="return check()">
<table border=0 align=center bgcolor=#999>
<tr>
<th colspan=2> L O G I N </th>
</tr>
<tr>
    <th>______________________________________________________</th>
</tr>
<tr>
    <th colspan="2">COLLEGE ID</th>

</tr>
<tr>
<th colspan=2><input type=text name="ucllgid" placeholder=1614310051 size="30" maxlength=10></th>
</tr>
<tr>
    <th colspan=2 >PASSWORD</th>
</tr>
<tr>
<th colspan=2><input type=password name="upass" placeholder=abc@329.$$#  size=30 maxlength=12></th>
</tr>
<tr>
    <th> <a href="forget password"> forget password?</th>
</tr>
<tr>
    <th colspan=2 rowspan="2"> <input type=submit value="L O G I N"> <input type=reset value="C A N C E L"> </th>
</tr>
<tr>
    <th> 
              <a href=signup.jsp><align= right>Sign Up</a>
    </th>
</tr>    
<tr>
    <th>  <%
        String msg = (String)request.getAttribute("msg");
        if(msg!=null)
           out.print(msg);
   %>
    </th>
</tr>
</table>
</form>
</body>
</html>






