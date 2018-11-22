package at.ac.fhkufstein;

import javax.swing.*;

public class Aufgabe2_1810653162
{

    public static void main(String[] args)
    {
        //Get Values from User
        int value1 = GetIntegerFromUser();
        int value2 = GetIntegerFromUser();

        //Compare Values and do sth after
        if (value1 == value2)
        {
            System.out.println("Die Zahlen sind gleich! Zahl = " + value1);
        }
        else
        {
            LoopTillMatch(value1, value2);
        }
    }

    /*
        Loop through the 2 integers till they match and report results
     */
    private static void LoopTillMatch(int value1, int value2)
    {
        //loop counter
        int i = 0;
        // Loop while they don't match
        while (value1 != value2)
        {
            if(value1 > value2){
                value2++;
            }
            else if(value2 > value1)
            {
                value1++;
            }
            i++;
        }
        //Report results
        System.out.println(String.format("%d Schritte waren nötig, die Zahl war %d", i, value1));
    }

    /*
        Ask the User for a Number between 0-10 and convert it to an integer
     */
    private static int GetIntegerFromUser()
    {
        String value = JOptionPane.showInputDialog("Please enter a Value between 0-10");

        //if needed implement validation here

        return StringHelper.ToInteger(value);
    }
}

