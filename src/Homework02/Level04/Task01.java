package Homework02.Level04;

public class Task01 {
    static class Cat {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Cat misiCat = new Cat();

        misiCat.setName("Misi");
        System.out.println(misiCat);
    }
}