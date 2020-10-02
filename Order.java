
/**
 * @author (Kis Boisen Hansen - FEN) 
 * @version (2010.09.23 - 2019.09.17)
 */

import java.util.ArrayList;
public class Order{
    // instance variables 
    private int number;
    private String orderDate;
    private String delivery;
    private String payDate;
    private boolean status;
    private ArrayList<OrderLine> orderLines;

    public Order(int newNr, String dato, String newDelivery){
        number = newNr;
        orderDate = dato;
        delivery = newDelivery;
        status = false;
        orderLines = new ArrayList<>();
    }
    
    public void addOrderLine(OrderLine newLine){
        orderLines.add(newLine);

    }
    
    public void printInfo(){
        System.out.println("Orderno: " + number);
        System.out.println("Order date: " + orderDate);
        System.out.println("Delivery: " + delivery);
        for(OrderLine line : orderLines){
            line.printInfo();
        }
        System.out.println("I alt: " + totalPrice());
    }
        
    public void printFirstLargePrice(double searchPrice){
        int index = 0;
        boolean found = false;
        while(!found && index < orderLines.size()){
            OrderLine line = orderLines.get(index);
            if(line.orderLinePrice()>=searchPrice){
                found= true;
            }
            else{
                index++;
            }
        }
        if(found){
            orderLines.get(index).printInfo();
        }
        else{
            System.out.println("Nothing found!");
        }
    }
                  
    public double totalPrice(){
        double sum= 0;
        for(OrderLine line : orderLines){
            sum = sum + line.orderLinePrice();
        }
        return sum;
    }
    
    public int getNumber() {
        return number;
    }
}
