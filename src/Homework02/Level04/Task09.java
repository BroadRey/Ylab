package Homework02.Level04;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String secondName = scanner.next();

        if (firstName.equals(secondName)) {
            System.out.println("Имена идентичны");
        } else if (firstName.length() == secondName.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
