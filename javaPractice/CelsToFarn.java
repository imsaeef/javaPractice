import java.util.Scanner;

public class CelsToFarn
{
    public static void main(String[] args)
    {
        //code..
        Scanner sc = new Scanner(System.in);
        double cels, farn;

        //farenhit to celsius
        System.out.print("Celsius value: ");
        cels = sc.nextDouble();

        farn = 1.8 * cels + 32; //law of farenhit
        System.out.println("Farenhit is: "+farn);

    }
}