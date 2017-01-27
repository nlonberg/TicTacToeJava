/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author lonbern
 */
public class TicTacToeBoard {
    
    
    Scanner scan;
    int row;
    int col;
    
    /**
     *
     * @param spaces
     */
    public void printBoard(char[] spaces){
        
        String border;
        border = "+---+---+---+";
        System.out.println(border);
        
        for (row = 0; row<3;row++);{
            for (col=0;col<3;col++);{
                System.out.print("| ");
                System.out.print(spaces[row*3+col]+" ");
            }
            System.out.print("|\n"+border+"\n");
        }        
        
    }

    void intro(boolean bool) {
        System.out.println("It is time for TIC! TAC! TOE!");
        System.out.println("You versus me. I am 'O', you are 'X'");
        
        if (bool){System.out.println("You go first.");}
        else {System.out.println("I go first.");}
        
    }
    
    
    int takeInput(char[] spaces){
        
        
        while (true){
            
            System.out.print("Select your row: ");
        
            row = scan.nextInt();
        
            System.out.println("\nSelect your column: ");
        
            col = scan.nextInt();
            
            if (spaces[3*row+col]==' '){break;}
            else {System.out.println("\nPlease choose an empty space.");}
            
        }
        
        System.out.print('\n');
        
        return (3*row + col);
        
    }

    void displayWin(int winner) {
        if (winner==0){
            System.out.println("\nYou win...");
        }
        else if (winner == 1){System.out.println("\nHa! I WIN!");}
        
        else if (winner == 2){System.out.println("\nCat's Scratch!");}
    }
    
}
