package nyc.jvid;

import java.util.Scanner;

/**
 * Created by JV on 10/11/15.
 */
public class ConvertBinary {

    public static void main(String[] args) {
        int number = (134 + 562);

//        convertDeciToBin(number);
//        System.out.println("  compare ");
//        convertDeciToBin(696);
        System.out.println(" 43 is: ");
        int number2 =(51 - 8);
        convertDeciToBin(number2);

    }

    public static void convertDeciToBin(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return;
        }
       else
        remainder = number %2;
        convertDeciToBin(number >> 1);
        System.out.print(remainder);
    }
}
