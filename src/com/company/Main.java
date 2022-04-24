package com.company;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        // write your code here
        first();
        // second();

    }
    /**
     * BASIC
     * Производитель
     * Процессор
     * Объем оперативной памяти
     * Дата изготовления
     * Цена
     * <p>
     * Определить компьютер, изготовленный фирмой Dell с
     * минимальной ценой и вывести все сведения о нем.
     */
    public static void first() {
        final Computer computer1 = new Computer("Apple","Intel Core I5",8,LocalDate.of(2021,4,5),95000);
        final Computer computer2 = new Computer("Samsung","Intel Core I7",16,LocalDate.of(2022,10,3),124500);
        final Computer computer3 = new Computer("Asus","Intel Core I3",16,LocalDate.of(2018,8,7),21500);
        final Computer computer4 = new Computer("Dell","Intel Core I7",16,LocalDate.of(2022,1,1),160000);
        final Computer computer5 = new Computer("Xiaomi","AMD Ryzen 3",8,LocalDate.of(2015,1,2),50000);
        final Computer computer6 = new Computer("Dell","AMD Ryzen 5",16,LocalDate.of(2019,12,1),89000);


        System.out.println();



        final Computers computers = new Computers(6);
        computers.addComputer(computer1);
        computers.addComputer(computer2);
        computers.addComputer(computer3);
        computers.addComputer(computer4);
        computers.addComputer(computer5);
        computers.addComputer(computer6);
        System.out.println(computers);
        System.out.println();
        System.out.println(computers.findDell());
    }
}







