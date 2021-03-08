package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BackFilms extends DB{
    public void QuantityUp() throws SQLException, ClassNotFoundException {
        Main main = new Main();

        String sql = "UPDATE `arenda_films` SET `Quantity` = ? WHERE `ID` = " + main.getOtvetOfA();

        String SQL = "SELECT * FROM arenda_films WHERE ID = " + main.getOtvetOfA();

        Statement statement = getDbConnection().createStatement();
        ResultSet res = statement.executeQuery(SQL);
        while (res.next()) {
            String a = res.getString("Quantity");

            int num = Integer.parseInt(a);
            num++;
            String b = String.valueOf(num);

            PreparedStatement prSt = getDbConnection().prepareStatement(sql);
            prSt.setString(1, b);

            prSt.executeUpdate();
        }
    }
}
