

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


//database connection class
public class Db {

    public static void main(String[] args) {
 
            Connection myData = null;

            Statement myStat = null;

            ResultSet myRes = null;

            
            try{
                myData = DriverManager.getConnection("jdbc:derby://localhost:1527/MyDataBase", "APP", "APP");
            }
            catch (SQLException e){
                e.printStackTrace();
                
                
            }
    }
}


