package Homework02.Level05.Task18;

import java.util.Scanner;

public class Main {
    private static int minNum(int... nums) {
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        int fourthNum = scanner.nextInt();
        int fifthNum = scanner.nextInt();

        System.out.println(minNum(fifthNum, secondNum, thirdNum, fourthNum, fifthNum));
    }
}
