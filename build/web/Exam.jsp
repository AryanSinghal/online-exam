
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
              <%  
               ResultSet rs = db.Admin.getQt();
               ResultSetMetaData mt = rs.getMetaData();
            // int ms = Admin.maxQ();
               while(rs.next())
               {

          %>
     <body bgcolor=lightyellow><tt>
    <form action="Exam_1" method="post">
    <center><table width=98% border=0>
            
Q U E S T I O N <tr><td colspan="2"> <%rs.getString(2);%></td></tr>   
         <tr>
             <td><input type=radio name=r value=a /><%rs.getString(3);%>
             <td><input type=radio name=r value=b /><%rs.getString(4);%>    
         </tr>
         <tr>
             <td><input type=radio name=r value=c /><%rs.getString(5);%>
             <td><input type=radio name=r value=d /><%rs.getString(6);%>    
         </tr>
         <tr>
         <td>  <input type="submit" value="N E X T  Q U E S T I O N" /></td> 
         <td><input type="reset" value="C A N C E L" /></td>
    
             
         </tr>
         
         </tt>
       </table>
     </form>
</body>
<%
   
    }
        String msg = (String)request.getAttribute("msg");
        if(msg!=null)
           out.print(msg);
 %>