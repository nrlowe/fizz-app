package com.fizz.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;


public class AppTest 
{
    
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @SuppressWarnings("static-access")
	@Test
    public void testMain() throws IOException {
    	int[] result = new int[] {4, 3, 1, 2, 10};
    	App testClass = new App();
		assertEquals(result, testClass.fizzBuzz(20));
		
    }
}
