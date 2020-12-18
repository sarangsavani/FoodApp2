
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    private static Connection con;
    private static boolean hadData = false;

    public static Connection connect() {
        if (con == null);
        getConnection();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:myDBbrowser.db"); //link to the database
            System.out.println("Connected"); //if it works then this message will show
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e + "");
        }
        return con;
    }

    private static void getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
