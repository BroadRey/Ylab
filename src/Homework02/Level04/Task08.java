package Homework02.Level04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
