package Homework02.Level05;

public class Task01 {
    static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            if (weight == anotherCat.weight && strength > anotherCat.strength) {
                return true;
            } else if (weight == anotherCat.weight && strength < anotherCat.strength) {
                return false;
            }

            return age > anotherCat.age;
        }
    }

    public static void main(String[] args) {
        Cat vasyaCat = new Cat("Вася", 22, 3, 45);
        Cat petyaCat = new Cat("Петя", 23, 2, 43);
        Cat murzikCat = new Cat("Мурзик", 33, 4, 22);

        System.out.println(vasyaCat.fight(petyaCat));
        System.out.println(petyaCat.fight(vasyaCat));
        System.out.println(murzikCat.fight(petyaCat));
    }
}