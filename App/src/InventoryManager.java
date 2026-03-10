import java.util.HashMap;

public class InventoryManager {

    HashMap<String,Integer> inventory = new HashMap<>();

    public void addItem(String product,int quantity){
        inventory.put(product,inventory.getOrDefault(product,0)+quantity);
    }

    public void purchase(String product){
        if(inventory.get(product)>0){
            inventory.put(product,inventory.get(product)-1);
            System.out.println("Purchase successful");
        }else{
            System.out.println("Out of stock");
        }
    }

    public static void main(String[] args){

        InventoryManager manager = new InventoryManager();

        manager.addItem("Laptop",5);
        manager.purchase("Laptop");

        System.out.println(manager.inventory);
    }
}
