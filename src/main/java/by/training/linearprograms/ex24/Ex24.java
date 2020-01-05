package by.training.linearprograms.ex24;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Find the area of an isosceles trapezoid with bases a and b and angle α with a larger base a.
 *
 *  x = (a - b)/2
 *  tg(α) = h/x
 *  h = tg(α) * x
 *
 */

public class Ex24 {
    public static void main( String[] args ){
        while (true) {
            try {
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter a larger base: \n(Enter 0 to exit)");
                double a = scn.nextDouble();

                System.out.println("Enter a smaller base:\nEnter 0 to exit)");
                double b = scn.nextDouble();

                System.out.println("Enter an angle :\nEnter 0 to exit)");
                double alpha = scn.nextDouble();

                if(a == 0 || b == 0 || alpha == 0) break;//Exit from program

                System.out.println("The square: " + (a + b)/2*Math.tan(alpha*Math.PI/180));
            } catch (InputMismatchException e) {
                System.out.println("Please, enter valid data.");
            }
        }
    }
}
