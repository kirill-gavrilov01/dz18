class SimpleProduct extends Product {
    @Override
    public double calculateFinalPrice() {
        return 0;
    }

    public SimpleProduct(String name, double price) {
        super(String.valueOf(Boolean.parseBoolean(name)), price);
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }

    private String getPrice() {
        return "";
    }

    private String getName() {
        return "";
    }

    // Здесь нет смысла делать метод getPrice абстрактным,
    // поскольку цена доступна через родительский класс

}
