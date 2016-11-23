package FourWinChip;

import static FourWinChip.Chip.*;
import static FourWinChip.Result.*;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class FourWinTest {
	
	Spielfeld logic = new Spielfeld(6, 7, 4);
 
	@Test
	public void verticaLinkUnten()throws Exception {
		assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
		assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
		assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
		assertEquals(WIN, logic.throwChip(BLUE, 0));
	}

	@Test
	public void verticaLinkUnten2teZeile()throws Exception {
		assertEquals(UNDECIDED, logic.throwChip(YELLOW, 0));
		assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
		assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
		assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
		assertEquals(WIN, logic.throwChip(BLUE, 0));
	}
	@Test
	public void verticaLinkUnten3teZeile()throws Exception {
		assertEquals(UNDECIDED, logic.throwChip(YELLOW, 0));
		assertEquals(UNDECIDED, logic.throwChip(YELLOW, 0));
		assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
		assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
		assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
		assertEquals(WIN, logic.throwChip(BLUE, 0));
	}
	@Test
        public void horizontalLinkUnten()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 1));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                assertEquals(WIN, logic.throwChip(BLUE, 3));
        }
	
	@Test
        public void horizontalLinkUnten2teSpalte()throws Exception {
	        assertEquals(UNDECIDED, logic.throwChip(YELLOW, 0));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 1));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 3));
                assertEquals(WIN, logic.throwChip(BLUE, 4));
        }
	
	@Test
        public void horizontalLinkUnten3teSpalte()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 0));
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 1));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 3));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 4));
                assertEquals(WIN, logic.throwChip(BLUE, 5));
        }
	
	@Test
        public void horizontalLinkUnten4teSpalte()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 0));
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 1));
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 2));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 3));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 4));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 5));
                assertEquals(WIN, logic.throwChip(BLUE, 6));
        }
	
	@Test
        public void diagonalLinksUnten()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
                
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 1));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 1));
                
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 2));
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 2));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 3));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 3));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 3));
                assertEquals(WIN, logic.throwChip(BLUE, 3));
        }
	
	@Test
        public void diagonalMitteUnten()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 3));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 3));
                
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 4));
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 4));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 4));
                
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 5));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 5));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 5));
                assertEquals(WIN, logic.throwChip(BLUE, 5));
        }
	
	@Test
        public void diagonalRechtsUnten()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 5));
                
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 6));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 6));
        }
	
	// Test für das TicTacToe	
	Spielfeld logicTicTacToe = new Spielfeld(3, 3, 3);
	
	@Test
        public void TicTacToeVerticalLinksUnten()throws Exception {
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(BLUE, 0));
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(BLUE, 0));
                assertEquals(WIN, logicTicTacToe.throwChip(BLUE, 0));
        }
	
	@Test
        public void TicTacToeHorizontalLinksUnten()throws Exception {
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(BLUE, 0));
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(BLUE, 1));
                assertEquals(WIN, logicTicTacToe.throwChip(BLUE, 2));
        }
	
	@Ignore
        public void TicTacToeDiagonalLinksUnten()throws Exception {
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(BLUE, 0));
                
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(YELLOW, 1));
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(BLUE, 1));
                
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(YELLOW, 2));
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(YELLOW, 2));
                assertEquals(WIN, logicTicTacToe.throwChip(BLUE, 2));
        }
	
	@Ignore
        public void TicTacToeDiagonalRechtOben()throws Exception {
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(BLUE, 2));
                
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(YELLOW, 1));
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(BLUE, 1));
                
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(YELLOW, 0));
                assertEquals(UNDECIDED, logicTicTacToe.throwChip(YELLOW, 0));
                assertEquals(WIN, logicTicTacToe.throwChip(BLUE, 0));
        }
}
