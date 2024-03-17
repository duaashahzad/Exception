public class Exception0 {

//-----------------------------------------------------------------
//  Deliberately divides by zero to produce an exception.
//-----------------------------------------------------------------
public static void main(String[] args)
        {
        int numerator = 10;
        int denominator = 0;

        System.out.println("Before the attempt to divide by zero.");


        System.out.println(numerator / denominator);


        System.out.println("Divided by zero");
        }

        }


