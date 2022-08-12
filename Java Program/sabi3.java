import java.util.Scanner;

public class sabi3 {
    int r, l, b, s1, s2, s3;
    double pi = 3.14, perimeter;
    Scanner s = new Scanner(System.in);

    void circle() {
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle:" + perimeter);
    }

    void rectangle() {
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:" + perimeter);
    }

    void triangle() {
        System.out.print("Enter length of first side of triangle:");
        s1 = s.nextInt();
        System.out.print("Enter length of second side of triangle:");
        s2 = s.nextInt();
        System.out.print("Enter length of third side of triangle:");
        s3 = s.nextInt();
        perimeter = s1 + s2 + s3;
        System.out.println("Perimeter of triangle:" + perimeter);
    }

    public static void main(String[] args) {
        sabi3 obj = new sabi3();
        obj.circle();
        obj.rectangle();
        obj.triangle();
    }
}