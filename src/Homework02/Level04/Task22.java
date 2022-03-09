package Homework02.Level04;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        // Алгоритм работает при условии, что все числа разные
        if ((firstNum < secondNum && firstNum > thirdNum)
                || (firstNum > secondNum && firstNum < thirdNum)) {
            System.out.println(firstNum);
        } else if ((secondNum > firstNum && secondNum < thirdNum)
                || secondNum < firstNum && secondNum > thirdNum) {
            System.out.println(secondNum);
        } else {
            System.out.println(thirdNum);
        }
    }
}
