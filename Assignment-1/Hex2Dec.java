package assignment1;

import java.util.Scanner;

public class Hex2Dec {
    
    // method to make hex to dec
    public static int hexToDecimal(String hex) {
        
        // hex characters 
        String hexChars = "0123456789ABCDEF";
        int dec = 0; 
        hex = hex.toUpperCase();

        for( int i = 0; i < hex.length(); i++){

            char c = hex.charAt(i);  
            int x = hexChars.indexOf(c);

            dec = 16 * dec + x;
        }
        return dec;
    }
    public static void main(String[] args){
        
        System.out.println("Enter a hex number: ");
        Scanner scan = new Scanner(System.in);
        String hex = scan.nextLine();

        System.out.println("The decimal value for " + hex + " is " + hexToDecimal(hex));   

        scan.close();
    }
}
