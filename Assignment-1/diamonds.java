package assignment1;

import java.util.Scanner;

public class diamonds {


    public static void main(String[] args){

        System.out.println("Give a positive number:");

        Scanner scan = new Scanner(System.in);
        
        int number = 0;
        number = scan.nextInt();

        if(number > 0){
            // top part
            for(int integer=1; integer<=number; integer++){
                
                // space
                for (int space = integer; space <= number; space++){
                    System.out.print(" ");
                }
                // stars
                for(int star = 1; star <= 2 * integer - 1; star++){
                    System.out.print("*");
                }
                System.out.println();
            }
            // bottom part
            for(int integer = number - 1; integer >= 1; integer--){
                
                // space
                for(int space = number; space >= integer; space--){
                    System.out.print(" ");
                }
                // stars
                for(int star = 1; star <= 2*integer - 1; star++){
                    System.out.print("*");
                }
                System.out.println();
                scan.close();
            }
        }
        else{
            System.out.print("Wrong input! \n");
            scan.close();
            java.lang.System.exit(1);
        }
    }    
}
