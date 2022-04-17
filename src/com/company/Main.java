package com.company;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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

class Computer {

    private String Manufacturer = "";

    public void setManufacturer(String str) {
        String Name[] = new String[5];
        Name[0] = "HP";
        Name[1] = "Samsung";
        Name[2] = "Asus";
        Name[3] = "Xiaomi";
        Name[4] = "Dell";
        for (int i = 0; i < Name.length; i++) {
            if (str.equals(Name[i])) {
                Manufacturer = str;
                break;
            } else if (i == Name.length - 1) {
                System.out.println("Введите корректное название производителя.");
            }
        }
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    private String CPU = "";

    public void setCPU(String str) {
        char cc = str.charAt(0);
        int aa = (int) cc;
        if (aa >= 65 && aa <= 90) {
            CPU = str;
        } else {
            System.out.println("Введите корректное название процессора.");
        }
    }

    public String getCPU() {
        return CPU;
    }

    private int RAM;

    public void setRAM(int ram) {
        if (ram == 8 || ram == 16) {
            RAM = ram;
        } else {
            System.out.println("Введите корректное количество оперативной памяти.");
        }
    }

    public int getRAM() {
        if (RAM == 0) {
            System.exit(0);
        }
        return RAM;
    }

    private LocalDate Date;

    public void setDate(LocalDate date) {
        if (date.getYear() > 2010 && date.getYear() < 2023) {
            Date = date;
        } else {
            System.out.println("Введите корректную дату изготовления.");
            Date = LocalDate.of(1, 1, 1);
        }
    }

    public LocalDate getDate() {
        if (Date.getYear() == 1) {
            System.exit(0);
        }
        return Date;
    }

    private int Price;

    public void setPrice(int price) {
        if (price > 20000 && price < 250000) {
            Price = price;
        } else {
            System.out.println("Введите корректную цену.");
        }
    }

    public int getPrice() {
        if (Price == 0) {
            System.exit(0);
        }
        return Price;
    }

    public void getInfo() {
        System.out.println("Производитель : " + getManufacturer() + " Процессор : " + getCPU() + " Оперативная память : " + getRAM() + " Дата изготовления :" + getDate() + " Цена :" + getPrice());
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
 */

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

public class Main {
    public static void main(String[] args) {
        // write your code here
        first();
        //second();

    }


    public static void first() {
        Computer[] computers = new Computer[5];
        String Name[] = new String[5];
        Name[0] = "HP";
        Name[1] = "Samsung";
        Name[2] = "Asus";
        Name[3] = "Xiaomi";
        Name[4] = "Dell";
        int min = 260000;
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
            computers[i].setManufacturer(Name[(int) (Math.random() * 5)]);
            computers[i].setCPU("Intel Core I5 " + (i + 1));
            computers[i].setRAM(8 * ((int) (Math.random() * 2) + 1));
            computers[i].setDate(LocalDate.now().minusYears((int) (Math.random() * 4)).minusMonths((int) (Math.random() * 13)).minusDays((int) (Math.random() * 20)));
            computers[i].setPrice((int) ((Math.random() * 230) * 1000) + 20000);
            computers[i].getInfo();
            if (computers[i].getManufacturer().equals(Name[4]) && computers[i].getPrice() < min) {
                index = i;
                flag = true;
                min = computers[i].getPrice();
            }
        }
        System.out.println("\n");

        if (flag) {
            computers[index].getInfo();
        } else {
            System.out.println("Компьютеров фирмы Dell , не найдено.");
        }
    }


    public static void second() {
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
}


