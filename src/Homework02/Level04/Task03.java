package Homework02.Level04;

public class Task03 {
    static class Cat {
        private static int catsCount = 0;

        public static void setCatsCount(int catsCount) {
                //написать тут ваш код
            Cat.catsCount = catsCount;
        }
    }

    public static void main(String[] args) {
        Cat.setCatsCount(5);
        System.out.println(Cat.catsCount);
    }
}
