package employee.management.system;

import java.sql.*;
public class conn {

    Connection connection;
    Statement stmt;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pavantn","root","pavantn112@#");
            stmt=connection.createStatement();


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
