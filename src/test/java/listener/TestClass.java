package listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.listenerImp.class)
public class TestClass extends BaseClass1{
	@Test
	public void test0() {
		System.out.println("@Test");
		Assert.fail();
		
	}
	
	
	@Test(dependsOnMethods = "test0")
	
	public void test1() {
		System.out.println("@Test - test1");
		
	}
	

}

