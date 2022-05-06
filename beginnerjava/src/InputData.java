import java.util.Scanner;

public class InputData {
    public static void main(String[] args){

        //code here
        Scanner input = new Scanner(System.in);

        // integer type
        // int number;
        // System.out.print("Enter a number: ");
        // number = input.nextInt();
        // System.out.println("Number: "+number);

        //string type
        // String name;
        // System.out.print("Enter your name: ");
        // name = input.nextLine();
        // System.out.println("Welcome "+name);

        //double type
        double num1;
        System.out.print("Enter a number: ");
        num1 = input.nextDouble();
        System.out.println("You entered "+num1+" this number!");
    }
}
