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
            String sql = "select * from menu";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);


        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
