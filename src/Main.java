import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        int iOS = 0;
        int Android = 1;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == Android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Мы не поодерживаем вашу версию");
        }

        // Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            if (clientOS == iOS) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear >= 2015) {
                if (clientOS == iOS) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }

        // Задача 3
        System.out.println("Задача 3");
        int year = 2021;
        int year4 = year % 4;// Для определения года, кратного 4 (високосный)
        int year100 = year % 100;// Для определения года, кратного 100 (невисокосный)
        int year400 = year % 400;// Для определения года, кратного 400 (високосный)
        if (year4 == 0 && year100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year4 == 0 && year100 == 0) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int day20km = 1;// Количество дней доставки при расстоянии до 20 км
        int day60km = 2;// Количество дней доставки при расстоянии от 20 до 60 км
        int day100km = 3;// Количество дней доставки при расстоянии от 60 до 100 км
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day20km);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + day60km);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + day100km);
        } else {
            System.out.println("Доставки нет");
        }

        // Задача 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Это - зимний месяц");
                break;
            case 3, 4, 5:
                System.out.println("Это - весенний месяц");
                break;
            case 6, 7, 8:
                System.out.println("Это - летний месяц");
                break;
            case 9, 10, 11:
                System.out.println("Это - осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}
