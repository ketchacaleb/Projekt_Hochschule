package FourWinChip;

import static FourWinChip.Chip.*;
import static FourWinChip.Result.*;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class FourWinTest {
	
	FourWin logic = new FourWin();
 
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
	
	@Ignore
        public void horizontalLinkUnten2teSpalte()throws Exception {
	        assertEquals(UNDECIDED, logic.throwChip(YELLOW, 0));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 1));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 3));
                assertEquals(WIN, logic.throwChip(BLUE, 4));
        }
	
	@Ignore
        public void horizontalLinkUnten3teSpalte()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 0));
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 1));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 3));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 4));
                assertEquals(WIN, logic.throwChip(BLUE, 5));
        }
	
	@Ignore
        public void horizontalLinkUnten4teSpalte()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 0));
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 1));
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 2));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 3));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 4));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 5));
                assertEquals(WIN, logic.throwChip(BLUE, 6));
        }
	
	@Ignore
        public void diagonal1()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 1));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                assertEquals(WIN, logic.throwChip(BLUE, 3));
        }
	
	@Ignore
        public void diagonal2()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 1));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                assertEquals(WIN, logic.throwChip(BLUE, 3));
        }
	
	@Ignore
        public void diagonal3()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 1));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                assertEquals(WIN, logic.throwChip(BLUE, 3));
        }
	
	@Ignore
        public void diagonal4()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 0));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 1));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                assertEquals(WIN, logic.throwChip(BLUE, 3));
        }
	
	@Ignore
        public void diagonal5()throws Exception {
                assertEquals(UNDECIDED, logic.throwChip(YELLOW, 0));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 1));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 2));
                assertEquals(UNDECIDED, logic.throwChip(BLUE, 3));
                assertEquals(WIN, logic.throwChip(BLUE, 4));
        }
}
