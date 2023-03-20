public class ProductController {

    private ProductServices services;

    ProductController() {
        this.services = new ProductServices();
    }

    public void addProduct(String name, String manufacturer, double price) {
        this.services.addProduct(name, manufacturer, price);
    }
}
