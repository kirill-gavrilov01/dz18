
abstract class DiscountProduct extends Product {
    private double discountPercentage;


    public DiscountProduct(String name, double price, double discountPercentage) {
        super(name, price);
        this.discountPercentage = discountPercentage;
    }

    public boolean isSpecial() { return true; }

    @Override
    public String toString() {
        double discountedPrice = fixedPrice * (1 - discountPercentage / 100);
        return name + ": " + discountedPrice + " (" + discountPercentage + "%)";
    }
}

