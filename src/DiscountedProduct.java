// Класс товара со скидкой
class DiscountProduct extends Product {
    private double discountPercent; // Процент скидки

    public DiscountProduct(String isSpecial, double basePrice, double discountPercent) {
        super(isSpecial, basePrice);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 - discountPercent / 100); // Рассчитываем цену с учетом скидки
    }
}




