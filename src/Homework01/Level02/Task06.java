package Homework01.Level02;

public class Task06 {
    public static int binaryMin(int first, int second) {
        return Math.min(first, second);
    }

    public static int binaryMax(int first, int second) {
        return Math.max(first, second);
    }

    public static int tripleMin(int first, int second, int third) {
        return binaryMin(binaryMin(first, second), third);
    }

    public static int quadrupleMin(int first, int second, int third, int fourth) {
        return binaryMin(tripleMin(first, second, third), fourth);
    }

    public static void tripleStringLn(String str) {
        System.out.printf("%s\n%s\n%s", str, str, str);
    }

    public static void tripleString(String str) {
        System.out.printf("%s %s %s", str, str, str);
    }
}
