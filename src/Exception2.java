import java.util.Scanner;

public class Exception2 {
    //-----------------------------------------------------------------
    //  Creates an exception object and possibly throws it.
    //-----------------------------------------------------------------
    public static void main(String[] args) throws Exception {

        final int MIN = 25, MAX = 40;

        Scanner scan = new Scanner(System.in);

        Exception problem =
                new Exception("Custom message");

        System.out.print("Enter an integer value between " + MIN +
                " and " + MAX + ", inclusive: ");

        int value = scan.nextInt();

        //  Determine if the exception should be thrown
        if (value < MIN || value > MAX)
            throw problem;

        System.out.println("Value in Range,End of main method.");  // may never reach
    }
}
