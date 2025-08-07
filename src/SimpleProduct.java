abstract class SimpleProduct extends Product {
    public SimpleProduct(String name, double price) {
        super();
        this.name = name;
        this.fixedPrice = price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        return name + ": " + fixedPrice;
    }
}

