/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Random;

/**
 *
 * @author lonbern
 */
public class TicTacToeGame {

    
    /**
     * @param args the command line arguments
     */
    
    TicTacToeBoard board;
    
    Random rand;
    boolean bool;
    int winner;
    
    char spaces[] = new char[9];
    
    public static void main(String [] args){
        // TODO code application logic here
        
        
        TicTacToeGame ticky = new TicTacToeGame();
        
        ticky.play();
        
    }
    
    public void TicTacToeGame(){
        for (int i = 0; i < 9; i++){
            spaces[i] = ' ';
        }
        
        board = new TicTacToeBoard();
        
        bool = rand.nextBoolean();
        
    }
    
    
    public void play(){
        
        int turnCount = 0;
        
        System.out.println("Preintro");
        
        board.intro(bool);
        
        System.out.println("postintro");
        
        while (true){
            
            if (bool){
                
                board.printBoard(spaces);
                
                spaces[board.takeInput(spaces)] = 'X';
                
                turnCount++;
               
                bool = false;
               
            }
            
            if (turnCount>4 && checkWin('X')){
                winner = 0;
                break;}
            
            compTurn();
            
            turnCount++;
            
            bool = true;
            
            board.printBoard(spaces);
            
            if (turnCount>4 && checkWin('O')){
                winner = 1;
                break;}
            
            else if (turnCount == 9){
                winner = 2;
                break;
            } 
        }
        
        board.displayWin(winner);
        
    }
    
    public boolean checkWin(char mark){
        
        if (spaces[4]==mark){
            if (spaces[0]==mark){
                if (spaces[8]==mark){return true;}
            }
            if (spaces[3]==mark){
                if (spaces[5]==mark){return true;}
            }
            
            if (spaces[6]==mark){
                if (spaces[2]==mark){return true;}
            }
            
            if (spaces[1]==mark){
                if (spaces[7]==mark){return true;}
            }
        }
        
        if (spaces[0]==mark){
            if (spaces[1]==mark){
                if (spaces[2]==mark){return true;}
            }
            if (spaces[3]==mark){
                if (spaces[6]==mark){return true;}
            }
        }
        
        if (spaces[8]==mark){
            if (spaces[7]==mark){
                if (spaces[6]==mark){return true;}
            }
            if (spaces[5]==mark){
                if (spaces[2]==mark){return true;}
            }
        }
        
        return false;
        
    }
    

    private void compTurn() {
        int choice;
        while (true){
            choice = rand.nextInt(9);
            if (spaces[choice]==' '){break;}
        }
        spaces[choice] = 'O';
    }
    
    
    
}
