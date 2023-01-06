
public class MidTermTests {
	@Test
	void test1() {
		Product product1 = new Product ("Batman Comic","Books", "A Comic book about Batman!", 19.99);
		AssertEquals("Batman Comic", product1.getName());
		AssertEquals("Books", product1.getCategory());
		AssertEquals("A Comic book about Batman!", product1.getDescription());
		AssertEquals(19.99, product1.getPrice());
	}
}
