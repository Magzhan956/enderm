package com.company;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class places extends DB {
    Main phone = new Main();

    Scanner in = new Scanner(System.in);


    public void viewPlace() throws ClassNotFoundException, SQLException {



        String sql = "SELECT * FROM places WHERE `id_room` = " + phone.getNumM();

        Statement state = getDbConnection().createStatement();
        ResultSet res1 = state.executeQuery(sql);

        while (res1.next()) {
            System.out.println("Выбранное вами мультфильм пройдет/проходит в зале под номером: ");
            System.out.println(res1.getString("id_room"));

            System.out.println("Все места в этом зале: ");
            System.out.println(res1.getString("all_p"));

            System.out.println("Свободные места в этом зале: ");
            System.out.println(res1.getInt("free"));
            System.out.println("Занятые места в этом зале: ");
            System.out.println(res1.getInt("not_free"));

            System.out.println("Хотите ли вы купить билет?");
            System.out.println("YES OR NO");
            String otvet = in.next();
            if (otvet.equals("YES")) {
                String sql1 = "UPDATE `places` SET `free` = ? WHERE `id_room` = " + phone.getNumM();

                    String p = res1.getString("free");
                    String c = res1.getString("not_free");

                int num = Integer.parseInt(p);
                num--;
                String b = String.valueOf(num);

                PreparedStatement prSt1 = getDbConnection().prepareStatement(sql1);
                prSt1.setString(1, b);

                prSt1.executeUpdate();
                String sql2 = "UPDATE `places` SET `not_free` = ? WHERE `id_room` = " + phone.getNumM();

                int n = Integer.parseInt(c);
                n++;
                String m = String.valueOf(n);

                PreparedStatement prSt2 = getDbConnection().prepareStatement(sql2);
                prSt2.setString(1, m);

                prSt2.executeUpdate();

                System.out.println("ВАШ ЗАКАЗ УСПЕШНО СОВЕРШЕН!!!");
            }
        }
    }
}