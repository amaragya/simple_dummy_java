/*
 * Copyright (c) 2021. Muhammad agya amarullah (amaragya@gmail.com)
 * All rights reserved
 */

package typecasting.test;

import typecasting.TypeCasting;

public class MainTest {

    public static void main(String[] args){
        TypeCasting typeCasting = new TypeCasting();

        System.out.println("Current Byte Value :" + typeCasting.getDataByte());
        System.out.println("Current Integer Value :" + typeCasting.getDataInteger());
        System.out.println("Current Long Value :" + typeCasting.getDataLong());
        System.out.println("Current Float Value :" + typeCasting.getDataFloat());
        System.out.println("Current Double Value :" + typeCasting.getDataDouble());
        System.out.println("Current Char Value :" + typeCasting.getDataChar());
        System.out.println("Current Boolean Value :" + typeCasting.isDataBoolean());
        System.out.println("Current String Value :" + typeCasting.getDataString());

        typeCasting.setDataBoolean(true);
        typeCasting.setDataChar('x');
        typeCasting.setDataString("dummy string");
        typeCasting.setDataInteger(10);
        typeCasting.setDataDouble(2.1);
        typeCasting.setDataLong(20L);
        typeCasting.setDataFloat(3.5f);
        typeCasting.setDataByte((byte) 1);

        System.out.println("\nByte value after set: " + typeCasting.getDataByte());
        System.out.println("Integer value after set: " + typeCasting.getDataInteger());
        System.out.println("Long value after set: " + typeCasting.getDataLong());
        System.out.println("Float value after set: " + typeCasting.getDataFloat());
        System.out.println("Double value after set: " + typeCasting.getDataDouble());
        System.out.println("Char value after set: " + typeCasting.getDataChar());
        System.out.println("Boolean value after set: " + typeCasting.isDataBoolean());
        System.out.println("String value after set: " + typeCasting.getDataString());

        // casting double, long to integer
        System.out.println("\nFloat value before cast: " + typeCasting.getDataFloat());
        System.out.println("Float value after cast: " + typeCasting.getDataFloat().intValue());
        System.out.println("Double value before cast: " + typeCasting.getDataDouble());
        System.out.println("Double value after cast: " + typeCasting.getDataDouble().intValue());
    }
}
