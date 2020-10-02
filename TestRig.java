

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestRig.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestRig
{
    private Customer customer1;
    private Product product1;
    private Product product2;
    private Order order1;
    private OrderLine orderLin1;
    private OrderLine orderLin2;
    private Order order2;
    private OrderLine orderLin3;


    /**
     * Default constructor for test class TestRig
     */
    public TestRig()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        product1 = new Product(1, "Mælk", 10, 100);
        product2 = new Product(2, "Øl", 20, 200);
        order1 = new Order(1, "11-11-11", "mmm");
        orderLin1 = new OrderLine(2, product1);
        order1.addOrderLine(orderLin1);
        orderLin2 = new OrderLine(5, product2);
        order1.addOrderLine(orderLin2);
        order2 = new Order(3, "12345", "12345");
        orderLin3 = new OrderLine(100, product1);
        order2.addOrderLine(orderLin3);
        customer1 = new Customer(111, "Ib", "X-gade 12", "12345678");
        customer1.addOrder(order1);
        customer1.addOrder(order2);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
