import java.util.Scanner;

/**
 * Created by Sumitra Lok 12/2/2018
 */
public class Quadratic_Formula
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //Initializes a new Scanner Object
        System.out.println("Welcome! This program receives 3 inputs as doubles and" +
                            "gives the results of plugging those values into the quadratic formula.\n" +
                            "Only real number results will be given.\n" );

        System.out.println("Please enter a non-zero value for a");
        double a = scan.nextDouble();

        System.out.println("Please enter a value for b");
        double b = scan.nextDouble();

        System.out.println("Please enter a value for c");
        double c = scan.nextDouble();

        double results_one = (-1 * b + Math.sqrt(b * b - 4 * a * c))/(2 * a);
        double results_two = (-1 * b - Math.sqrt(b * b - 4 * a * c))/(2 * a);

        System.out.println("The first result of the quadratic formula for the value: " + a + "," + b +
                " and " + c + " is " + results_one);

        System.out.println("The first result of the quadratic formula for the value: " + a + "," + b +
                " and " + c + " is " + results_two);
    }
}
