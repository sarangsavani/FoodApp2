
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
//database connection class
public class Db {

    public static void main(String[] args) {

        Connection myData = null;

        Statement myStat = null;

        ResultSet myRes = null;

        try {
            myData = DriverManager.getConnection("jdbc:sqlite:myDBbrowser.db");
        } catch (SQLException ex) {
            Logger.getLogger(Db.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
    }
}
 
 */
public class Db {

    public static Connection connect() {
        connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:myDBbrowser.db");
            System.out.println("Connected");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e + "");
        }
        return con;
    }
}
