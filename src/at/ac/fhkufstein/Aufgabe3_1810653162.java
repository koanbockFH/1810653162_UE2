package at.ac.fhkufstein;

import javax.swing.*;

public class Aufgabe3_1810653162
{
    public static void main(String[] args)
    {
        // define age Var
        double alter;
        String eingabe = JOptionPane.showInputDialog("Please enter your age (use '.' as decimal-separator):");
        alter = StringHelper.ToDouble(eingabe);

        JOptionPane.showMessageDialog(null, "Dein Alter ist: " + alter, "Result", JOptionPane.INFORMATION_MESSAGE);

        // Ask and give out the Value
        int number = UserDialogHelper.GetIntegerFromUser("Please enter an Integer:");
        ShowResult("Integer", String.valueOf(number));

        // Ask and give out the Value
        Boolean bool = UserDialogHelper.GetBooleanFromUser("Please enter an Boolean:");
        ShowResult("Boolean", String.valueOf(bool));

        // Ask and give out the Value
        long numberLong = UserDialogHelper.GetLongFromUser("Please enter an long:");
        ShowResult("long", String.valueOf(numberLong));

        // Ask and give out the Value
        char character = UserDialogHelper.GetCharFromUser("Please enter an char:");
        ShowResult("char", String.valueOf(character));

        // Ask and give out the Value
        byte numberByte = UserDialogHelper.GetByteFromUser("Please enter an byte:");
        ShowResult("byte", String.valueOf(numberByte));

        // Ask and give out the Value
        short numberShort = UserDialogHelper.GetShortFromUser("Please enter an short:");
        ShowResult("short", String.valueOf(numberShort));

        // Ask and give out the Value
        float numberFloat = UserDialogHelper.GetFloatFromUser("Please enter an float:");
        ShowResult("float", String.valueOf(numberFloat));

        // Converts the Variable into a String
        String alterText = String.valueOf(alter);
        JOptionPane.showMessageDialog(null, "Dein Alter ist: " + alterText, "Result", JOptionPane.INFORMATION_MESSAGE);

    }

    private static void ShowResult(String dataType, String value)
    {
        String msg = String.format("Your %s is: %s", dataType, value);
        JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
