import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter two integers individually:");

    // First input
    int firstInteger  = myObj.nextInt();

    // Second input
    int secondInteger = myObj.nextInt();


   

    // Output input by user
    System.out.println("Addition: " + (firstInteger + secondInteger)); 
    System.out.println("Subtraction: " + (firstInteger - secondInteger)); 
    System.out.println("Divition: " + (firstInteger / secondInteger)); 
    System.out.println("Multiplication: " + (firstInteger * secondInteger)); 
  }
}