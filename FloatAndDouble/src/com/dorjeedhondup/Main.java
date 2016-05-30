package com.dorjeedhondup;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntVal = 5/3;

        // float = 32 (4 bytes0
        float myFloatVal = 5f/3f;

        // double = 64 (8 bytes) -> double is precise and faster for math
        double myDoubleVal = 5d/3d;

        System.out.println("myIntVal = " + myIntVal);
        System.out.println("myFloatVal = " + myFloatVal);
        System.out.println("myDoubleVal = " + myDoubleVal);

        double numPounds = 150d;
        double convertedKilos = numPounds * 0.45359237d;
        System.out.println(numPounds + " pounds = " + convertedKilos + " kg");
    }
}
