<body bgcolor=#119999>
    <br><br>
     <%
        String msg = (String)request.getAttribute("msg");
        if(msg!=null)
           out.print(msg);
   %>   
<form action="saveinfo" method=post>
    <pre>
    <h1 align="center"> S I G N  U P </h1> 

                  


<h2>
    NAME        :  <input type="text" name="uname" placeholder="Aryan Singhal" maxlength=20/>
    
    COLLEGE ID  :  <input type="text" name="ucllgid" placeholder="1614310051" size=10 maxlength=10/>
    
    MOBILE NO.  :  <input type="text" name="umobile" placeholder="8287038510" size=10 maxlength=10/>
    
    EMAIL ID    :  <input type="text" name="uemailid" placeholder="123@gmail.com" maxlength=30/>
    
    D.O.B       :  <input type="text" name="udob" placeholder="YYYY-MM-DD" size=10 maxlength=10 />
    
    COLLEGE NAME:  <input type="text" name="ucllgname" placeholder="imsec" />
    
    PASSWORD    :  <input type="password" name="upass" placeholder="ssdaads34" />
    
          <input type=submit value="S I G N  U P" >     <input type=reset value="C A N C E L">    <a href=login.jsp><align=right >LOGIN</a>
  
</h2>    
    </pre>