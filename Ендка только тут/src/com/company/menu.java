package com.company;
import java.util.Scanner;
public class menu extends Main {
    Scanner in = new Scanner(System.in);

    public void Menu(){

        if (getPol().equals("male")) {
            System.out.println("Здравствуйте мистер " + getName());
            System.out.println("В нашем центре по прокату мультфильмов Fairy Tail, можно совершать следующие действия: ");
            System.out.println("1: Посмотреть мультфильм прямо здесь в кинотеатре");
            System.out.println("2: Взять мультик/мультики на время");
            System.out.println("3: Вернуть мультик/мультики, если вы ее брали");
            System.out.println("----------------------------------------");
            System.out.println("Выберите одно действие");
        }
        if (getPol().equals("female")) {
            System.out.println("Здравствуйте миссис " + getName());
            System.out.println("В нашем центре по прокату мультфильмов Fairy Tail, можно совершать следующие действия: ");
            System.out.println("1: Посмотреть мультфильм прямо здесь в кинотеатре");
            System.out.println("2: Взять мультик/мультики на время");
            System.out.println("3: Вернуть мультик/мультики, если вы ее брали или подарить");
        }
    }
}
