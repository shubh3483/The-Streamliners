package Task2.Model;

public class GroceryCartItem extends GroceryItem {

    float quantity;
    float price;

    public GroceryCartItem(String name, float pricePerKg) {
        super(name, pricePerKg);
            /*this.quantity = quantity;
            this.price = price;*/
    }

    public static float extractQuantity(String quantityStr){
        String [] newString = quantityStr.split(" ");
        newString[0] = newString[0].replace("Kg","");
        newString[1] = newString[1].replace("g","");
        /*for (String s: newString) {
             s.replace("Kg","");
             s.replace("g","");
        }*/
        float totalPrice;
        float temp1 = Float.parseFloat(newString[0]);
        float temp2 = Float.parseFloat(newString[1])/1000;
        /*for (String s: newString) {
            totalQuantity+= Integer.parseInt(s);
        }*/
        totalPrice = temp1+temp2;
        return totalPrice;
    }

    public static GroceryCartItem createNew(GroceryItem item, String quantityStr){
        GroceryCartItem cartItem = new GroceryCartItem(item.name,item.pricePerKg);
        cartItem.quantity = extractQuantity(quantityStr);
        cartItem.price = cartItem.pricePerKg * cartItem.quantity;
        return cartItem;
    }

    @Override
    public String toString() {
        return "";
    }
}
