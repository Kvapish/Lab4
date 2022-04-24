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





/**
 * ADVANCED
 * N поезда
 * Направление
 * Время прибытия
 * Время отбытия
 * Расстояние
 * <p>
 * Вывести данные о поездах, пребывающих в пути более
 * суток.

public static void second() {

}
class Train {

    private int Number;

    public void setNumber(int number) {
        if (number >= 1 && number <= 7) {
            Number = number;
        } else {
            System.out.println("Введите корректный номер поезда.");
        }
    }

    public int getNumber() {
        if (Number == 0) {
            System.exit(0);
        }
        return Number;
    }

    private String Direction = "";

    public void setDirection(String direction) {
        String Direction[] = new String[7];
        Direction[0] = "Киев";
        Direction[1] = "Николаев";
        Direction[2] = "Херсон";
        Direction[3] = "Львов";
        Direction[4] = "Харьков";
        Direction[5] = "Днепр";
        Direction[6] = "Умань";
        for (int i = 0; i < Direction.length; i++) {
            if (direction.equals(Direction[i])) {
                this.Direction = direction;
                break;
            } else if (i == Direction.length - 1) {
                System.out.println("Введите корректное направление.");
            }
        }
    }

    public String getDirection() {
        return Direction;
    }

    private LocalDateTime Arrival;

    public void setArrival(int day,int hours,int minutes) {
        if (day<=30 && hours<22 && minutes<=60){
           Arrival = LocalDateTime.of(2022,4,day,hours,minutes);
        }
        else {
            System.out.println("Введена не корректная дата прибытия.");
        }
    }
    public LocalDateTime getArrival() {
        return Arrival;
    }

    private LocalDateTime Departure;

    public void setDeparture(int day,int hours,int minutes) {
            if (day<30 && hours<22 && minutes<60){
                Departure = LocalDateTime.of(2022,4,day,hours,minutes);
            }
            else {
                System.out.println("Введена не корректная дата отбытия.");
            }
    }

    public LocalDateTime getDeparture() {
        return Departure;
    }


    private int Distance;

    public void setDistance(int distance) {
        if (distance >= 250 && distance <= 1000) {
            Distance = distance;
        } else {
            System.out.println("Вы ввели не корректное растояние.");
        }
    }

    public int getDistance() {
        if (Distance == 0) {
            System.exit(0);
        }
        return Distance;
    }
    public void getInfo(){
        System.out.println("Номер поезда : "+getNumber()+" Направление : Одесса- "+getDirection()+" Время прибытие : "+getArrival()+" Время отбытие : "+getDeparture()+" Растояние: "+getDistance()+"км");
    }
}
 */






    /*public static void second() {
        Train [] trains = new Train[7];
        String [] Direction = new String[7];
        Direction[0] = "Киев";
        Direction[1] = "Николаев";
        Direction[2] = "Херсон";
        Direction[3] = "Львов";
        Direction[4] = "Харьков";
        Direction[5] = "Днепр";
        Direction[6] = "Умань";
        int min=1;
        for (int i = 0; i < trains.length; i++) {
            trains[i]= new Train();
            trains[i].setNumber(((int)(Math.random()*7)+1));
            trains[i].setDirection(Direction[(int) (Math.random()*7)]);
            trains[i].setDistance((int) ((Math.random() * 750) +251));
            trains[i].setArrival(((int)(Math.random()*29)+1),((int)(Math.random()*21)+1),((int)(Math.random()*59)+1));
            trains[i].setDeparture(((int)(Math.random()*29)+1),((int)(Math.random()*21)+1),((int)(Math.random()*59)+1));

            trains[i].getInfo();

        }

    }
}*/


