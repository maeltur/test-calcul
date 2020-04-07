/**
 * 
 */
package calculs;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    void setUp() throws Exception {
    }        

    @AfterEach
    void tearDown() throws Exception {
    }

    static Stream<Arguments> chargerJeuDeTestMul() throws Throwable {
            return Stream.of(
                Arguments.of(2,2,4),
                Arguments.of(6,6,36),
                Arguments.of(3,2,6),
                Arguments.of(3,3,9)
            );
    }
    static Stream<Arguments> chargerJeuDeTestAdd() throws Throwable {
        return Stream.of(
            Arguments.of(2,2,4),
            Arguments.of(6,6,12),
            Arguments.of(3,2,5),
            Arguments.of(3,3,6)
        );
}
    static Stream<Arguments> chargerJeuDeTestDiv() throws Throwable {
        return Stream.of(
            Arguments.of(2,2,1),
            Arguments.of(6,6,1),
            Arguments.of(4,2,2),
            Arguments.of(3,3,1)
        );
}
    static Stream<Arguments> chargerJeuDeTestSou() throws Throwable {
        return Stream.of(
            Arguments.of(2,2,0),
            Arguments.of(6,6,0),
            Arguments.of(3,2,1),
            Arguments.of(3,3,0)
        );
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

	@ParameterizedTest(name="Multiplication numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
    @MethodSource("chargerJeuDeTestMul")
    void testMultiplier(int firstNumber, int secondNumber, int expectedResult) {
            Calculs monCal = new Calculs(firstNumber, secondNumber);
            assertEquals(expectedResult, monCal.multiplier());
    }

	/**
	 * Test method for {@link calculs.Calculs#additionner()}.
	 */
	@ParameterizedTest(name="Addition numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
    @MethodSource("chargerJeuDeTestAdd")
    void testAdditionner(int firstNumber, int secondNumber, int expectedResult) {
            Calculs monCal = new Calculs(firstNumber, secondNumber);
            assertEquals(expectedResult, monCal.additionner());
    }
	/**
	 * Test method for {@link calculs.Calculs#diviser()}.
	 */
	
	@ParameterizedTest(name="Division numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
    @MethodSource("chargerJeuDeTestDiv")
    void testDiviser(int firstNumber, int secondNumber, int expectedResult) {
            Calculs monCal = new Calculs(firstNumber, secondNumber);
            assertEquals(expectedResult, monCal.diviser());
	}

	/**
	 * Test method for {@link calculs.Calculs#soustraire()}.
	 */
	@ParameterizedTest(name="Soustraction numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
    @MethodSource("chargerJeuDeTestSou")
    void testSoustraire(int firstNumber, int secondNumber, int expectedResult) {
            Calculs monCal = new Calculs(firstNumber, secondNumber);
            assertEquals(expectedResult, monCal.soustraire());
    }

}
