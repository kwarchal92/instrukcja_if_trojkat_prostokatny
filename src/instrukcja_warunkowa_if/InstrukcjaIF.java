package instrukcja_warunkowa_if;

import java.io.*;
public class InstrukcjaIF {

    public static void main(String [] args)
        throws IOException
    {
        int a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj dlugosc boku trojkata a: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("Podaj długosc boku trojkata b: ");
        b = Integer.parseInt((br.readLine()));
        System.out.println("podaj dlugosc boku trojkata c: ");
        c = Integer.parseInt(br.readLine());

        if ((a * a + b * b) == c * c)   //np 3,4,5 tworzy
        {
            System.out.println("dlugosci bokow a: " + a );
            System.out.println("b: " + b );
            System.out.println("c: " + c );
            System.out.println("tworza trojkat prostokatny.");
        }
        else
        {
            System.out.println("podane dlugosci bokow nie tworza trojkata prostokatnego.");
        }

    }

}
