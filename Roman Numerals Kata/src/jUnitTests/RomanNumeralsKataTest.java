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
	public void testFuenfzigEncoder(){
		assertEquals("L", RomanNumeralsKataProgram.romanNumeralsEncoder(50));
	}
	
	@Test
	public void testZufaelligeZweistelligeZahlenEncoder(){
		assertEquals("XLII", RomanNumeralsKataProgram.romanNumeralsEncoder(42));
		assertEquals("XXVI", RomanNumeralsKataProgram.romanNumeralsEncoder(26));
		assertEquals("LXXII", RomanNumeralsKataProgram.romanNumeralsEncoder(72));
	}
	
	@Test
	public void testHundertEncoder(){
		assertEquals("C", RomanNumeralsKataProgram.romanNumeralsEncoder(100));
	}
	
	@Test
	public void testFuenfHundertEncoder(){
		assertEquals("D", RomanNumeralsKataProgram.romanNumeralsEncoder(500));
	}
	
	@Test
	public void testZufaelligeDreistelligeZahlenEncoder(){
		assertEquals("CMXCIX", RomanNumeralsKataProgram.romanNumeralsEncoder(999));
		assertEquals("CCLXIII", RomanNumeralsKataProgram.romanNumeralsEncoder(263));
		assertEquals("DLXXII", RomanNumeralsKataProgram.romanNumeralsEncoder(572));
	}
	
	@Test
	public void testTausendEncoder(){
		assertEquals("M", RomanNumeralsKataProgram.romanNumeralsEncoder(1000));
	}
	
	@Test
	public void testZufaelligeVierstelligeZahlenEncoder(){
		assertEquals("MMCMLIX", RomanNumeralsKataProgram.romanNumeralsEncoder(2959));
		assertEquals("MDCCLXIII", RomanNumeralsKataProgram.romanNumeralsEncoder(1763));
		assertEquals("MMXVII", RomanNumeralsKataProgram.romanNumeralsEncoder(2017));
	}
	
	public void testMaxWertEncoder(){
		assertEquals("MMMDCDXCIX", RomanNumeralsKataProgram.romanNumeralsEncoder(3999));
	}
	
	
	
	
}