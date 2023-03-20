import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    private Map<Integer, Product> products;

    ProductRepository() {
        this.products = new HashMap<>();
    }

    public void addProduct(String name, String manufacturer, double price) {
        Product product = new Product(name, manufacturer, price);
        int id = product.getId();
        this.products.put(id, product);
    }
}
