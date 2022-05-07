import java.util.Scanner;

public class CircleDemo
{
    public static void main(String[] args)
    {
        //code.
        Scanner input = new Scanner(System.in);
        double radius, area;
        System.out.print("Enter radius : ");
        radius = input.nextDouble();

        area = 3.1416 * radius * radius;
        System.out.println("Area of circle : "+area);

    }
}