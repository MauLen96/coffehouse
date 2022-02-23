package coffeehouse;

import coffeehouse.Data.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Organization {
    DB db  = new DB();

    public void ShowMenu() throws SQLException, ClassNotFoundException {
        Connection connection = db.DataBaseConn();
        try {
            String sql = "insert into menu( name , price ) values (? , ?)";
            String sql2  = "select * from menu";
            PreparedStatement preparedStatement = connection.prepareStatement(sql2);
//            preparedStatement.setString(1 , "sssssss");
//            preparedStatement.setInt(2 , 500);
            preparedStatement.executeQuery();


        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
