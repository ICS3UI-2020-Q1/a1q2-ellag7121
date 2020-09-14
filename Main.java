import java.util.Scanner;
/**
 * get user input for two numbers, divide the two numbers, tell the user the quotient and the remainder
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner used to get input
    Scanner input = new Scanner(System.in);
    
    //initialize variables
    int firstNum; //variable to store first number
    int secondNum; //variable to store second number
    int quotient; //the quotient of the numbers
    int remainder; //the remainder of the two divided numbers

    //ask for user input
    System.out.println("Please enter in two integers, on seperate lines, to divide.");

    //get numbers from user
    firstNum = input.nextInt(); //get first number to divide
    secondNum = input.nextInt(); //get second number to divide

    //divide the numbers and store in the quotient variable
    quotient = firstNum/secondNum;
    //get the remainder of the numbers and store it in the remainder variable
    remainder = firstNum%secondNum;

    //tell the user the result
    System.out.println(firstNum + "/" + secondNum + " is " + quotient + " with a remainder of " + remainder + ".");


  }
}
