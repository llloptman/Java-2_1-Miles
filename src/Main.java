import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Узнайте сколько бонусных Миль вы получите");
        Scanner priceScaner = new Scanner(System.in);
        System.out.println("Введите цену билета без копеек и валюты");

        int price = Integer.parseInt(priceScaner.nextLine());
        int delimetr = 20;
        int miles = price / delimetr;


        System.out.println("Вы получите " + miles +" миль"); //Когда нибудь нужно заморочиться и сделать норм окончание для миль в зависимости от результата



    }
}
