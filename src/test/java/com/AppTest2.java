package com;
import junit.framework.Assert;
import org.junit.Test;
public class AppTest2 {
	@Test
	public void testPrintHelloWorld2() {
		System.out.println("In the HelloWorld2 Method of test");
		Assert.assertEquals(App.getHelloWorld2(), "success");
	}
}
