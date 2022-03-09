package Homework02.Level05.Task20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int max = scanner.nextInt();
        N--;

        int nextNum;
        while (N-- > 0) {
            nextNum = scanner.nextInt();
            if (nextNum > max) {
                max = nextNum;
            }
        }

        System.out.println(max);
    }
}
