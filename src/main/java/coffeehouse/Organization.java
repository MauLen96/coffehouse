package coffeehouse;

import Order.Order;
import coffeehouse.Data.DB;
import coffeehouse.entities.Customer;

import java.sql.*;

public class Organization {
    DB db  = new DB();
    String add;
    public void ShowMenu() throws SQLException, ClassNotFoundException {
        Connection connection = db.DataBaseConn();
        Statement statement = db.DataBaseConn().createStatement();
        try {
            String sql2  = "select * from menu";
            ResultSet resultSet = statement.executeQuery(sql2);
            while (resultSet.next()){
                System.out.println( resultSet.getString(1) + " " + resultSet.getString(2)+ " " + resultSet.getString(3) + " " + resultSet.getString(4));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


    public void takeOrder(Order order) throws SQLException, ClassNotFoundException {
        Statement statement = db.DataBaseConn().createStatement();
        Connection connection = db.DataBaseConn();
        try {
            String sql2 = " insert into order ( id_prod , name_prod) values (? , ?)";
            PreparedStatement pr = connection.prepareStatement(sql2);
            pr.setInt(1 , order.getId_prod());
            pr.setString(2 , order.getName_prod());
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                System.out.println( " your order :  " + " id of order" + resultSet.getString(1) + " name of product " + resultSet.getString(2) );
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
//    public void paytoOrder() throws SQLException, ClassNotFoundException {
//
//        Connection connection = db.DataBaseConn();
//        String sql = "";
//        Customer customer = new Customer();
//        customer.payToOrder(500);
//        PreparedStatement preparedStatement = connection.prepareStatement()
//
//


    public void AddMenu() throws SQLException, ClassNotFoundException {
        Connection connection = db.DataBaseConn();
        try {
            String sql = " insert into ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }



}
