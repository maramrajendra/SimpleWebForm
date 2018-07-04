package com;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AppTest.class, //test case 1
        App2Test.class,     //test case 2
        App2Test.class,
        App2Test2.class
})
public class SuiteTest {
	//normally, this is an empty class
}
