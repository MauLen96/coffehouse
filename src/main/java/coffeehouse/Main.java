package coffeehouse;

import coffeehouse.Data.DB;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DB db = new DB();
        db.DataBaseConn();
        MyApp menu = new MyApp();
        menu.Start();

    }
}
