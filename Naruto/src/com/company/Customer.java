package com.company;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Customer extends DB {
    Main main = new Main();

    public void insertCustomer() throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO `customeDetails` (Customer_name, Customer_Surname, Phone, idOfM) VALUES (?, ?, ?, ?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(sql);

        prSt.setString(1, main.getName());
        prSt.setString(2, main.getSurname());
        prSt.setString(3, main.getPhone());
        prSt.setString(4, String.valueOf(main.getNumM()));

        prSt.executeUpdate();
    }
}
