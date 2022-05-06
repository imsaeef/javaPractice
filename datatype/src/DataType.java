public class DataType {
    public static void main(String[] args){

        // print datatype
        boolean b = true;
        char c = 'a';
        short s = 3005;
        int i = 1235;
        float f = 50.2f;
        double d = 12.3;

        // show println method
        System.out.println("\nShow all datatypes here:\n");
        System.out.println("boolean = "+b);
        System.out.println("char = "+c);
        System.out.println("short = "+s);
        System.out.println("int = "+i);
        System.out.println("float = "+f);
        System.out.println("double = "+d);

        System.out.println("************************\n");
        //show printf method
        System.out.printf("boolean b = %b\n",b);
        System.out.printf("charecter c = %c\n",c);
        System.out.printf("short s = %d\n",s);
        System.out.printf("int i = %d\n",i);
        System.out.printf("float f = %.2f\n",f);
        System.out.printf("double d = %.3f\n",d);

    }
}
