import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MidTermTests {
	@Test
	void test1() {
		Product product1 = new Product ("Batman Comic","Books", "A Comic book about Batman!", 19.99);
		assertEquals("Batman Comic", product1.getName());
		assertEquals("Books", product1.getCategory());
		assertEquals("A Comic book about Batman!", product1.getDescription());
		assertEquals("" + 19.99, "" + product1.getPrice());
	}
	
	@Test
	void test2() {
		CashPayment payment = new CashPayment(10, 12);		
		assertEquals("" + 12, "" + payment.getAmountTendered());
	}
	
	@Test
	void test3() {
		CashPayment payment = new CashPayment(5.00, 7.00);		
		payment.setAmount(4.00);
		assertEquals("" + 4.00, "" + payment.getAmount());
	}
	
	@Test
	void test4() {
		CashPayment payment = new CashPayment(4.00, 5.00);		
		payment.setTaxRate(7.00);
		assertEquals("" + 7.00, "" + payment.getTaxRate());
	}
	
	@Test
	void test5() {
		CreditPayment payment = new CreditPayment(36.00, "4387653778773", "10/12/2023", 123);		
		payment.setCvv(456);
		assertEquals(456, payment.getCvv());
	}
	
	@Test
	void test6() {
		CheckPayment payment = new CheckPayment(100.00, "153");		
		payment.setCheckNumber("987");;
		assertEquals("" + 100, "" + payment.getAmount());
		assertEquals("987", payment.getCheckNumber());
	}
	
}
