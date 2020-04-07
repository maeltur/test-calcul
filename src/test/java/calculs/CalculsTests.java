/**
 * 
 */
package calculs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author maelt
 * 
 */
class CalculsTests {

	private Calculs c1 = null;
	/**
	 * 
	 * Initialise les valeurs avant chaque test
	 * 
	 */
	@BeforeEach
	void setUp() throws Exception{
		c1 = new Calculs(1,2);
	}
	
	/**
	 * Test method for {@link calculs.Calculs#Calculs(int, int)}.
	 */
	@Test
	void testCalculs() {
		///fail("Not yet implemented");
	}

	/**
	 * Test method for {@link calculs.Calculs#multiplier()}.
	 */
	@Test
	void testMultiplier() {
		if (c1.multiplier()!=3){
			fail("Erreur dans la multiplication");
		}
	}

	/**
	 * Test method for {@link calculs.Calculs#additionner()}.
	 */
	@Test
	void testAdditionner() {
		if(c1.additionner()!=3) {
		fail("Not yet implemented");
	}
	}

	/**
	 * Test method for {@link calculs.Calculs#diviser()}.
	 */
	
	@Test
	void testDiviser() {
		if (c1.diviser()!=0) {
		fail("Not yet implemented");
		}
	}

	/**
	 * Test method for {@link calculs.Calculs#soustraire()}.
	 */
	@Test
	void testSoustraire() {
		if (c1.soustraire()!=-1) {
		fail("Not yet implemented");
		}
	}

}
