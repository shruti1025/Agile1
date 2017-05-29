import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactTest {

	Maths m;
	@Before
	public void setUp() throws Exception {
		m=new Maths();
	}

	/*
	 * Fact user stories
	 * 
	 * 1. when the number is zero system should return one
	 * 2. when the number is one system should return one
	 * 3. when the number is positive system should return expected output
	 * 4. when the number is negative system should throw exception
	 */

	
	@Test
	public void whenTheNumberIsZeroSystemShouldReturnOne()
	{
		assertEquals(1, m.getFact(0));
	}
	
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void whenTheNumberIsNegativeSystemShouldThrowException()
	{
		m.getFact(-4);
	}
	
	@Test
	public void whenTheNumberIsOneSystemShouldReturnOne()
	{
		assertEquals(1, m.getFact(1));
	}
	
	@Test
	public void  whenTheNumberIsPositiveSystemShouldReturnExpectedOutput()
	{
		assertEquals(24, m.getFact(4));
}

}
