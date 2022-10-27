package tp_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import tp_junit.enumerations.Saison;

public class Test_Saison {

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
		
		assertNull(result);
		
	}
	
	@Test
	public void test_valueOfLibelle_4() {
		
		Saison result = Saison.valueOfLibelle(null);
		
		assertNull(result);
		
	}
	
}
