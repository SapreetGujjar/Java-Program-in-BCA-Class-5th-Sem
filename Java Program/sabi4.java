import java.util.Scanner;

public class sabi4 {
    public static void main(String args[]) {
        double celsius, fahrenheit;
        Scanner o = new Scanner(System.in);
        /* Input temperature in celsius */
        System.out.print("Enter temperature in Celsius: ");
        celsius = o.nextDouble();

        /* celsius to fahrenheit conversion formula */
        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.print(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
    }
}