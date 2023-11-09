package crossbrowserparallel;

public class SwiggyTest {

	public class GoogleTest extends BaseClass{
		public void test() throws InterruptedException {
			driver.get("https://swiggy.com/");
			Thread.sleep(3000);
		}
	}
}
