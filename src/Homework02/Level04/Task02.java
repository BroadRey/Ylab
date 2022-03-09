package Homework02.Level04;

public class Task02 {
    static class Cat {
        private static int catsCount = 0;

        public static void addNewCat() {
            catsCount++;
        }
    }

    public static void main(String[] args) {
        Cat.addNewCat();
        Cat.addNewCat();

        System.out.println(Cat.catsCount);
    }
}
