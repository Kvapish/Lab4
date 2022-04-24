package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Train {
        private int Number;
        private String Direction;
        private LocalDateTime DateArrival;
        private LocalDateTime DateDeparture;
        private int Distance;
        public Train(final int number,final String direction, final LocalDateTime dateArrival ,final LocalDateTime dateDeparture,final int distance) {
            this.setNumber(number);
            this.setDirection(direction);
            this.DateArrival = dateArrival;
            this.DateDeparture = dateDeparture;
            this.setDistance(distance);
        }
    public void setNumber(final int number){
        this.Number=Examination2.correctingNumber(number);
    }
    public int getNumber(){return Number;}
    public void  setDirection(final String direction){
        this.Direction=Examination2.correctingDirection(direction);
    }
    public  String getDirection(){
        return Direction;
    }
    public void setDateArrival(final LocalDateTime dateArrival){
        this.DateArrival=DateArrival;
    }
    public LocalDateTime getDateArrival(){
        return DateArrival;
    }
    public void setDateDeparture(final LocalDateTime dateDeparture){
        this.DateDeparture=DateDeparture;
    }
    public LocalDateTime getDateDeparture(){
        return DateDeparture;
    }
    public void setDistance(final int distance){
        this.Distance=Examination2.correctingDistance(distance);
    }
    public int getDistance(){return Distance;}

    @Override
    public String toString() {
        return "Поезд{" +
                "Номер :" + Number +
                ", Направление : Одесса-" + Direction +
                ", Время прибытия :" + DateArrival +
                ", Время отбытия :" + DateDeparture +
                ", Дистанция :" + Distance + "км"+
                '}';
    }
}
