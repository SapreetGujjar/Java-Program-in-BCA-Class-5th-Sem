// 22#. Compute the average of three numbers through a Java Program.

import java.util.Scanner;

public class sabi22 {
  public static void main(String[] args) {
    System.out.println("How many numbers do you want to enter?");
    Scanner scanner = new Scanner(System.in);
    // this is number of input values user will provide in console
    int count = scanner.nextInt();
    double[] array = new double[count];
    double sum = 0;
    for (int i = 0; i < array.length; i++) {
      System.out.print("Enter input number " + (i + 1) + ": ");
      array[i] = scanner.nextDouble();
    }
    scanner.close();
    for (int i = 0; i < array.length; i++) {
      sum = sum + array[i];
    }
    // Get the average here
    double average = sum / count;
    System.out.format("The average is: %.2f", average);
  }
}