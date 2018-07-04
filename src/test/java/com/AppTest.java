package com;
import junit.framework.Assert;
import org.junit.Test;
public class AppTest {
	@Test
	public void testPrintHelloWorld() {
		System.out.println("In the HelloWorld Method of test");
		Assert.assertEquals(App.getHelloWorld(), "success");
		/*Assert.assertEquals("Raj","success"); error */
		/*Assert.assertEquals("success","success"); success */
		/* Assert.assertEquals("success1","success1"); success */


	}
}

