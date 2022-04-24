package com.company;

public class Computers {
    private Computer[] computers;
    private int currentComputerNumber;

    public Computers(final int computersNumber) {
        this.computers = new Computer[computersNumber];
        currentComputerNumber = -1;
    }

    public void addComputer(final Computer computer) {
        if (++currentComputerNumber < computers.length) {
            computers[currentComputerNumber] = computer;
        }
    }
    public String toString() {
        String result = "Computers: " + System.lineSeparator();

        for (final Computer computer : computers) {
            result += computer + System.lineSeparator();
        }

        return result;
    }
    Computer index;
    int min = 2000000;

    public Computer findDell(){
        for(final Computer computer :computers){
            if(computer.getManufacturer().equals("Dell")) {
                if (computer.getPrice() <= min) {
                    min = computer.getPrice();
                    index=computer;
                }
            }
        }
        return index;
    }
}