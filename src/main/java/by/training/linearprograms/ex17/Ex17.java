package by.training.linearprograms.ex17;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * There are 2 numbers. Сalculate the average of the cubes of these numbers
 * and the geometric mean of the modules
 *
 *
 */

public class Ex17 {
    public static void main( String[] args ){
        while (true) {
            try {
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the first number:\n(Enter -1 to exit)");
                int x = scn.nextInt();

                System.out.println("Enter the second number:\n(Enter -1 to exit)");
                int y = scn.nextInt();

                if(x == -1 || y == -1) break;//Exit from program

                System.out.println("Average of the cubes: " + (x*x*x+y*y*y)/2 + '\n' + "Geometric mean: " + Math.sqrt(Math.abs((double) x) * Math.abs((double) y)));

            } catch (InputMismatchException e) {
                System.out.println("Please, enter valid data.");
            }
        }
    }
}

