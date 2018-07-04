package com;
import junit.framework.Assert;
import org.junit.Test;
public class App2Test {
	@Test
	public void testPrintHelloWorld() {
		System.out.println("In the Hello2World Method of test");
		Assert.assertEquals(App2.getHello2World(), "success");
		/*Assert.assertEquals("Raj","success"); error */
		/*Assert.assertEquals("success","success"); success */
		/* Assert.assertEquals("success1","success1"); success */


	}
}

