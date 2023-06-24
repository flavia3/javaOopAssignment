import java.util.ArrayList;

public class HardwareStore {
    private int id;
    private String name;
    private String contact;
    private String branch;
    private ArrayList <Product> products;

//    public HardwareStore(int id,String name,String contact, String branch) {

//        this.id = id;
//        this.name = name;
//        this.contact = contact;
//        this.branch = branch;
//    }

    public HardwareStore() {
        products = new ArrayList<Product>();
    }


    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }




    public ArrayList <Product> getProducts() {
        return products;
    }

}

