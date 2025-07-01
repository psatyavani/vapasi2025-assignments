package com.thoughtworks.aggregation;

public class Laptop {
    final String logo="MAC";

    //Aggregation
    Processor processor;
    Ram ram;
    HardDisk hardDisk;

    Laptop(Processor processor, Ram ram, HardDisk hardDisk) {

        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    public String toString() {
        return "Laptop [Logo: " + logo + ", " + processor + ", " + ram + ", " + hardDisk + "]";
    }

}
