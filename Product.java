
/**
 * @author (Kis Boisen Hansen - FEN) 
 * @version (2010.09.23 - 2019.09.17)
 */
public class Product{
    private int id;
    private String description;
    private double price;
    private int amountOnStock;

    public Product(int newId, String newDescription, double newPrice, int newStock){
        id = newId;
        description = newDescription;
        price = newPrice;
        amountOnStock = newStock; 
    }
    
    public double getPrice(){
        return price;
    }
    
    public void printInfo(){
        System.out.println("Id: " + id);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
    }
    
}
