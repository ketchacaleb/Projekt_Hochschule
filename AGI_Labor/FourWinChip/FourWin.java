package FourWinChip;

import static FourWinChip.Result.UNDECIDED;
import static FourWinChip.Result.WIN;

public class FourWin {

    Chip[][] field = new Chip[6][7];

    public String toString() {
        String res = "";
        for (int row = 5; row >= 0; row--) {
            for (int col = 0; col < 7; col++)
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

    public Result throwChip(Chip chip, int column) {

        int row = 5;
        while (field[row][column] != null)
            row--;
        field[row][column] = chip;

        // vertical
        for (int col = 0; col < 7; col++) {
            for (int vertical = 5; vertical > 2; vertical--) {
                if (field[vertical][col] != null
                        && field[vertical][col] == field[vertical-1][col]
                        && field[vertical][col] == field[vertical-2][col]
                        && field[vertical][col] == field[vertical-3][col])
                    return Result.WIN;
            }
        }

        // Horizontal
        for (int col = 0; col < 4; col++) {
            for (int horizontal = 5; horizontal > 0; horizontal--) {
                if (field[horizontal][col] != null
                        && field[horizontal][col] == field[horizontal][col+1]
                        && field[horizontal][col] == field[horizontal][col+2]
                        && field[horizontal][col] == field[horizontal][col+3])
                    return Result.WIN;
            }
        }
        
        // Diagonal
        for (int col = 0; col < 4; col++) {
            for (int diagonal=5; diagonal>2; diagonal--) {
                if (field[diagonal][col] != null
                        && field[diagonal][col] == field[diagonal-1][col+1]
                        && field[diagonal][col] == field[diagonal-2][col+2]
                        && field[diagonal][col] == field[diagonal-3][col+3])
                    return Result.WIN;
            }
        }
        {
            return Result.UNDECIDED;
        }
    }
}    

	
