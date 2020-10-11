package Controller;

import model.Product;

public class SpecialProduct extends Product {
    public int regularPrice;
    public int percentageOff;

    public SpecialProduct(String name, int price) {
        super(name, price);
    }
    
    public static SpecialProduct applyOffOnProduct(Product product, int percentageOff){
        int discountedPrice = product.price - (product.price*percentageOff)/100;
        SpecialProduct specialProduct = new SpecialProduct(product.name,discountedPrice);
        specialProduct.regularPrice = product.price;
        specialProduct.percentageOff = percentageOff;
        return specialProduct;
    }
    @Override
    public String toString() {
        return "Product is :" + this.name+", its original price is "+this.regularPrice+" Rs.After applying discount of "+this.percentageOff+"% final amount to be paid is "+this.price+"Rs";
    }
}
