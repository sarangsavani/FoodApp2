
import java.sql.*;

//database connection class
public class Db {

    public static void main(String[] args) {

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection conn = DriverManager.getConnection("jdbc:odbc:Test");            //Driver for database

            Statement st = conn.createStatement();

            String sql = "Select * from Foods";             //SQL command

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println("\n" + rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
