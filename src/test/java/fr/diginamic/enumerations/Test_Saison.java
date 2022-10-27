package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Saison_Test {

	@Test
	public void test_valueOfLibelle_1() {
		
		Saison result = Saison.valueOfLibelle("Printemps");
		
		assertEquals(result, Saison.PRINTEMPS);
		
	}
	
	@Test
	public void test_valueOfLibelle_2() {
		
		Saison result = Saison.valueOfLibelle("hIveR");
		
		assertEquals(result, Saison.HIVER);
		
	}
	
	@Test
	public void test_valueOfLibelle_3() {
		
		Saison result = Saison.valueOfLibelle("Autonme");
		
		assertEquals(result, null);
		
	}
	
	@Test
	public void test_valueOfLibelle_4() {
		
		Saison result = Saison.valueOfLibelle(null);
		
		assertEquals(result, null);
		
	}
	
}
