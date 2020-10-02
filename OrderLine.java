
/**
 * @author (FEN) 
 * @version (2019.09.17)
 */
public class OrderLine{
    private int amount;
    private Product product;// is connected to one product

    public OrderLine(int newAmount, Product newProduct){
       amount = newAmount;
       product = newProduct;
    }
    
    public void printInfo(){
        if(product != null){
            product.printInfo();
        }
        System.out.println("Amount: " + amount);
    }
    
    public double orderLinePrice(){
        return amount*product.getPrice();
    }
}
