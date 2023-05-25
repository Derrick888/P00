import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

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

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();
		int actual= cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual);
	}
	
	@Test
	public void testSubstract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testMultiple() {
		int a = 22;
		int b = 33;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 726;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testDivide() {
		int a = 33;
		int b = 11;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 3;
		assertEquals(expected,actual);
	}
	//test
	@Test
	public void testAdd2() {
		//fail("Not yet implemented");
		int a = 123;
		int b = 456;
		int c = 789;
		Calculator cal = new Calculator();
		int actual= cal.add(a, b, c);
		
		int expected = 1368;
		assertEquals (expected,actual);
	}

}
