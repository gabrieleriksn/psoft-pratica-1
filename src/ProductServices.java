public class ProductServices {

    public ProductRepository repository;

    ProductServices() {
        this.repository= new ProductRepository();
    }

    public void addProduct(String name, String manufacturer, double price) {
        this.repository.addProduct(name, manufacturer, price);
    }
}
