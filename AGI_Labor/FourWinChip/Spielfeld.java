package FourWinChip;

import static FourWinChip.Result.UNDECIDED;
import static FourWinChip.Result.WIN;

public class Spielfeld {
               
    Chip[][] field;
    public int ROWS;
    public int COLS;

    public Spielfeld(int ROWS, int COLS, int WINLENGTH) {
        this.ROWS = ROWS;
        this.COLS = COLS;
        field = new Chip[ROWS][COLS];
    }

    public String toString() {
        String res = "";
        for (int row = ROWS-1; row >= 0; row--) {
            for (int col = 0; col < COLS; col++)
                res += field[row][col] + " ";
            res += "\n";
        }
        return res;
    }

    public Result verticalLinksUnten() {
        return WIN;
    }

    public Result horizontalLinkUnten() {
        return WIN;
    }
    
    public Result TicTacToeVerticalLinks() {
        return WIN;
    }
    
    

    public Result throwChip(Chip chip, int column) {

        int row = ROWS-1;
        while (field[row][column] != null)
            row--;
        field[row][column] = chip;

        
        if(field.length == 6)
        // Verticale Itteration über das "Game of live"
        for (int col = 0; col < COLS; col++) {
            for (int vertical = ROWS-1; vertical > ROWS-4; vertical--) {
                if (field[vertical][col] != null
                        && field[vertical][col] == field[vertical-1][col]
                        && field[vertical][col] == field[vertical-2][col]
                        && field[vertical][col] == field[vertical-3][col])
                 return Result.WIN;
            }
        }
        else
        // Verticale Itteration über das "TicTacToe" 
        for (int col = 0; col < COLS; col++) {
            for (int vertical = ROWS-1; vertical > ROWS-3 ; vertical--) {
                if (field[vertical][col] != null
                        && field[vertical][col] == field[vertical-1][col]
                        && field[vertical][col] == field[vertical-2][col])
                    return Result.WIN;
            }
        }
        
        if(field.length == 6)
        // Horizontale Iteration über das "Game of live"
        for (int col = 0; col < COLS-3; col++) {
            for (int horizontal = ROWS-1; horizontal > ROWS-6; horizontal--) {
                if (field[horizontal][col] != null
                        && field[horizontal][col] == field[horizontal][col+1]
                        && field[horizontal][col] == field[horizontal][col+2]
                        && field[horizontal][col] == field[horizontal][col+3])
                    return Result.WIN;
            }
        }
        else
        // Horizontale Iteration über das "TicTacToe"
        for (int col = 0; col < COLS-1; col++) {
            for (int horizontal = ROWS-1; horizontal > ROWS-3; horizontal--) {
                if (field[horizontal][col] != null
                        && field[horizontal][col] == field[horizontal][col+1]
                        && field[horizontal][col] == field[horizontal][col+2])
                    return Result.WIN;
            }
        }
        if(field.length == 6)
        // Diagonale Iteration über das "Game of live"
        for (int col = 0; col < COLS-2; col++) {
            for (int diagonal=ROWS-1; diagonal>ROWS-4; diagonal--) {
                if (field[diagonal][col] != null
                        && field[diagonal][col] == field[diagonal-1][col+1]
                        && field[diagonal][col] == field[diagonal-2][col+2]
                        && field[diagonal][col] == field[diagonal-3][col+3])
                    return Result.WIN;
            }
        }
        else
        // Diagonale Iteration über das " TicTacToe"
        for (int col = 0; col < COLS-1; col++) {
            for (int diagonal=ROWS-1; diagonal>ROWS-3; diagonal--) {
                if (field[diagonal][col] != null
                        && field[diagonal][col] == field[diagonal-1][col+1]
                        && field[diagonal][col] == field[diagonal-2][col+2])
                    return Result.WIN;
            }
        }
            return Result.UNDECIDED;
        }
    
    public Result isDraw(){
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                if (field[row][col].equals(UNDECIDED)) {
                    return Result.DRAW;
                }
            }
        }
        return Result.DRAW;   
    }

    public void draw(){
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                if (col<COLS-1) {
                    System.out.println("|");
                }
                System.out.println();
                if (row<ROWS-1) {
                    System.out.println("---------");
                }
            }
        }
    }
    }


	
