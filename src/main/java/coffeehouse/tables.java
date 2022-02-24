package coffeehouse;

import coffeehouse.Data.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tables {

    public void TableOrder() throws SQLException, ClassNotFoundException {
        System.out.println("----");
        DB db = new DB();
        db.DataBaseConn();
        Connection connection = db.DataBaseConn();
        PreparedStatement preparedStatement = connection.prepareStatement("create table order_table (id_p int , name_p varchar (50))");
        preparedStatement.executeUpdate();
    }
}