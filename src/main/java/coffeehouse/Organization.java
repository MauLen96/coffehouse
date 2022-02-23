package coffeehouse;

import coffeehouse.Data.DB;

import java.sql.*;

public class Organization {
    DB db  = new DB();
    String add;
    public void ShowMenu() throws SQLException, ClassNotFoundException {
        Connection connection = db.DataBaseConn();
        try {
            Statement statement = connection.createStatement();
            String sql2  = "select * from menu";
            PreparedStatement preparedStatement = connection.prepareStatement(sql2);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println( resultSet.getString(1) +" " + resultSet.getString(2) + " " + resultSet.getString(3));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void EditMenu(){
        Connection connection = db.DataBaseConn();
        try {
            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement(sql2);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println( resultSet.getString(1) +" " + resultSet.getString(2) + " " + resultSet.getString(3));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    }
}
