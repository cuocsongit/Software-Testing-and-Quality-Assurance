package study.junit.quadratic_equation;
import static org.junit.Assert.*;

import org.junit.Test;


public class QuadraticEquationTest {

	@Test
	public void testQuadraticFormat() {
		QuadraticEquation equationTest = new QuadraticEquation(0, 2, 1);
		assertEquals("Quadratic Equation Format Error", equationTest.result());
	}
	
	@Test
	public void testNoRoot() {
		QuadraticEquation equationTest = new QuadraticEquation(2, 2, 1);
		assertEquals("Quadratic Equation has no root", equationTest.result());
	}
	
	@Test
	public void testDoubleRoot() {
		QuadraticEquation equationTest = new QuadraticEquation(1, 2, 1);
		assertEquals("Quadratic Equation has one double root: x1 = x2 = -1.00", equationTest.result());
	}
	
	@Test
	public void testDistinctRoots() {
		QuadraticEquation equationTest = new QuadraticEquation(1, -4, 3);
		assertEquals("Quadratic Equation has two distinct roots: x1 = 3.00, x2 = 1.00", equationTest.result());
	}
}
