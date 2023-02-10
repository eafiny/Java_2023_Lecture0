package ru.muctr;

import java.util.Random;

/**
 * @author Evgenia Skichko
 */
public class FirstProgram {
    public static void main(String[] args) {
        byte byteValue1 = 5;
        byte byteValue2 = 127;
        byte byteValue4 = (byte) (127 + 1);
        System.out.println(byteValue4);
        byte byteValue3 = (byte) (byteValue1 + byteValue2);

        float floatValue1 = 0.03f;
        float floatValue2 = 0.02f;
        System.out.println(floatValue1 + floatValue2);

        double doubleValue1 = 5.0;
//        System.out.println(byteValue1 / 0);
        System.out.println(doubleValue1 / 0);

        System.out.println(byteValue2 + 1);


//        if ((byteValue1 & 1) != 0)

    // CHAR
        char charValue = '5';
        System.out.println("За каждую лабу вы получите " +
                charValue + " баллов");

        char pass = 'p';
        boolean findPass = false;
        while (!findPass){
            Random random = new Random();
            int randomChar = random.nextInt(256);
            System.out.println((char) randomChar);
            if (randomChar == pass){
                System.out.println("Выпустили!");
                break;
            }

        }
    }
}
