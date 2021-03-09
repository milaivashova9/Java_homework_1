package ru.geekbrains.java.level1.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        repeatGame();
    }

        public static Random rand = new Random();

        public static void theGame () {
            System.out.println("Ваша задача угадать число, загаданное компьютером.");
            System.out.println("У вас есть 3 попытки");
            int answer = rand.nextInt(10);
            int counter = 3;
            int x;
            do {
                System.out.println("Ваши догадки: ");
                Scanner scanner = new Scanner(System.in);
                x = scanner.nextInt();
                if (x < answer) {
                    System.out.println("Загаданное число больше.");
                    counter--;
                    System.out.println("Осталось попыток: " + counter);
                } else if (x > answer) {
                    System.out.println("Загаданное число меньше.");
                    counter--;
                    System.out.println("Осталось попыток: " + counter);
                } else {
                    System.out.println("Поздавляем, Вы угадали.");
                }
                if (counter == 0) {
                    System.out.println("Вы проиграли. Попыток не осталось.");
                }
            } while (counter > 0 && x != answer);
        }

        public static void repeatGame () {
            int repeat;
            do {
                theGame();
                System.out.println("Повторить игру ещё раз? 1 - да/0 - нет.");
                Scanner scanner = new Scanner(System.in);
                repeat = scanner.nextInt();
            } while (repeat == 1);
        }
    }

