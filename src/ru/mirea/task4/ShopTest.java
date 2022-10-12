package ru.mirea.task4;

import java.util.Arrays;
import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Catalogs[] catalogs = Catalogs.values();
        System.out.println(Arrays.toString(catalogs));
        System.out.println("Выберите категорию! Если нужны аксессуары, напишите '1', если одежда, то '2', а если обувь, то '3': ");
        String name = sc.nextLine();
        String product = "";
        switch (name){
            case "1":
                Accessores[] accessores = Accessores.values();
                System.out.println(Arrays.toString(accessores));
                System.out.println("Выберите вещь! 1-очки, 2-шарф, 3-сумка : ");
                name = sc.nextLine();
                switch (name){
                    case "1":
                        System.out.println("Очки добавлены в вашу корзину");
                        product = "очки";
                        break;

                    case "2":
                        System.out.println("Шарф добавлен в вашу корзину");
                        product = "шарф";
                        break;

                    case "3":
                        System.out.println("Сумка добавлена в вашу корзину");
                        product = "сумка";
                        break;

                }
                break;
            case "2":
                Clothes[] clothes = Clothes.values();
                System.out.println(Arrays.toString(clothes));
                System.out.println("Выберите вещь! 1-штаны, 2-платье, 3-кофта: ");
                name = sc.nextLine();
                switch (name){
                    case "1":
                        System.out.println("Штаны добавлены в вашу корзину");
                        product = "штаны";
                        break;

                    case "2":
                        System.out.println("Платье добавлено в вашу корзину");
                        product = "платье";
                        break;

                    case "3":
                        System.out.println("Кофта добавлена в вашу корзину");
                        product = "кофта";
                        break;

                }
                break;
            case "3":
                Shoes[] shoes = Shoes.values();
                System.out.println(Arrays.toString(shoes));
                System.out.println("Выберите вещь! 1-туфли, 2-ботинки, 3-шлепки: ");
                name = sc.nextLine();
                switch (name){
                    case "1":
                        System.out.println("Туфли добавлены в вашу корзину");
                        product = "туфли";
                        break;

                    case "2":
                        System.out.println("Ботинки добавлены в вашу корзину");
                        product = "ботинки";
                        break;

                    case "3":
                        System.out.println("Шлепки добавлены в вашу корзину");
                        product = "шлепки";
                        break;

                }
                break;

            default:
                System.out.println("Вы ввели неправильно.");
                break;
        }
        System.out.println("В вашей корзине только " + product.toUpperCase() + ", хотите купить?");
        System.out.println("1 - Да, 2 - Нет");
        int choise = sc.nextInt();
        if (choise == 1){
            System.out.println("Спасибо, что пользовались нашими услугами.");
        }
        else{
            System.out.println("До свидания.");
        }
    }
}