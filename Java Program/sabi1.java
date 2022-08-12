import java.util.Scanner;

public class sabi1 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num1, num2, res;

      System.out.println("Enter the First Number: ");
      num1 = scan.nextInt();
      System.out.println("Enter the Second Number: ");
      num2 = scan.nextInt();

      res = num1 + num2;
      System.out.println("\nAddition Result = " + res);
      res = num1 - num2;
      System.out.println("Subtraction Result = " + res);
      res = num1 * num2;
      System.out.println("Multiplication Result = " + res);
      res = num1 / num2;
      System.out.println("Division Result = " + res);
   }
}