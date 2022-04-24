package com.company;

import java.time.LocalDateTime;

public class Trains {
    private Train[] trains;
    private int currentTrainNumber;

    public Trains(final int TrainNumber) {
        this.trains = new Train[TrainNumber];
        currentTrainNumber = -1;
    }

    public void addTrain(final Train train) {
        if (++currentTrainNumber < trains.length) {
            trains[currentTrainNumber] = train;
        }
    }

    public String toString() {
        String result = "Поезда: " + System.lineSeparator();

        for (final Train train : trains) {
            result += train + System.lineSeparator();
        }
        return result;
    }

    public void findDay() {
        for (final Train train : trains) {
            int findday = train.getDateArrival().getDayOfMonth() - train.getDateDeparture().getDayOfMonth();
            if (findday >= 1) {
                System.out.println(train);
            }
        }
    }
}
