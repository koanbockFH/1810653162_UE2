package at.ac.fhkufstein;

public class Aufgabe5_1810653162
{
    public static void main(String[] args)
    {
        forSchleife(5);
        System.out.println("--------------------------------------");
        forSchleife(2);
        System.out.println("--------------------------------------");
        whileSchleife(10);
        System.out.println("--------------------------------------");
        whileSchleife(20);
        System.out.println("--------------------------------------");
        nutzerSchleife();
    }

    private static void forSchleife(int a)
    {
        for (int i = 0; i < a; i++)
        {
            System.out.println("Der Schleifenzähler ist: " + i);
        }
    }


    private static void whileSchleife(int a)
    {
        int i = 0;
        int durchlaeufe = 0;
        while(i <= a)
        {
            if(i%2 == 0)
            {
                System.out.println("Der Schleifenzähler ist: " + i + " DurchlaufNr.: " + durchlaeufe);
            }
            i += 2;
            durchlaeufe++;
        }
    }

    private static void nutzerSchleife()
    {
        int value1 = UserDialogHelper.GetIntegerFromUser("Please enter a Integer:");
        int value2 = UserDialogHelper.GetIntegerFromUser("Please enter a Integer:");

        int i = 1;
        for(int outerI = 0; outerI<value1;outerI++)
        {
            for(int innerI = 0; innerI<value2;innerI++)
            {
                System.out.println("Innere Schleife Durchlauf: " + i);
                i++;
            }
        }
    }
}
