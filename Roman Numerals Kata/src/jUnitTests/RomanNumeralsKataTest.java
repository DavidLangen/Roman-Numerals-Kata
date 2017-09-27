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
	public void testVierEncoder(){
		assertEquals("IV", RomanNumeralsKataProgram.romanNumeralsEncoder(4));
	}
	
	@Test
	public void testFuenfEncoder(){
		assertEquals("V", RomanNumeralsKataProgram.romanNumeralsEncoder(5));
	}
	
	@Test
	public void testZehnEncoder(){
		assertEquals("X",RomanNumeralsKataProgram.romanNumeralsEncoder(10));
	}
	
	@Test
	public void testZufaelligeZweistelligeZahlen(){
		assertEquals("XLII", RomanNumeralsKataProgram.romanNumeralsEncoder(42));
		assertEquals("XXVI", RomanNumeralsKataProgram.romanNumeralsEncoder(26));
		assertEquals("LXXII", RomanNumeralsKataProgram.romanNumeralsEncoder(72));
	}
	
}