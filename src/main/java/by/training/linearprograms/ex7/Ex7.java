package by.training.linearprograms.ex7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * There is a rectangle, the width is half of the length.
 * Goal: Find the area of the rectangle.
 *
 */
public class Ex7
{
    public static void main( String[] args ){
        while (true) {
            System.out.println("There is a rectangle, the length is twice the width.\nEnter the length:\n(Enter 0 to exit)");
            try {
                Scanner scn = new Scanner(System.in);
                int width = scn.nextInt();

                if(width < 0) throw new InputMismatchException();// Checking the argument, if a string is entered, an exception is thrown by the Scanner class itself
                if(width == 0) break;//Exit from program

                System.out.println("The square is: " + width*2*width);

            } catch (InputMismatchException e) {
                System.out.println("Please, enter valid data.");
            }
        }
    }
}
