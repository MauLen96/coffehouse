package coffeehouse;

import coffeehouse.Data.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Organization {
    DB db  = new DB();
    String add;
    public void ShowMenu() throws SQLException, ClassNotFoundException {
        Connection connection = db.DataBaseConn();
        try {
            String sql = "select * from menu";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeQuery();


        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
