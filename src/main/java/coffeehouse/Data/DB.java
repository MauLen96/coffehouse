package coffeehouse.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    public Connection DataBaseConn() throws SQLException, ClassNotFoundException{
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres" , "postgres" , "2295429!");
            return connection;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
