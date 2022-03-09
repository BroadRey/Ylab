package Homework02.Level04;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println("Меня зовут " + name + "\n" +
                "Я родился " + d + "." + m + "." + y);
    }
}
