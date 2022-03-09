package Homework02.Level05.Task15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");
        // Вывод текущей даты и времени с использованием toString()
        System.out.println(simpleDateFormat.format(date));
    }
}
