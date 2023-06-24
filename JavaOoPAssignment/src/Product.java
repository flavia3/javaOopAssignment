import java.time.LocalDateTime;
public class Product {
    private String name;
    private int stock = 0;
    private double price;
    private String image;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Product(String name, double price, String image)// LocalDateTime createdAt, LocalDateTime updatedAt) {
    {
    this.name = name;
        this.price = price;
        this.image = image;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
    }

//    public Product(String cement, int price, String image) {
//    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setStock(int stockValue) {
        this.stock += stockValue;
    }
    public int getStock() {
        return stock;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getImage() {
        return image;
    }
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//    public  void  setUpdatedAt(LocalDateTime updatedAt){
//        this.updatedAt = updatedAt;
//    }
//    public LocalDateTime getUpdatedAt() {
//        return updatedAt;
//    }
}

