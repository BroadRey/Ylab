package Homework02.Level04;

public class Task05 {
    static class Cat {
        static int count;

        Cat() {
            count++;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println("Cats count is " + Cat.count);
    }
}
