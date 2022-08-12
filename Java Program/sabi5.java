
// 5#.Write a program through Java that reads a number in inches, converts it to meters//
import java.util.*;

public class sabi5 {
    public static void main(String args[]) {
        // Scanner class object created
        Scanner sc = new Scanner(System.in);
        // value of meter declared
        double meter = 1;
        // value of inch declared
        double inch = 1;
        // converting inch to meter
        double m = inch * 0.0254;
        // converting meter to inch
        double in = meter * 39.3701;
        // printing result
        System.out.println("Value of " + meter + " meter in inch: " + in);
        System.out.println("Value of " + inch + " inch in meter: " + m);
    }
}