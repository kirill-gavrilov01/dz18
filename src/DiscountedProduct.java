
class DiscountProduct extends Product {
    private double discountPercentage;

    public DiscountProduct(String name, double price, double discountPercentage) {
        super(name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public boolean isSpecial() { return true; }

    @Override
    public String toString() {
        double discountedPrice = price * (1 - discountPercentage / 100);
        return name + ": " + discountedPrice + " (" + discountPercentage + "%)";
    }
}

