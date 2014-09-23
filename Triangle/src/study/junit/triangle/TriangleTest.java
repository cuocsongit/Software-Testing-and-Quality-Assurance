package study.junit.triangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * test1
	 */
	@Test
	public void testIsTriangle() {
		Triangle triangle = new Triangle(1, 2, 1);
		assertEquals("Khong phai tam giac", triangle.result());
	}
	/**
	 * test2
	 */
	@Test
	public void testTriangle2() {
		Triangle triangle = new Triangle(-1, 2, 1);
		assertEquals("Khong phai tam giac", triangle.result());
	}
	/**
	 * test3
	 */
	@Test
	public void testGetResult3() {
		Triangle triangle = new Triangle(2, 2, 2);
		assertEquals("Tam giac deu", triangle.result());
	}
	/**
	 * test4
	 */
	@Test
	public void testGetResult4() {
		Triangle triangle = new Triangle(3, 4, 5);
		assertEquals("Tam giac vuong", triangle.result());
	}
	/**
	 * test5
	 */
	@Test
	public void testGetResult5() {
		Triangle triangle = new Triangle(2, 3, 4);
		assertEquals( "Tam giac thuong", triangle.result());
	}
	

}
