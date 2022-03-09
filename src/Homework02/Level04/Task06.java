package Homework02.Level04;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        System.out.println(Math.min(firstNum, secondNum));
    }
}
