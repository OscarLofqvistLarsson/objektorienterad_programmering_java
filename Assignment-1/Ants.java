package assignment1;

import java.util.Random;

public class Ants {
    public static void main(String[] args) {

        int [][] board = new int [8][8];
        int count = 0;
        int x = 0;
        int y = 0;
        int steps = 0;
        int simulations = 1;
        int totalSteps = 0; 

        for (int i = 0; i < 10; i++) {
            count = 0;
            Random random = new Random();
            int antPosX = random.nextInt(8);
            int antPosY = random.nextInt(8);
            
            // make all squares on board to zero
            for(x = 0; x < 8; x++) {
                for(y = 0; y < 8; y++) {
                    board [x][y] = 0;
                }
            }
            // putting ant random positon on board
            board [antPosX] [antPosY] = 1;
            count = 1;
            steps = 0;
            
            while(count < 64) {

                int movement =  (int) (Math.random() * 4) + 1;
                
                // move left
                if (movement == 1 && antPosX != 0) {
                    antPosX--;
                    steps++; 
                    if(board[antPosX][antPosY] == 0){
                        board[antPosX][antPosY] = 1;
                        count++;
                    }
                    
                }
                // move right
                else if (movement == 2 && antPosX != board.length - 1) {
                   antPosX++;
                    steps++;  
                    if(board[antPosX][antPosY] == 0) {
                        board[antPosX][antPosY] = 1;
                        count++;
                    }
                }
                // move down
                else if (movement == 3 && antPosY != 0) {
                    antPosY--;
                    steps++; 
                    if(board[antPosX][antPosY] == 0) {
                        board[antPosX][antPosY] = 1;
                        count++;
                    }
                }
                // move up
                else if (movement == 4 && antPosY != board.length - 1) {
                    antPosY++;
                    steps++; 
                    if(board[antPosX][antPosY] == 0) {
                        board[antPosX][antPosY] = 1;
                        count++;
                    }
                }
            } 
            
            System.out.println("The ant took: " + steps + " steps in simulation: " + simulations);
            totalSteps = totalSteps + steps;
            simulations++;
        }    

        int averageSteps = (totalSteps / 10);
        System.out.println("Average amount of steps was: " + averageSteps);
    }  
}
