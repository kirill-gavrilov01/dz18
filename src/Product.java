
abstract class Product {
    public double fixesPrice;
    public int discountPercentage;
    protected String name;
        protected double price;

    public Product(String name, double fixedPrice) {
    }

    Product() {
    }

    public abstract boolean isSpecial();
    }
