package Homework02.Level04;

public class Task15 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i < 11) {
            while (j < 11) {
                System.out.print(i * j + " ");
                j++;
            }

            System.out.println();
            i++;
            j = 1;
        }
    }
}
