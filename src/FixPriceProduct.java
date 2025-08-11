// Класс обычного товара с фиксированной ценой
class FixPriceProduct extends Product {
    public FixPriceProduct(String isSpecial, double basePrice) {
        super(isSpecial, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice; // Просто возвращаем фиксированную цену
    }
}