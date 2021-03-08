package com.company;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Arenda extends DB{
    Main main = new Main();

    public void insertCustomer() throws SQLException, ClassNotFoundException {

        String sql = "INSERT INTO `customer_arenda` (Name, Surname, phone_number, id_f) VALUES (?, ?, ?, ?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(sql);

        prSt.setString(1, main.getName());
        prSt.setString(2, main.getSurname());
        prSt.setString(3, main.getPhone());
        prSt.setString(4, main.getOtvetOfA());

        prSt.executeUpdate();
    }
}
