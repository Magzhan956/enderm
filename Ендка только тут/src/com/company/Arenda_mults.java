package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Arenda_mults extends DB {
    public void get_Arenda_mults(String table) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM " + table;

        Statement statement = getDbConnection().createStatement();
        ResultSet res = statement.executeQuery(sql);
        while (res.next()) {
            System.out.print("Названия Мультфильма: ");

            System.out.println(res.getString("Name"));

            System.out.print("Количество: ");

            System.out.println(res.getString("Quantity"));

            System.out.print("Жанр: ");

            System.out.println(res.getString("Genre"));

            System.out.print("Год выхода: ");

            System.out.println(res.getString("Date"));

            System.out.print("Номер фильма: ");

            System.out.println(res.getString("ID"));

            System.out.println("--------------------------------");

        }
    }

    public void QuantityLess() throws SQLException, ClassNotFoundException {
        Main main = new Main();

        String sql = "UPDATE `arenda_films` SET `Quantity` = ? WHERE `ID` = " + main.getOtvetOfA();

        String SQL = "SELECT * FROM arenda_films WHERE ID = " + main.getOtvetOfA();

        Statement statement = getDbConnection().createStatement();
        ResultSet res = statement.executeQuery(SQL);
        while (res.next()) {
            String a = res.getString("Quantity");

            int num = Integer.parseInt(a);
            num--;
            String b = String.valueOf(num);

            PreparedStatement prSt = getDbConnection().prepareStatement(sql);
            prSt.setString(1, b);

            prSt.executeUpdate();
        }
    }
}