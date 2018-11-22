package at.ac.fhkufstein;

import javax.swing.*;

public class UserDialogHelper
{
    /*
        Ask the User for a Number between 0-10 and convert it to an integer
     */
    public static int GetIntegerFromUser(String msg)
    {
        String value = JOptionPane.showInputDialog(msg);

        //if needed implement validation here

        return StringHelper.ToInteger(value);
    }
    /*
        Ask the User for a Double
     */
    public static double GetDoubleFromUser(String msg)
    {
        String value = JOptionPane.showInputDialog(msg);

        //if needed implement validation here

        return StringHelper.ToDouble(value);
    }
    /*
        Ask the User for a Boolean
     */
    public static Boolean GetBooleanFromUser(String msg)
    {
        String value = JOptionPane.showInputDialog(msg);

        //if needed implement validation here

        return StringHelper.ToBoolean(value);
    }
    /*
        Ask the User for a long
     */
    public static long GetLongFromUser(String msg)
    {
        String value = JOptionPane.showInputDialog(msg);

        //if needed implement validation here

        return StringHelper.ToLong(value);
    }
    /*
        Ask the User for a char
     */
    public static char GetCharFromUser(String msg)
    {
        String value = JOptionPane.showInputDialog(msg);

        //if needed implement validation here

        return StringHelper.ToChar(value);
    }
    /*
        Ask the User for a byte
     */
    public static byte GetByteFromUser(String msg)
    {
        String value = JOptionPane.showInputDialog(msg);

        //if needed implement validation here

        return StringHelper.ToByte(value);
    }
    /*
        Ask the User for a short
     */
    public static short GetShortFromUser(String msg)
    {
        String value = JOptionPane.showInputDialog(msg);

        //if needed implement validation here

        return StringHelper.ToShort(value);
    }
    /*
        Ask the User for a Float
     */
    public static float GetFloatFromUser(String msg)
    {
        String value = JOptionPane.showInputDialog(msg);

        //if needed implement validation here

        return StringHelper.ToFloat(value);
    }
}
