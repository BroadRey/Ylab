package Homework1.Level03;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");
    }
}
