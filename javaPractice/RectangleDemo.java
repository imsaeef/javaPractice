import java.util.Scanner;

public class RectangleDemo
{
    public static void main(String[] args)
    {
        //code..
        Scanner input = new Scanner(System.in);
        int length, width, area;
        System.out.print("Enter length of Area: ");
        length = input.nextInt();
        System.out.print("Enter width of Area: ");
        width = input.nextInt();

        area = length * width;
        System.out.println("Area of rectangle: "+area);
    }
}