package Homework02.Level04;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = -1;
        int next;

        while (scanner.hasNextInt()) {
            next = scanner.nextInt();

            if (next == -1) {
                break;
            }

            sum += next;
        }

        System.out.println(sum);
    }
}
