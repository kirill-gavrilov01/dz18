class FixPriceProduct extends Product {
    private double fixedPrice;

    public FixPriceProduct(String name, double fixedPrice) {
        super(name, fixedPrice); // Используем цену как фиксированную
        this.fixedPrice = fixedPrice;
    }

    @Override
    public boolean isSpecial() { return true; }

    @Override
    public String toString() {
        return name + ": Фиксированная цена " + fixedPrice;
    }
}

