package Homework1.Level02;

public class Task02 {
    private static class Dog {
        String name;

        public Dog(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Dog dogMax = new Dog("Max");
        Dog dogBella = new Dog("Bella");
        Dog dogJack = new Dog("Jack");
    }
}
