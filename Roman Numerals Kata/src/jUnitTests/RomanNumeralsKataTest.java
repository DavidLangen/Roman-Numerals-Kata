package jUnitTests;

import static org.junit.Assert.*;
import org.junit.Test;
import mainProgram.RomanNumeralsKataProgram;

public class RomanNumeralsKataTest {

	@Test
	public void testEinsZweiDreiEncoder() {
		assertEquals("I", RomanNumeralsKataProgram.romanNumeralsEncoder(1));
		assertEquals("II", RomanNumeralsKataProgram.romanNumeralsEncoder(2));
		assertEquals("III", RomanNumeralsKataProgram.romanNumeralsEncoder(3));
	}
	
}
