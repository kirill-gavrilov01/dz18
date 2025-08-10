// Общий интерфейс или абстрактный класс для всех продуктов
abstract class Product {
    protected String isSpecial; // признак специального товара
    protected double basePrice;  // исходная цена товара

    public Product(String isSpecial, double basePrice) {
        this.isSpecial = isSpecial;
        this.basePrice = basePrice;
    }


    // Определение, является ли товар специальным
    public boolean isSpecial() {
        return Boolean.parseBoolean(isSpecial);
    }

    // Абстрактный метод для расчета итоговой цены продукта
    public abstract double calculateFinalPrice();

    // Переопределяемый метод toString()
    @Override
    public String toString() {
        return "Цена: " + calculateFinalPrice() + ", Специальный: " + isSpecial;
    }
}







