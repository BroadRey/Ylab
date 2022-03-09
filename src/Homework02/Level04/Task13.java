package Homework02.Level04;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int num = scanner.nextInt();

        int i = num;
        while (i-- > 0) {
            System.out.println(str);
        }
    }
}
