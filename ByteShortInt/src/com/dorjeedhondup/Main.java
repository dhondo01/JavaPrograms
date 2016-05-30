package com.dorjeedhondup;

public class Main {

    public static void main(String[] args) {
        // integer has a width of 32
        int myMinVal = -2147483648; // smallest int val
        int myMaxVal = 2_147_483_647; // largest int val

        // byte has a width of 8
        byte myByteVal = -128;
        byte myNewVal = (byte) (myByteVal/2); // CASTING
        System.out.println("myNewByteVal = " + myNewVal);

        // short has a width of 16
        short myShortMaxVal = 32767;
        short myShortMinVal = -32768;

        // long has width of 64
        long myLongVal = 100L; // L for long
        long myLongMaxVal = 9_223_372_036_854_775_807L;

        System.out.println("Run completed");
    }
}
