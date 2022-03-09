package Homework02.Level05.Task03;

public class Friend {
    private String name;
    private int age;
    private String sex;

    public void initialize(String name) {
        this.name = name;
        age = 11;
        sex = "Man";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        sex = "woman";
    }

    public void initialize(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
