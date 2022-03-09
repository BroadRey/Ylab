package Homework02.Level05.Task16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next;
        int sum = 0;

        while (scanner.hasNext()) {
            next = scanner.next();

            if (next.equals("сумма")) {
                System.out.println(sum);
                break;
            }

            sum += Integer.parseInt(next);
        }
    }
}
