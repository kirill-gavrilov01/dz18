class SimpleProduct extends Product {
    public SimpleProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean isSpecial() { return false; }

    @Override
    public String toString() {
        return name + ": " + price;
    }
}