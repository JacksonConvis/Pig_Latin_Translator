import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPigLatin {

	@Test
	void test() {
		String expected = "oromirbay";
		String actual = Pig_Latin.translate("boromir");
		assertEquals(expected, actual); 
	}
	@Test
	void testVowel() {
		String expected = "oinay";
		String actual = Pig_Latin.translate("oin");
		assertEquals(expected, actual); 
	}
	@Test
	void testConsonants() {
		String expected = "odofray";
		String actual = Pig_Latin.translate("frodo");
		assertEquals(expected, actual); 
	}
	@Test
	void testToLowerCase() {
		String expected = "anduilthray";
		String actual = Pig_Latin.translate("Thranduil");
		assertEquals(expected, actual); 
	}
}
