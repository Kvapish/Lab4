package com.company;

import java.time.LocalDate;

public class Computer {
        private String Manufacturer;
        private String CPU;
        private int RAM;
        private LocalDate Date;
        private int Price;
    public Computer(final String manufacturer,final String cpu, final int ram, final LocalDate date ,final int price) {
        this.setManufacturer(manufacturer);
        this.setCPU (cpu);
        this.setRAM(ram);
        this.Date=date;
        this.setPrice(price);
    }
    public void  setManufacturer(final String manufacturer){
        this.Manufacturer=Examination.correctingManufacturer(manufacturer);
    }
    public  String getManufacturer(){
        return Manufacturer;
    }
    public void  setCPU(final String cpu){
        this.CPU=cpu;
    }
    public  String getCPU(){
        return CPU;
    }
    public void setDate(final LocalDate date){
        this.Date=Examination.correctingDate(date);
    }
    public LocalDate getDate(){
        return Date;
    }
    public void setRAM(final int ram){
        this.RAM=Examination.correctingRAM(ram);
    }
    public int getRAM(){return RAM;}
    public void setPrice(final int price){
        this.Price=Examination.correctingPrice(price);
    }
    public int getPrice(){return Price;}
    public String toString() {
        return "Computer{" +
                "Manufacturer='" + Manufacturer + '\'' +
                ", CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", Date=" + Date +
                ", Price=" + Price +
                '}';
    }
}

