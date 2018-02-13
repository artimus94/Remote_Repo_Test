import java.util.Scanner;
/**
 * Created by Sumitra 12/2/2018
 */
public class Temperature_Converter
{
    public static void main(String[] args)
    {
        System.out.println("Welcome: This program takes in a temperature as input indicating \n" +
                            "whether we're converting from celsius to fahrenheit or fahrenheit to celsius");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter \"f\" if we're converting from fahrenheit.\n" +
                            "Please enter \"c\" if we're converting from celsius.");

        String temp_key = scan.nextLine();

        System.out.println("Please enter the numerical value of the temperature");

        double temp_value = scan.nextDouble();

        if(temp_key.equals("f"))
        {
            double result = (temp_value - 32) / 1.8;

            System.out.println("When converting " + temp_value + " from Fahrenheit to Celsius,\n" +
                                "the result is " + result);
        }
        else if(temp_key.equals("c"))
        {
            double result = temp_value * 1.8 + 32;

            System.out.println("When converting " + temp_value + " from Celsius to Fahrenheit,\n" +
                    "the result is " + result);
        }
        else
        {
            System.out.println("Not a valid key :( . Next time make sure you enter either \"f\" or \"c\".");
        }
    }
}
