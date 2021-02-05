package assignment1;

import java.util.Scanner;

public class GameSRP {

    public static void main(String[] args) {

        int playerScore = 0;
        int computerScore = 0;
        int draws = 0;

        String scissor = "1";
        String rock = "2";
        String paper = "3";
        
        // randomizing move
        String computerMove = new String[] {"1", "2", "3"} [(int)(Math.random() * 3)];

        // game beginning´s question
        System.out.println("Begin game (1), (0) to quit");
        Scanner scan = new Scanner(System.in);
        String playerMove = scan.nextLine();
       
        // game
        while(! playerMove.equals("0")){
            System.out.println("Scissor (1), Rock (2), Paper (3) or (0) to quit");
            playerMove = scan.nextLine();
            computerMove = new String[] {"1", "2", "3"} [(int)(Math.random() * 3)];
        
            if(playerMove.equals(computerMove)) {
                System.out.println("computer also choose " + playerMove + " it´s a draw");
                draws ++;
            }
            else if (playerMove.equals(scissor)) {
                System.out.println("You picked scissor");
                
                if(computerMove.equals(rock)){
                    System.out.println("You lose! Computer choose rock");
                    computerScore ++;
                }

                else if (computerMove.equals(paper)) {
                    System.out.println("You win! Computer choose paper");
                    playerScore ++; 
                }
            }
            else if(playerMove.equals(rock)){
                System.out.println("You picked paper");

                if(computerMove.equals(paper)){
                    System.out.println("You lose! computer choose paper");
                    computerScore ++;
                }
                
                else if(computerMove.equals(scissor)){
                    System.out.println("You win! computer choose scissor");
                    playerScore ++;
                }
            }
            else if(playerMove.equals(paper)){
                System.out.println("You picked paper");

                if(computerMove.equals(scissor)){
                    System.out.println("You lose! computer choose scissor");
                    computerScore ++;
                }
                
                else if(computerMove.equals(rock)){
                    System.out.println("You win! computer choose rock");
                    playerScore ++;
                }
            }
        }
        while(playerMove.equals("0")){
            System.out.println("Total score was:  " + playerScore + " wins for you " + computerScore + " wins for computer " + "and " +  draws + " draws");
            scan.close();
            java.lang.System.exit(1);
        }
    }
}





















 