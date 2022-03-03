package Homework1.Level02;

public class Task05 {
    private static class Cat {
        Woman owner;

        public Cat(Woman owner) {
            this.owner = owner;
        }
    }

    private static class Dog {
        Woman owner;

        public Dog(Woman owner) {
            this.owner = owner;
        }
    }

    private static class Fish {
        Woman owner;

        public Fish(Woman owner) {
            this.owner = owner;
        }
    }

    private static class Woman {

    }

    public static void main(String[] args) {
        Woman woman1 = new Woman();
        Woman woman2 = new Woman();
        Woman woman3 = new Woman();

        Cat cat1 = new Cat(woman1);
        Dog dog1 = new Dog(woman2);
        Fish fish1 = new Fish(woman3);
    }
}
