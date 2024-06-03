import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConn1 {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/University";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "40427034004";

    public static void main(String[] args) throws SQLException {
        Connection connect = null;

        try{
            connect= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            connect.setAutoCommit(false);

            PreparedStatement pr = connect.prepareStatement("INSERT INTO student(student_name,student_class) VALUES(?,?)");

            pr.setString(1,"Jhon");
            pr.setInt(2,1);
            pr.executeUpdate();

            if (true){
                throw new  SQLException();
            }

            pr.setString(1,"Doe");
            pr.setInt(2,4);
            pr.executeUpdate();

            connect.commit();
            pr.close();
            connect.close();
        }catch (SQLException e){
            if (connect!=null){
                connect.rollback();
            }
            System.out.println(e.getMessage());
        }
    }
}
