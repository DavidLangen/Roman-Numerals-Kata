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
	
	@Test
	public void testNegativEncoder(){
		assertEquals("", RomanNumeralsKataProgram.romanNumeralsEncoder(-1));
		assertEquals("", RomanNumeralsKataProgram.romanNumeralsEncoder(0));
	}
	
	@Test
	public void testVier(){
		assertEquals("IV", RomanNumeralsKataProgram.romanNumeralsEncoder(4));
	}
	
	@Test
	public void testFuenf(){
		assertEquals("V", RomanNumeralsKataProgram.romanNumeralsEncoder(4));
	}
	
}