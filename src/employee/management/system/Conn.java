package employee.management.system;


import java.sql.*;
import java.sql.Statement;
        

public class Conn {
    Connection c;
    Statement s;
    
    public Conn(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem","root","ishwarmishra");
            s=c.createStatement();
        
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
