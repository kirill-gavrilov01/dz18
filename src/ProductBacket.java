import java.util.ArrayList;


public class ProductBacket {
    ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void printBasket() {
        System.out.println("Корзина:");
        for (Product p : products) {
            System.out.println(p.toString()); // Выводим товары
        }

        int specialCount = countSpecialProducts();
        double totalCost = calculateTotalCost();

        System.out.println("\\nИтого: " + totalCost);
        System.out.println("Специальных товаров: " + specialCount);
    }

    private int countSpecialProducts() {
        int count = 0;
        for (Product p : products)
            if (p.isSpecial()) count++; // Здесь no instanceof!
        return count;
    }

    private double calculateTotalCost() {
        double sum = 0;
        for (Product p : products)
            sum += p.calculateFinalPrice(); // Используем метод расчета цены конкретного продукта
        return sum;
    }
}

