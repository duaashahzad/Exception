public class Exception1 {

        //-----------------------------------------------------------------
        //  Deliberately divides by zero to produce an exception.
        //-----------------------------------------------------------------
        public static void main(String[] args)
        {
            int numerator = 10;
            int denominator = 0;

            System.out.println("Before the attempt to divide by zero.");

            try { // place code that throws exception inside try block because originally cannot divide by zero

                System.out.println(numerator / denominator);

            }
            catch ( ArithmeticException exception ){

                System.out.println("Divided by zero, please update code");
            }

           finally {

                   System.out.println("Done");
            }

            System.out.println("End");
        }
    }

