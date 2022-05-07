import java.util.Scanner;

// practice number 1

public class AddingInteger
{
    //main method begings here
    public static void main(String[] args)
    {
        //code start here
        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int num1; //first number
        int num2; //second number
        int sum; //add two integers

        //user input first
        System.out.print("Enter number 1 : ");
        num1 = input.nextInt();
        //user input second
        System.out.print("Enter number 2 : ");
        num2 = input.nextInt();

        sum = num1 * num2;
        //print result
        System.out.printf("Total sum is : %d",sum);

    }
}