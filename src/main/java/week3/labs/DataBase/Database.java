package week3.labs.DataBase;

import java.sql.*;
public class Database {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "root";
    private static String PASSWORD = "root";

    private Connection connection = null;

    public Database(){
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME,PASSWORD);

        }catch (SQLException e){
                throw new RuntimeException(e);
        }
    }
    public void getAllTask() throws SQLException{
     PreparedStatement statement = this.
                                        connection.
                                        prepareStatement("SELECT task_description, task_status FROM tasks");
     ResultSet rs = statement.executeQuery();

     while (rs.next()){
         System.out.println(" - " + rs.getString("task_description") +
                 " - " + rs.getString("task_status"));
     }
    }
    public void getTaskbyID(int TaskID) throws SQLException{
            PreparedStatement statment = this
                                        .connection
                                        .prepareStatement("SELECT * FROM tasks WHERE id = ?");
            statment.setInt(1,TaskID);
            ResultSet rs = statment.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("task_description"));
                System.out.println(rs.getString("task_status"));
            }
    }

}
