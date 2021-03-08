package com.company;
import java.sql.SQLException;
import java.util.Scanner;
public class Main {

    static String name;
    static String surname;
    static String pol;
    static String phone;
    static int numM;
    static String otvetOfA;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Customer cust = new Customer();
        places places = new places();
        mults mults = new mults();

        BackFilms back = new BackFilms();

        Arenda arr = new Arenda();

        Arenda_mults Arenda = new Arenda_mults();


        menu menu = new menu();
        Scanner in = new Scanner(System.in);

        System.out.println("Представьтесь, пожалуйста");// Данные для ввода данных пользователя

        System.out.println("Ваше имя: ");
        setName(in.next());

        System.out.println("Введите номер телефона");
        setPhone(in.next());

        System.out.println("Ваша фамилия: ");
        setSurname(in.next());

        System.out.println("Введите ваш пол male or female");
        setPol(in.next());

        menu.Menu(); // Это меню, ее можно подробно увидеть в классе menu

        String deis = in.next();
        if (deis.equals("1")) // Кино театр
        {
            System.out.println("Мультфильмы на сегодня");// Список Фильмов
            try {
                mults.getMults("mult");
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("Выберите то что вам по душе"); // и выбор

            setNumM(in.nextInt());

            try {
                places.viewPlace(); // Просмотр кол-во мест
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try {
                cust.insertCustomer(); // Добавление данных от пользователя в базу данных
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        if (deis.equals("2")){ // Прокат фильмов
            System.out.println("Мультфильмы которые можно взять: ");
            try {
                Arenda.get_Arenda_mults("arenda_films");// данные с таблицы
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("Выберите то что вам по душе"); // выбор фильма для проката
            setOtvetOfA(in.next());
            if(getOtvetOfA().equals("1")){
                try {
                    arr.insertCustomer(); // если выбор происходит то данные пользоватея в базу данных и заказ осуществлеятся
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Arenda.QuantityLess();
                System.out.println("У вас неделя для того что бы вернуть фильм, приятного время провождения)");
            }
            if(getOtvetOfA().equals("2")){// если выбор происходит то данные пользоватея в базу данных и заказ осуществлеятся
                try {
                    arr.insertCustomer();
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Arenda.QuantityLess();
                System.out.println("У вас неделя для того что бы вернуть фильм, приятного время провождения)");
            }
            if(getOtvetOfA().equals("3")){// если выбор происходит то данные пользоватея в базу данных и заказ осуществлеятся
                try {
                    arr.insertCustomer();
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Arenda.QuantityLess();
                System.out.println("У вас неделя для того что бы вернуть фильм, приятного время провождения)");
            }
            if(getOtvetOfA().equals("4")){// если выбор происходит то данные пользоватея в базу данных и заказ осуществлеятся
                try {
                    arr.insertCustomer();
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Arenda.QuantityLess();
                System.out.println("У вас неделя для того что бы вернуть фильм, приятного время провождения)");
            }
        }
        if (deis.equals("3")){ // подарок или же вернуть книг)
            System.out.println("Мультфильмы которые можно вернуть или подарить: ");
            try {
                Arenda.get_Arenda_mults("arenda_films");
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("Выберите мульт");

            setOtvetOfA(in.next()); // выбор фильма для возвращения
            if(getOtvetOfA().equals("1")){

                back.QuantityUp(); // Вызов функции
                System.out.println("Спасибо вам, берите еще)");
            }
            if(getOtvetOfA().equals("2")){
                back.QuantityUp(); // Вызов функции
                System.out.println("Спасибо вам, берите еще)");
            }
            if(getOtvetOfA().equals("3")){
                back.QuantityUp(); // Вызов функции
                System.out.println("Спасибо вам, берите еще)");
            }
            if(getOtvetOfA().equals("4")){
                back.QuantityUp(); // Вызов функции
                System.out.println("Спасибо вам, берите еще)");
            }
        }
    }

    public static String getPhone() {
        return phone;
    }

    public static void setPhone(String phone) {
        Main.phone = phone;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Main.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Main.surname = surname;
    }

    public static String getPol() {
        return pol;
    }

    public static void setPol(String pol) {
        Main.pol = pol;
    }
    public int getNumM() {
        return numM;
    }

    public static void setNumM(int numM) {
        Main.numM = numM;
    }
    public static String getOtvetOfA() {
        return otvetOfA;
    }

    public static void setOtvetOfA(String otvetOfA) {
        Main.otvetOfA = otvetOfA;
    }

}
