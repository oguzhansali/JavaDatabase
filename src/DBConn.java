import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    public static final String DB_URL="jdbc:postgresql://localhost:5432/University";
    public static final String DB_USER="postgres";
    public static final String DB_PASSWORD="40427034004";

    public static void main(String[] args) throws SQLException {
        try{
            Connection connect = null;
            connect= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
