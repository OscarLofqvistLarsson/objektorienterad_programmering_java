package assignment1;

import java.util.Scanner;

public class PrintCalender {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter year: ");
        int year = scan.nextInt();

        System.out.println("Enter month (1-12)");
        int month = scan.nextInt();

        if (month < 1 || month > 12 || year < 1800 )
            System.out.println("Let´s try a different date");
        else
            displayMonth(year, month);
    }

    public static void displayMonth(int year, int month) {

        displayMonthSq(year, month);
        
        displayMonthCont(year, month);
    }
    // printing structure
    static void displayMonthSq( int year, int month) {
        
        System.out.println(monthInText(month) + " " + year);
        System.out.println("–––––––––––––––––––––––––––––");
        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
    }

    // declaring month in text
    static String monthInText(int month) {
        
        String monthStr = "";

        if(month == 1) {
            monthStr = "January";
        }

        else if(month == 2) {
            monthStr = "February";
        }
        
        else if(month == 3) {
            monthStr = "March";
        }

        else if(month == 4) {
            monthStr = "April";
        }

        else if(month == 5) {
            monthStr = "May";
        }
        
        else if(month == 6) {
            monthStr = "June";
        }
        
        else if(month == 7) {
            monthStr = "july";
        }
        
        else if(month == 8) {
            monthStr = "August";
        }

        else if(month == 9) {
            monthStr = "September";
        }

        else if(month == 10) {
            monthStr = "October";
        }

        else if(month == 11) {
            monthStr = "November";
        }

        else if(month == 12) {
            monthStr = "December";
        }
        return monthStr;
    }
     
    // printing content of calender
    static void displayMonthCont(int year, int month) {

        int day = firstDay(year, month);
        int daysOfMonth = daysInMonth(year, month);

        int i = 0;
	    for (i = 0; i < day; i++)
	        System.out.print("    ");
	    for (i = 1; i <= daysOfMonth; i++) {
            if (i < 10)
                System.out.print("   " + i);
            else
                System.out.print("  " + i);
            if ((i + day) % 7 == 0)
                System.out.println();
	      }
        System.out.println();
	} 

    // finding out first day of given date
    static int firstDay(int year, int month) {

        int firstCalenderStartDay = dayOfWeek(year, month);
        int daysTot = calcDaysTot(year, month);
        return(daysTot + firstCalenderStartDay) % 7;
    }

    static int dayOfWeek(int year, int month){

        int j = (year / 100);
        int k = (year % 100); 
        int q = 1;
        int h = 0;
        
        if(month == 1 || month == 2)
            month += 12;
            year--;

        h = ((q + ((26*(month + 1))/10) + k + (k/4) + (j/4) + (5*j)) % 7); 
        
        if(h == 0){
            h = 5;
        }

        else if(h == 1){
            h = 6;
        }

        else if(h == 2){
            h = 0;
        }
            
        else if(h == 3){
            h = 1;
        }

        else if(h == 4){
            h = 2;
        }

        else if(h == 5){
            h = 3;
        }

        else if(h == 6){
            h = 4;
        }

        if(month == 13 || month == 14)
        return (h - 1);

        else
            return(h);
    }

    // total days of year
    static int calcDaysTot(int year, int month) {

        int tot = 0;
        
        for (int i = year; i < year; i++) 
            if (leapYear(i))
                tot = tot + 366;
            else 
                tot = tot + 365;

        for (int i = month; i < month; i++)
            tot = daysInMonth(year, i);

        return tot;
    }

    // declaring months in given month
    static int daysInMonth(int year, int month) {
            
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        
        if (month == 2) 
            return leapYear(year) ? 29 : 28;
        return 0;
    }
    
    // checking if it´s a leap year
    static boolean leapYear(int year) {
            
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }                
}            
    


        
    

    
    
    
    
    
    
    
    
    
       




    

