
// 21#. Developed Program & design a method to find the smallest number among three numbers
import java.util.Scanner;

public class sabi21 {
    private static Scanner sc;

    public static void main(String[] args) {
        int x, y, z;
        sc = new Scanner(System.in);
        System.out.println("Please Enter three Numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if (x < y && x < z) {
            System.out.format("\n%d is the Smallest Number", x);
        } else if (y < x && y < z) {
            System.out.format("\n%d is the Smallest Number", y);
        } else if (z < x && z < y) {
            System.out.format("\n%d is the Smallest Number", z);
        } else {
            System.out.println("\nEither any 2 values or all of them are equal");
        }
    }
}