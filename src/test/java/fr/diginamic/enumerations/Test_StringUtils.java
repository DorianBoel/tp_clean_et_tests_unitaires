package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import fr.diginamic.utils.StringUtils;

public class Test_StringUtils {

	@Test
	public void test_levenshteinDistance1() {
		
		int result = StringUtils.levenshteinDistance("chats", "chat");
		
		assertEquals(result, 1);
		
	}
	
	@Test
	public void test_levenshteinDistance2() {
		
		int result = StringUtils.levenshteinDistance("machins", "machine");
		
		assertEquals(result, 1);
		
	}
	
	@Test
	public void test_levenshteinDistance3() {
		
		int result = StringUtils.levenshteinDistance("aviron", "avion");
		
		assertEquals(result, 1);
		
	}
	
	@Test
	public void test_levenshteinDistance4() {
		
		int result = StringUtils.levenshteinDistance("Chien", "Chine");
		
		assertEquals(result, 2);
		
	}
	
	@Test
	public void test_levenshteinDistance5() {
		
		int result = StringUtils.levenshteinDistance("distance", "instance");
		
		assertEquals(result, 2);
		
	}
	
	@Test
	public void test_levenshteinDistance6() {
		
		int result = StringUtils.levenshteinDistance("loupe", "arret");
		
		assertTrue(result >= 5);
		
	}
	
	@Test
	public void test_levenshteinDistance7() {
		
		String str1 = "dernier";
		
		int result = StringUtils.levenshteinDistance(str1, str1.toUpperCase());
		
		assertEquals(result, str1.length());
		
	}
	
	@Test
	public void test_levenshteinDistance8() {
		
		int result = StringUtils.levenshteinDistance("", "");
		
		assertEquals(result, 0);
		
	}
	
	@Test
	public void test_levenshteinDistance9() {
		
		Executable exec = () -> StringUtils.levenshteinDistance(null, "");
		
		assertThrows(NullPointerException.class, exec);
		
	}
	
}
