package at.ac.fhkufstein;

public class Aufgabe4_1810653162
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Der Schleifenzähler ist: " + i);
        }

        System.out.println("--------------------------------------");

        int whileLaufvariable = 1;
        while(whileLaufvariable <= 10)
        {
            System.out.println("Der Schleifenzähler ist: " + whileLaufvariable);
            whileLaufvariable++;
        }

        System.out.println("--------------------------------------");

        int doWhileLaufvariable = 1;
        do
        {
            System.out.println("Der Schleifenzähler ist: " + doWhileLaufvariable);
            doWhileLaufvariable++;
        } while(doWhileLaufvariable <= 10);
    }
}
