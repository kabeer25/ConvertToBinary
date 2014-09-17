/**
 * Created by Kabeer on 9/16/2014.
 */

import java.*;

public class ConvertBinary {

    public static void main(String[] args)
    {
        int x = 37;

        System.out.println("Convert To Binary");

        printBinary(x);

    }

   public static void printBinary(int n)
    {

        if(n > 0)
        {
            printBinary(n/2);
            //printBinary(n%2);
            System.out.println(n%2);
        }
    }
}
