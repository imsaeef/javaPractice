import java.util.Scanner;

public class SquireDemo
{
    public static void main(String[] args)
    {
        //code...
        Scanner input = new Scanner(System.in);
        int length, area;

        System.out.print("Enter length : ");
        length = input.nextInt();

        area = length * length;
        System.out.println("Area of length : "+area);

    }
}