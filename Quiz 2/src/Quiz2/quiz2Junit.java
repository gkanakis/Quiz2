package Quiz2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class quiz2Junit {

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
	public void test() {
		quiz2 test1 = new quiz2(12520, 0.12, 0.04, 25);
		assertTrue(test1.totalTuitionCost() == 62230.67);
		quiz2 test2 = new quiz2( 25400, 0.32, 0.4, 55);
		assertTrue(test2.totalTuitionCost() == 226245.80);
		quiz2 test3 = new quiz2(10000, 0.15, 0.35, 15);
		assertTrue(test3.totalTuitionCost() == 67410);
		quiz2 test4 = new quiz2(12345, 0.12, .34, 59 );
		assertTrue(test4.totalTuitionCost() == 79061.07);
	}

}
