package com;
import junit.framework.Assert;
import org.junit.Test;
public class App2Test2 {
	@Test
	public void testPrintHelloWorld2() {
		System.out.println("In the Hello2World2 Method of test");
		Assert.assertEquals(App2.getHello2World2(), "success");
	}
}
