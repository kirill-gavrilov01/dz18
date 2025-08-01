import java.util.ArrayList;

public class ProductBacket {
    ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void printBasket() {
        System.out.println("Корзина:");
        for (Product p : products) {
            System.out.println(p.toString());
        }

        int specialCount = countSpecialProducts();
        double totalCost = calculateTotalCost();

        System.out.println("\\nИтого: " + totalCost);
        System.out.println("Специальных товаров: " + specialCount);
    }

    private int countSpecialProducts() {
        int count = 0;
        for (Product p : products)
            if (p.isSpecial()) count++;
        return count;
    }

    private double calculateTotalCost() {
        double sum = 0;
        for (Product p : products)
            sum += p instanceof DiscountProduct ? ((DiscountProduct)p).price * (1 - ((DiscountProduct)p).price/100) :
                    p instanceof FixPriceProduct ? ((FixPriceProduct)p).fixesPrice : p.price;
        return sum;
    }
}
