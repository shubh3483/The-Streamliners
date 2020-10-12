package Task2.Controller;

import Task2.Model.Cart;
import Task2.Model.GroceryCartItem;
import Task2.Model.GroceryItem;

public class Main {
    public static void main(String[] args) {
        GroceryItem groceryItem1 = new GroceryItem("Rice",70);
        GroceryItem groceryItem2 = new GroceryItem("Wheat",60);
        GroceryItem groceryItem3 = new GroceryItem("Milk",35.5f);
        GroceryItem groceryItem4 = new GroceryItem("Mango",100);

        Cart cart = new Cart();
         cart.add(GroceryCartItem.createNew(groceryItem1, "5Kg 0g"))
                .add(GroceryCartItem.createNew(groceryItem2, "5Kg 500g"))
                .add(GroceryCartItem.createNew(groceryItem3, "3Kg 0g"))
                .add(GroceryCartItem.createNew(groceryItem4, "2Kg 500g"));

        System.out.println(cart);
    }
}
