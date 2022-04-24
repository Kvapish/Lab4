package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Examination2 {
    static int correctingNumber(int number){
        if(number > 0 &&number <= 7){
            return number;
        }
        else return -1;
    }
    static String correctingDirection(String str) {
        String result = "";
        str = str.strip();//Копирую строку
        char[] ch = str.toCharArray();//Разбиваю на символы
        for (int i = 0; i < ch.length; i++) {
            if (i == 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isUpperCase(ch[i])) {//Чтобы вводились только английские и с большой
                    result += ch[i];
                    continue;
                } else {
                    result = "Ошибка.";
                    break;
                }
            }
            if (i != 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isLowerCase(ch[i])) {//Чтобы вводились только английские и с большой
                    result += ch[i];
                } else {
                    result = "Ошибка.";
                    break;
                }
            }
        }
        return result;
    }
    static int correctingDistance(int distance){
        if(distance > 1 && distance < 1000){
            return distance;
        }
        else return -1;
    }

}
