package Homework02.Level04;

public class Task14 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        while (i++ < 10) {
            while (j++ < 10) {
                System.out.print("S");
            }

            System.out.println();
            j = 0;
        }
    }
}
