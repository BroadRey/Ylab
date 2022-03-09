package Homework02.Level04;

public class Task04 {
    static class Cat {
        private String fullName;

        public void setName(String firstName, String lastName) {
            String fullName = firstName + lastName;
            this.fullName = fullName;
        }

        @Override
        public String toString() {
            return fullName;
        }
    }

    public static void main(String[] args) {
        Cat kittyCat = new Cat();

        kittyCat.setName("Kitty", "Cat");
        System.out.println(kittyCat);
    }
}
