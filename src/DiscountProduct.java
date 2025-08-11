

public class DiscountProduct extends Product {
    private double discountPercent; // Процент скидки

    public DiscountProduct(String isSpecial, double basePrice, double discountPercent) {
        super(isSpecial, basePrice);
        this.discountPercent = discountPercent;
    }

    public DiscountProduct(String isSpecial, double basePrice) {
        super(isSpecial, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 - discountPercent / 100); // Итоговая цена с учётом скидки
    }
}



