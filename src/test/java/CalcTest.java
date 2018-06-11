import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import demo.Calc;

public class CalcTest {
	private Calc c1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c1=new Calc();
	}

	@After
	public void tearDown() throws Exception {
		c1=null;
	}

	@Test
	public void testAdd() {
		int i =c1.add(10, 20);
		assertTrue("add with 10, 20",i==30);
	}

	@Test
	public void testDivde() {
		int i =c1.divide("100", "20");
		assertTrue("add with 100,20",i==5);}

	@Test
	public void testDivdebyzero() {
		try {
			int i=c1.divide("100", "0");
		}
		catch (ArithmeticException e) {
			assertTrue("divide by zero",true);
		}
		
	}
	
	@Test
	public void testDivdeNonNumeric() {
		try {
			int i=c1.divide("1A0", "0");
		}
		catch (NumberFormatException e) {
			assertTrue("Number Format Exception",true);
		}	
	}

}
