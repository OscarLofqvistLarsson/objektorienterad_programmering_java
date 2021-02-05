package assignment1;

import java.util.Random;
import java.util.Scanner;

public class hitANine {
    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
       
        int userScore = 0;
        int computerScore = 0;

        // game
        System.out.print("Do you want to play? (Y/N) \n");
        String wannaPlay = scan.next();

        if (wannaPlay.equals ("Y")){
            int userThrow1 = rand.nextInt(6) + 1;
            System.out.print("You got a:" + userThrow1 + "\n");
            userScore =+ userThrow1;
            
            System.out.print("Do you want to roll again? (Y/N)  \n");
            String wannaRoll = scan.next();
    
            if (wannaRoll.equals ("Y")){
                int userThrow2 = rand.nextInt(6) +1;
                System.out.print("you got a:" + userThrow2 +"\n");
                userScore = userScore + userThrow2;
                System.out.print("You´r total score:" + userScore + "\n");
    
                int computerThrow1 = rand.nextInt(6) + 1;
                System.out.print("The computer got a:" + computerThrow1 + "\n" );
                computerScore =+ computerThrow1;
            
                if (computerScore < 5){
                    int computerThrow2;
                    computerThrow2 = rand.nextInt(6) +1;                                            
                    System.out.print("The computer got a:" + computerThrow2 + "\n");
                    computerScore = computerThrow1+ computerThrow2;
                
                System.out.print("Computer score:" + computerScore + "\n");
                }
                    if(userScore > 9){
                        System.out.print("Fat! automatic loss for you \n");
                    }
                
                    else if(computerScore > 9){
                        System.out.print("Fat! You automatic loss for you \n");
                    }
        
                    else if(computerScore > userScore){
                        System.out.print("You lost! \n");
                    }
                    
                    else if(userScore > computerScore){
                        System.out.print("You Won! \n");
                    }
                    
                    else if(computerScore == userScore){
                        System.out.print("It´s a tie!+ \n");  
                    }
                    scan.close();{
                    }
                }
            
            if(wannaRoll.equals("N")){
                System.out.print("You stayed and you´r total score is:" + userScore +"\n");
                
                int computerThrow1 = rand.nextInt(6) + 1;
                System.out.print("The computer got a:" + computerThrow1 + "\n" );
                computerScore =+ computerThrow1;
    
                
                if (computerScore < 5){
                    int computerThrow2;
                    computerThrow2 = rand.nextInt(6) +1;    
                    System.out.print("Computer got a:" + computerThrow2 + "\n");
                    computerScore = computerThrow1+ computerThrow2;        
                    System.out.print("Computer score:" + computerScore + "\n");
                                                    
                }
                    // result check
                    if(userScore > 9){
                        System.out.print("Fat! automatic loss for you \n");
                    }
                
                    else if(computerScore > 9){
                        System.out.print("Fat! You automatic loss for you \n");
                    }
                    
                    else if(computerScore > userScore){
                        System.out.print("You lost \n");
                    }
                    
                    else if(computerScore < userScore){
                        System.out.print("You Won \n");
                    }
                    
                    else if(computerScore == userScore){
                        System.out.print("It´s a tie \n");    
                }
                
                }
        }
        else if(wannaPlay.equals("N")){
            System.out.print("Too bad! \n");
            scan.close();
            java.lang.System.exit(1);
        }
        else{
            System.out.print("Wrong input! \n");
                scan.close();
                java.lang.System.exit(1);
            }
            
        }
    }



     
        
    
