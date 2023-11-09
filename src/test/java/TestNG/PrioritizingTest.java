package TestNG;

import org.testng.annotations.Test;

public class PrioritizingTest {
	@Test
	public void demo() {
		System.out.println("no prioritize demo");
	}
	
	@Test(priority = -2)
	public void demo5() {
		System.out.println("demo5");
	}
	
	@Test(priority = -1)
	public void demo6() {
		System.out.println("demo6");
	}

}

