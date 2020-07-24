import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveM {
	Main remove;
	
	@Before
	public void setup()
	{
		remove=new Main();
	}
	
	    @Test
	    public void firstcharactersAA() 
	    {
		    assertEquals("CD",remove.Remove("AACD"));
	    }
		@Test
		public void Afirstcharacter() 
		{
			assertEquals("BCD",remove.Remove("ABCD"));	
		}
		@Test
		public void Afterposition2() 
		{
			assertEquals("CCBAA",remove.Remove("CCBAA"));
		}
		@Test
		public void Asecoundcharacter() 
		{
			assertEquals("BBA",remove.Remove("BABA"));
		}
		
		@Test
		public void threecharacters() 
		{
			assertEquals("B",remove.Remove("AAB"));
		}
		@Test
		public void twocharacters() 
		{
			assertEquals("NULL",remove.Remove("AA"));
		}
		@Test
		public void threecharacters1() 
		{
			assertEquals("BB",remove.Remove("ABB"));
		}
		
		
}