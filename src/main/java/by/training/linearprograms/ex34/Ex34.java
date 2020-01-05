package by.training.linearprograms.ex34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex34 {
    public static void main( String[] args ){
        while (true) {
            try {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter amount of bytes:\n(Enter 0 to exit)");
                double bytes = scn.nextDouble();

                if(bytes == 0 ) break;//Exit from program

                System.out.println("Enter number of unit of measure do you need: \n 1.kb\n 2.mb\n 3.Gb\n 4.Tb");
                int value = scn.nextInt();
                switch(value){
                    case 1:
                        System.out.println(bytes + " bytes = "+ bytes/1024 +" kb");
                        break;
                    case 2:
                        System.out.println(bytes + " bytes = "+ bytes/1024/1024 + " mb");
                        break;
                    case 3:
                        System.out.println(bytes + " bytes = "+ bytes/1024/1024/1024 +" Gb");
                        break;
                    case 4:
                        System.out.println(bytes + " bytes = "+ bytes/1024/1024/1024/1024 +" Tb");
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please, enter valid data.");
            }
        }
    }
}
