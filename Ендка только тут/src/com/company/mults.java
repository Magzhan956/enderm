package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mults extends DB {
    public void getMults(String table) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM " + table;


        Statement statement = getDbConnection().createStatement();
        ResultSet res = statement.executeQuery(sql);
        while(res.next()) {
            System.out.print("Названия Мультфильма: ");

            System.out.println(res.getString("Name"));

            System.out.print("Начало сеанса: ");

            System.out.println(res.getString("Start"));

            System.out.print("Конец сеанса: ");

            System.out.println(res.getString("End"));

            System.out.print("длительность мультика: ");

            System.out.println(res.getString("time"));

            System.out.print("Год выхода: ");

            System.out.println(res.getString("date"));

            System.out.print("Цена: ");

            System.out.println(res.getString("price"));

            System.out.print("Номер сеанса: ");

            System.out.println(res.getString("id"));

            System.out.println("----------------------------------");

        }
    }
}
