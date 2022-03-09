package Homework02.Level04;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        int fourthNum = scanner.nextInt();

        int maxValue = Math.max(Math.max(firstNum, secondNum), Math.max(thirdNum, fourthNum));

        System.out.println(maxValue);
    }
}
