package assignment1;

import java.util.Scanner;

public class Time {
    public static void main (String[] args)  {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of seconds:");
        int seconds = scan.nextInt();

        int hours = seconds / 3600;
        int seconds_1 = seconds % 3600;
        
        int minutes = seconds_1 / 60;
        int seconds_2 = seconds_1 % 60;

        System.out.println("This corresponds to:\t" + hours + "Hours," + minutes + "Minutes," + seconds_2 +".");

        scan.close();
    }

    
}
