import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/University";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "40427034004";

    public static void main(String[] args) throws SQLException {
        Connection connect = null;

        /*
        **Veri SİLME İŞLEMİ
        String stSql="DELETE FROM student WHERE student_id=4";
        String prSql="DELETE FROM student WHERE student_id=?";
        */

        /*
        **Veri Güncelleme işlemi.
        String stSql = "UPDATE student SET student_name='Oğuz SALİ' WHERE student_id=1";
        String prSql="UPDATE student SET student_name=? WHERE student_id=?";*/
        /*

        **VERİ EKLEME İŞLEMİ.
        //String sql ="SELECT * FROM student";
        //String insertSql="INSERT INTO student(student_name,student_class)   VALUES('Damla','4')";
        String prSql="INSERT INTO student(student_name,student_class)   VALUES(?,?)";*/

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            /*
            Statement st= connect.createStatement();
            **Bu işlem adımları databaseden veri çekerken kullanılır.
            ResultSet data= st.executeQuery(sql);
            while (data.next()){
                System.out.println("ID: "+data.getInt("student_id"));
                System.out.println("AD:"+data.getString("student_name"));
                System.out.println("Sınıf: "+ data.getInt("student_class"));
                System.out.println("===========");
            }*/
            //System.out.println(st.executeUpdate(insertSql));
            /*
            **Hazırlanmış statemnt şeklinde yukarda verilen şekilde veriyi doldurup veritabanına ekliyoruz.
            PreparedStatement prSt=connect.prepareStatement(prSql);
            prSt.setString(1,"Ahmet");
            prSt.setInt(2,5);
            prSt.executeUpdate();
            prSt.close();*/

            /*
            **Veri GÜNCELLEME İŞLEMİ
            //Statement st = connect.createStatement();
            //st.executeUpdate(stSql);
            PreparedStatement pr= connect.prepareStatement(prSql);
            pr.setString(1,"Mahmut Keser");
            pr.setInt(2,1);
            pr.executeUpdate();*/

            /*
            //Veri Silme
            Statement st = connect.createStatement();
            st.executeUpdate(stSql);

            PreparedStatement  pr= connect.prepareStatement(prSql);
            pr.setInt(1,3);
            pr.executeUpdate();*/



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
