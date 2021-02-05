package assignment1;

import java.util.Scanner;

public class dangerousWork {
    
    public static void main(String[] args){
    System.out.println("How much do you want to earn");

    Scanner scan = new Scanner(System.in);

    int money = scan.nextInt(); 

    // calc days
    double x =  Math.log(money / 0.01); 
    double days = (x/Math.log(2));

    if(days < 30){
        System.out.println("It will take:" + Math.round(days) + " days to earn that amount of money");
    }
    else if (days > 30){
        System.out.println("It would take you:" + Math.round(days) + " but you might be dead by then");
    }
    scan.close();{
        }
    }
}

