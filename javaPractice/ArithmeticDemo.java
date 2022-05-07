import java.util.Scanner;

public class ArithmeticDemo
{
    public static void main(String[] args)
    {
        //start code
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        //user input
        System.out.print("Enter first number : ");
        num1 = input.nextInt();
        System.out.print("Enter second number : ");
        num2 = input.nextInt();
        //print result
        sum = num1 + num2;
        System.out.println("sum is : "+sum);
        sum = num1 - num2;
        System.out.println("subtract is : "+sum);
        sum = num1 * num2;
        System.out.println("multiply is : "+sum);
        double sum2 = (double)num1 / num2;
        System.out.println("division is : "+sum2);
        sum = num1 % num2;
        System.out.println("remider is : "+sum);

    }
}