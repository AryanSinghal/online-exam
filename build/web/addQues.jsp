<body bgcolor=#9978>
    <form action="saveQ" method="POST">
   
     <table>
     <tr> <th>  Q<input type="text" name="qno" value="" size="2" maxlength="2" /></th>
         <th colspan="5"> <textarea name="q" rows="2" cols="150"> 

                   
 
            </textarea></th> </tr>
     <tr>
         <th>a</th><th><input type="radio"  name="r" value="a" /></th>
         <th> <textarea name="a" rows="2" placeholder="option a" cols="40"> 
         </textarea> </th>
       <th> b</th><th><input type="radio" name="r" value="b" /></th>
       <th>
           <textarea name="b" rows="2" placeholder="option b" cols="40"> 
               
             </textarea></th><tr> 
        <tr>
         <th>c</th><th><input type="radio" name="r" value="c" /></th>
         <th> <textarea name="c" placeholder="option c" rows="2" cols="40"> 
                  
         </textarea> </th>
       <th> d</th><th><input type="radio" name="r" value="d" /></th>
       <th>
           <textarea name="d" placeholder="option d" rows="2" cols="40"> 
                
           </textarea></th><tr> 
             </table>
            
        <pre>
        <br><br><br><br><br>    
                                                    <input type="submit" value="N E X T  Q U E S T I O N" />           <input type="reset" value="C A N C E L" />
       


        <%
        String msg = (String)request.getAttribute("msg");
        if(msg!=null)
           out.print(msg);
        %>  


<h2>
<a href="Welcome.jsp">DONE</a>

<a href="editQuestion.jsp">Update Question</a> 

</h2>
        </pre>



    
    </form>
</body>