package Task1.model;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product() {

    }
    @Override
    public String toString() {
        return String.format("Name : %s @ Rs. %d",this.name,this.price);
    }

}
