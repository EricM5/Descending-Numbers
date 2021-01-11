import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    while (true) {
      System.out.print("Enter three numbers: ");
      int first = in.nextInt();
      int second = in.nextInt();
      int third = in.nextInt();

      if (first > second && first > third && third > second) {
        System.out.print("The numbers in descending order are: " + first + " " + third + " " + second);
      }
      if (first > second && first > third && second > third) {
        System.out.print("The numbers in descending order are: " + first + " " + second + " " + third);
      }
      if (second > first && second > third && first > third) {
        System.out.print("The numbers in descending order are: " + second + " " + first + " " + third);
      } 
      if (second > first && second > third && third > first) {
        System.out.print("The numbers in descending order are: " + second + " " + third + " " + first);
      } 
      if (third > second && third > first && second > first) {
        System.out.print("The numbers in descending order are: " + third + " " + second + " " + first);
      }
      if (third > second && third > first && first > second) {
        System.out.print("The numbers in descending order are: " + third + " " + first + " " + second);
      }
      System.out.println("\n");
    }
  }
}