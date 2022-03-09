package Homework02.Level04;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();

        if (age < 18){
            System.out.println("Подрасти еще, " + name);
        } else if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
