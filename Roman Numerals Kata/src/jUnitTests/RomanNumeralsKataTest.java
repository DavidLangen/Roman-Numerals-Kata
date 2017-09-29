package jUnitTests;

import static org.junit.Assert.*;
import org.junit.Test;
import mainProgram.RomanNumeralsKataProgram;

public class RomanNumeralsKataTest {
	
	/*--EncoderTests--*/
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
	@Test
	public void testMaxWertEncoder(){
		assertEquals("MMMCMXCIX", RomanNumeralsKataProgram.romanNumeralsEncoder(3999));
	}
	@Test
	public void testGroeﬂerMaxWertEncoder(){
		assertEquals("", RomanNumeralsKataProgram.romanNumeralsEncoder(4000));
	}
	
	
	/*--DecoderTests--*/
	
	@Test
	public void testEinsZweiDreiDecoder(){
		assertEquals(1, RomanNumeralsKataProgram.romanNumeralsDecoder("I"));
		assertEquals(2, RomanNumeralsKataProgram.romanNumeralsDecoder("II"));
		assertEquals(3, RomanNumeralsKataProgram.romanNumeralsDecoder("III"));
	}
	
	@Test
	public void testLeererStringDecoder(){
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder(""));
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder(" "));
	}
	
	@Test
	public void testKleinbuchstabenDecoder(){
		assertEquals(3, RomanNumeralsKataProgram.romanNumeralsDecoder("iii"));
		assertEquals(4, RomanNumeralsKataProgram.romanNumeralsDecoder("iv"));
	}
	
	@Test
	public void testUngueltigeRoemischeZahlDecoder(){
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder("IIV"));
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder("IIIV"));
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder("IIIV"));
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder("VIIII"));
		
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder("IIX"));
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder("IIIX"));
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder("XIIII"));
		
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder("MMMMMMM"));
		
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder("IIIX"));
	}
	
	@Test
	public void testUngueltigeBuchstabenDecoder(){
		assertEquals(-1, RomanNumeralsKataProgram.romanNumeralsDecoder("DAVID"));
	}
	
	@Test
	public void testVierDecoder(){
		assertEquals(4, RomanNumeralsKataProgram.romanNumeralsDecoder("IV"));
	}
	
	@Test
	public void testFuenfDecoder(){
		assertEquals(5, RomanNumeralsKataProgram.romanNumeralsDecoder("V"));
	}
	
	@Test
	public void testZehnDecoder(){
		assertEquals(10, RomanNumeralsKataProgram.romanNumeralsDecoder("X"));
	}
	
	@Test
	public void testFuenfzigDecoder(){
		assertEquals(50, RomanNumeralsKataProgram.romanNumeralsDecoder("L"));
	}
	
	@Test
	public void testZufaelligeZweistelligeZahlenDecoder(){
		assertEquals(42, RomanNumeralsKataProgram.romanNumeralsDecoder("XLII"));
		assertEquals(26, RomanNumeralsKataProgram.romanNumeralsDecoder("XXVI"));
		assertEquals(72, RomanNumeralsKataProgram.romanNumeralsDecoder("LXXII"));
	}
	
	@Test
	public void testHundertDecoder(){
		assertEquals(100, RomanNumeralsKataProgram.romanNumeralsDecoder("C"));
	}
	
	@Test
	public void testFuenfHundertDEcoder(){
		assertEquals(500, RomanNumeralsKataProgram.romanNumeralsDecoder("D"));
	}
	
	@Test
	public void testZufaelligeDreistelligeZahlenDecoder(){
		assertEquals(999, RomanNumeralsKataProgram.romanNumeralsDecoder("CMXCIX"));
		assertEquals(263, RomanNumeralsKataProgram.romanNumeralsDecoder("CCLXIII"));
		assertEquals(572, RomanNumeralsKataProgram.romanNumeralsDecoder("DLXXII"));
	}
	
	@Test
	public void testTausendDecoder(){
		assertEquals(1000, RomanNumeralsKataProgram.romanNumeralsDecoder("M"));
	}
	
	@Test
	public void testZufaelligeVierstelligeZahlenDecoder(){		
		assertEquals(2959, RomanNumeralsKataProgram.romanNumeralsDecoder("MMCMLIX"));
		assertEquals(1763, RomanNumeralsKataProgram.romanNumeralsDecoder("MDCCLXIII"));
		assertEquals(2017, RomanNumeralsKataProgram.romanNumeralsDecoder("MMXVII"));
	}
	
	@Test
	public void testMaxWertDecoder(){
		assertEquals(3999, RomanNumeralsKataProgram.romanNumeralsDecoder("MMMDCDXCIX"));
		
	}
	
	
	
	
}