package tmall.bean;

/**
 * author totoro
 * create 2019/11/5
 **/
public class ProductImage {
    private String type;
    private Product product;
    private int id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
