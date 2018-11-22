package at.ac.fhkufstein;

public class StringHelper
{
    public static int ToInteger(String input)
    {
        return Integer.parseInt(input);
    }

    public static double ToDouble(String input)
    {
        return Double.parseDouble(input);
    }

    public static Boolean ToBoolean(String input)
    {
        return Boolean.parseBoolean(input);
    }

    public static long ToLong(String input)
    {
        return Long.parseLong(input);
    }

    public static char ToChar(String input)
    {
        return input.charAt(0);
    }

    public static byte ToByte(String input)
    {
        return Byte.parseByte(input);
    }

    public static short ToShort(String input)
    {
        return Short.parseShort(input);
    }

    public static float ToFloat(String input)
    {
        return Float.parseFloat(input);
    }

    public static Boolean IsNullOrEmpty(String input)
    {
        return input != null && !input.trim().isEmpty();
    }
}
