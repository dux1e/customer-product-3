

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
    private Product rødvin;
    private Product hvidvin;
    private Product mousserendeVin;
    private OrderLine orderLineRød;
    private OrderLine orderLineHvid;
    private OrderLine orderLineMousserende;
    private Order orderRød;
    private Order orderHvid;
    private Order orderMousserende;
    private Customer customerJoakim;

    
    
    
    
    
    
    
    


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
        rødvin = new Product(1, "Rødvin", 60, 5);
        hvidvin = new Product(2, "Hvidvin", 100, 5);
        mousserendeVin = new Product(3, "Mousserende Vin", 80, 5);
        orderLineRød = new OrderLine(1, rødvin);
        orderLineHvid = new OrderLine(3, hvidvin);
        orderLineMousserende = new OrderLine(2, mousserendeVin);
        orderRød = new Order(1, "01-10-2020", "01-10-2020");
        orderRød.addOrderLine(orderLineRød);
        orderHvid = new Order(2, "02-10-2020", "02-10-2020");
        orderHvid.addOrderLine(orderLineHvid);
        orderMousserende = new Order(3, "03-10-2020", "03-10-2020");
        orderMousserende.addOrderLine(orderLineMousserende);
        customerJoakim = new Customer(1, "Joakim", "Gade", "+45 11 22 33 44");
        customerJoakim.addOrder(orderRød);
        customerJoakim.addOrder(orderHvid);
        customerJoakim.addOrder(orderMousserende);
        customerJoakim.printInfo();
        customerJoakim.getMaxTotalOrderWhile();
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
