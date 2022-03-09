package Homework02.Level05.Task13;

public class Solution {
    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static void main(String[] args) {
        Man bobMan = new Man("Bob", 22, "Moscow");
        Man mikeMan = new Man("Mike", 24, "Kiev");

        Woman rozaWoman = new Woman("Roza", 43, "Saratov");
        Woman olgaWoman = new Woman("Olga", 34, "Tver'");

        System.out.println(bobMan);
        System.out.println(mikeMan);
        System.out.println(rozaWoman);
        System.out.println(olgaWoman);
    }
}
