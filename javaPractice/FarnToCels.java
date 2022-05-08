import java.util.Scanner;

public class FarnToCels
{
    public static void main(String[] args)
    {
        //code..
        Scanner sc = new Scanner(System.in);
        double farn, cels;

        //celsius to farenhit
        System.out.print("Farenhit value: ");
        farn = sc.nextDouble();

        cels = 0.6 * farn - 32; //celsius law
        System.out.println("Celsius is : "+cels);
    }
}