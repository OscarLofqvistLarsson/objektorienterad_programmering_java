package assignment1;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter year:");
        int year = scan.nextInt();
        
        int j = (year / 100);
        
        int k = (year % 100); 
        
        System.out.println("Enter month:");
        int m = scan.nextInt();
        
        if(m == 1 || m == 2)
            m += 12;
            year--;
        
        System.out.println("Enter day of the month:");
        int q = scan.nextInt();
        
        // calc day entered 
        int h = ((q + ((26*(m + 1))/10) + k + (k/4) + (j/4) + (5*j)) % 7); 

        String day = "";
        
        if(h == 0){
            day = "Saturday";
        }

        else if(h == 1){
            day = "Sunday";
        }

        else if(h == 2){
            day = "Monday";
        }
            
        else if(h == 3){
            day = "Tuesday";
        }

        else if(h == 4){
            day = "Wednesday";
        }

        else if(h == 5){
            day = "Thursday";
        }

        else if(h == 6){
            day = "Friday";
        }

        System.out.println(day);

        scan.close();



    }
}
