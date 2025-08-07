public class Main {
    public static void main(String[] args) {
        ProductBacket basket = new ProductBacket();

                // Добавляем разные типы товаров
                basket.add(new SimpleProduct("Хлеб", 50) {
                    @Override
                    public double getPrice() {
                        return 0;
                    }
                });
                basket.add(new DiscountProduct("Молоко", 100, 10) {
                    @Override
                    public double getPrice() {
                        return 0;
                    }
                }); // Молоко со скидкой 10%
                basket.add(new FixPriceProduct("Колбаса", 200) {
                    @Override
                    public double getPrice() {
                        return 0;
                    }
                });   // Колбаса с фиксированной ценой

                // Печать корзины
                basket.printBasket();
            }
        }

