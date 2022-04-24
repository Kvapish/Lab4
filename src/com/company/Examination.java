package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Examination {
    static String correctingManufacturer(String str) {
        String result = "";
        str = str.strip();
        char[] ch = str.toCharArray();
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

    static int correctingPrice(int price){
        if(price>20000&&price<200000){
            return price;
        }
        else return -1;
    }
    static int correctingRAM(int ram){
        if (ram == 8 || ram == 16) {
            return ram;
        } else {
            return -1;
        }
    }
    static LocalDate correctingDate(LocalDate date){
        if (date.getYear() > 2010 && date.getYear() < 2023) {
            return date;
        } else {
            return date;
        }

    }
}
