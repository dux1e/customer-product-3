
/**
 * @author (Kis Boisen Hansen - FEN) 
 * @version (2010.09.23 - 2019.09.17)
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Customer{
    private int number;
    private String name;
    private String address;
    private String phone;
    private ArrayList<Order> myOrders;

    public Customer(int newNr, String name, String newAddress, String newPhone){
        number = newNr;
        this.name= name;
        address = newAddress;
        phone = newPhone;
        myOrders = new ArrayList<>();
    }

    public void addOrder(Order newOrder){
        myOrders.add(newOrder);
    }

    public void printInfo(){
        System.out.println("Customer no. " + number);
        System.out.println("Customer name: " + name);
        System.out.println("Address " + address);
        System.out.println("Phoneno " + phone);
        for(Order order : myOrders){
            order.printInfo();
        }
    }

    public void printInfoWhile(){
        System.out.println("Customer no. " + number);
        System.out.println("Customer name: " + name);
        System.out.println("Address " + address);
        System.out.println("Phoneno " + phone);
        int i = 0;
        while(i < myOrders.size()) {
            Order order = myOrders.get(i);
            order.printInfo();
            i++;
        }
    }

    public Order findOrder(int number){
        Iterator<Order> it = myOrders.iterator();
        boolean found = false;
        Order order = null;
        while(!found && it.hasNext()) {
            order = it.next();
            if(order.getNumber() == number) {
                found = true;
            }
        }
        if(found) {
            return order;
        } else {
            return null;
        }
    }

    public Order findOrderTeacher(int number){
        boolean found = false;
        int i = 0;
        Order order = null;
        while(!found && i < myOrders.size()) {
            order = myOrders.get(i);
            if(order.getNumber() == number) {
                found = true;
            } else {
                i++;
            }
        }
        if(found) {
            return order;
        } else {
            return null;
        }
    }
    
    public Order getMaxTotalOrderClassicFor(){
        //PRE myOrders må ikke være tom
        int maxIndex = 0;
        Order order = myOrders.get(0);
        double maxTotal = order.totalPrice();
        for(int i = 0; i < myOrders.size(); i++) {
            order = myOrders.get(i);
            if(order.totalPrice() > maxTotal) {
                maxTotal = order.totalPrice();
                maxIndex = i;
            }
        }
        return order;
    }
    
    public Order getMaxTotalOrderWhile(){
        //PRE myOrders må ikke være tom
        int maxIndex = 0;
        Order order = myOrders.get(0);
        double maxTotal = order.totalPrice();
        int i = 0;
        while(i < myOrders.size()) {
            order = myOrders.get(i);
            if(order.totalPrice() > maxTotal) {
                maxTotal = order.totalPrice();
                maxIndex = i;
            } else {
                i++;
            }
        }
        return order;
    }

    public void printInfoClassicFor(){
        System.out.println("Customer no. " + number);
        System.out.println("Customer name: " + name);
        System.out.println("Address " + address);
        System.out.println("Phoneno " + phone);
        for(int i = 0; i < myOrders.size(); i++) {
            Order order = myOrders.get(i);
            order.printInfo();
        }
    }
}
