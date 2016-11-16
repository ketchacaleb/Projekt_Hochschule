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
	
	public Result verticalLinksUnten(){
		return WIN;
	}
	
	public Result horizontalLinkUnten(){
	   return WIN;
	}
 
    public Result throwChip(Chip chip, int column) {

        int row = 0;
        while (field[row][column] != null)
            row++;
        field[row][column] = chip;
        
      for(int col = 0; col < 6; col++){
        for (row = 0; row < 5; row++) {
            if (field[0][0] == field[1][0]
                     && field[0][0] == field[2][0] 
                     && field[0][0] == field[3][0]){
               return WIN;   
            }else if(field[1][0] != null
                  && field[1][0] == field[2][0] 
                  && field[1][0] == field[3][0] 
                  && field[1][0] == field[4][0]) {
                return WIN;
            }else if(field[1][0] != null
                     && field[1][0] == field[2][0] 
                     && field[1][0] == field[3][0] 
                     && field[1][0] == field[4][0]){
                     return WIN;
            }else if (field[2][0] != null
                     && field[2][0] == field[3][0] 
                     && field[2][0] == field[4][0] 
                     && field[2][0] == field[5][0]){
                return WIN;
                
            }else if (field[0][0] == field[0][1]      // Ab hier wird über die Spalte iteriert 
                     && field[0][0] == field[0][2] 
                     && field[0][0] == field[0][3]){
                return WIN;
            }else if(field[0][1] != null
                     && field[0][1] == field[0][2] 
                     && field[0][1] == field[0][3] 
                     && field[0][1] == field[0][4]){
                return WIN;
            }else if(field[0][2] != null
                     && field[0][2] == field[0][3] 
                     && field[0][2] == field[0][4] 
                     && field[0][2] == field[0][5]){
                return WIN;
            }else if(field[0][3] != null
                     && field[0][3] == field[0][4] 
                     && field[0][3] == field[0][5] 
                     && field[0][3] == field[0][6]){
                return WIN;
            }else if(field[3][0] != null       // Ab hier wird über das Diagonal geprüft
                     && field[3][0] == field[2][1] 
                     && field[3][0] == field[1][2] 
                     && field[3][0] == field[0][3]){
                return WIN; 
            }else if(field[4][0] != null       
                     && field[4][0] == field[3][1] 
                     && field[4][0] == field[2][2] 
                     && field[4][0] == field[1][3]){
                return WIN;
            }else if(field[5][0] != null       
                     && field[5][0] == field[4][1] 
                     && field[5][0] == field[3][2] 
                     && field[5][0] == field[2][4]){
                return WIN;
            }
//                  {
//                return WIN;
//            }
            return UNDECIDED;
        }
      }
        return UNDECIDED;
    }
}
      

	
