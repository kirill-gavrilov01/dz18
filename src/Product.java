
public abstract class Product {
    protected int discountPercentage;
    protected double fixedPrice;
    protected String name;

    public Product(String name, double fixedPrice, int discountPercentage) {
        this.name = name;
        this.fixedPrice = fixedPrice;
        this.discountPercentage = discountPercentage;
    }

    public Product(String name, double price, double fixedPrice, int discountPercentage) {
        this.fixedPrice = fixedPrice;
        this.discountPercentage = discountPercentage;
    }

    public Product(double fixedPrice, int discountPercentage) {

        this.fixedPrice = fixedPrice;
        this.discountPercentage = discountPercentage;
    }

    public Product(String name, double price) {
    }

    public Product() {

    }

    public abstract double getPrice(); // теперь метод абстрактный

    public abstract boolean isSpecial();
}



        


