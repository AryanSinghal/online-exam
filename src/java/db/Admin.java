package db;
import static db.Admin.connect;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Admin {
    static Connection connect() throws Exception 
    {
     Class.forName("com.mysql.jdbc.Driver");
     return DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexaamination","root","aryan");
    }
public static String signup(String uname,String umobile,String uemailid,String udob,String ucllgname,String upass,String ucllgid)
{
 try
 {
     CallableStatement cs=connect().prepareCall("{call signup(?,?,?,?,?,?,?,?)}");
     cs.setString(1,uname);
     cs.setString(2,umobile);
     cs.setString(3,uemailid);
     cs.setString(4,udob);
     cs.setString(5,ucllgname);
     cs.setString(6,upass);
     cs.setString(7,ucllgid);
     cs.registerOutParameter(8,Types.VARCHAR);
     cs.execute();
     return cs.getString(8);
 }
 catch(Exception ex)
         {
             return ex.getMessage();
         }

}
public static ResultSet getData() throws Exception
  {
    return connect().prepareCall("{call getData()}").executeQuery();
  }
 public static String checkId(String ucllgid,String upass)
   {
      try
      {
         CallableStatement cs = connect().prepareCall("{call login(?,?,?)}");
         cs.setString(1, ucllgid);
         cs.setString(2, upass);
         cs.registerOutParameter(3,Types.VARCHAR);
         cs.execute();
         return cs.getString(3);
      }catch(Exception ex) { return "Sorry Exception is - "+ex.toString(); }
   }
 public static String delUser(String sno) throws Exception
  {
     try
      {
         CallableStatement cs = connect().prepareCall("{call delUser(?,?)}");
         cs.setString(1,sno);
         cs.registerOutParameter(2,Types.VARCHAR);
         cs.execute();
         return cs.getString(2);
      }catch(Exception ex) { return "Sorry Exception is - "+ex.toString(); } 
  }
 public static String deleteQ(String qno) throws Exception
  {
     try
      {
         CallableStatement cs = connect().prepareCall("{call delQ(?,?)}");
         cs.setString(1,qno);
         cs.registerOutParameter(2,Types.VARCHAR);
         cs.execute();
         return cs.getString(2);
      }catch(Exception ex) { return "Sorry Exception is - "+ex.toString(); } 
  }

    public static String saveQues(String qno, String q, String a, String b, String c, String d, String r) {
        try
     {
     CallableStatement cs=connect().prepareCall("{call addmcq(?,?,?,?,?,?,?,?)}");
     cs.setString(1,qno);
     cs.setString(2,q);
     cs.setString(3,a);
     cs.setString(4,b);
     cs.setString(5,c);
     cs.setString(6,d);
     cs.setString(7,r);
     cs.registerOutParameter(8,Types.VARCHAR);
     cs.execute();
     return cs.getString(8);
     }catch(Exception ex) { return ex.getMessage(); } 
    }
    public static String editQues(String qno, String q, String a, String b, String c, String d, String r) {
        try
     {
     CallableStatement cs=connect().prepareCall("{call editmcq(?,?,?,?,?,?,?,?)}");
     cs.setString(1,qno);
     cs.setString(2,q);
     cs.setString(3,a);
     cs.setString(4,b);
     cs.setString(5,c);
     cs.setString(6,d);
     cs.setString(7,r);
     cs.registerOutParameter(8,Types.VARCHAR);
     cs.execute();
     return cs.getString(8);
     }catch(Exception ex) { return ex.getMessage(); } 
    }

 public static int maxQ() 
    {
     try{
      CallableStatement cs=connect().prepareCall("{call maxQ(?)}");
        cs.registerOutParameter(1,Types.INTEGER);
        cs.execute();
        return cs.getInt(1);
     }catch(Exception ex) { return 0; } 
      
    }

    public static String marks(String radio,String ucllgid) {
        try
      {
         CallableStatement cs = connect().prepareCall("{call calc(?,?)}");
         cs.setString(1,radio);
         cs.setString(2,ucllgid);
         cs.execute();
         return null;
      }catch(Exception ex) { return "Sorry Exception is - "+ex.toString(); } 
      
    }
public static ResultSet getQues(int k) throws Exception
  {
      CallableStatement cs = connect().prepareCall("{call getQt(?)}");
         cs.setInt(1,k);
         cs.execute();
    return cs.getResultSet();

 }
   public static ResultSet getQt() throws Exception {
       return connect().prepareCall("{call getQ()}").executeQuery();
    }

   

}


