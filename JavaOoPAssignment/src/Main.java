import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        HardwareStore hardwareStore = new HardwareStore();

//        adding products to the hardware
        Product product1 = new Product("Cement", 36000, "image.jpg");
        Product product2 = new Product("Iron bars", 120000, "image1.png" );
        Product product3 = new Product("Nails", 3000, "image2.jpg");
        Product product4 = new Product("Wheel barrow", 150000, "image.png");
        //23-9-11-11-8-9, 23-11-1-5-36-34)}

        hardwareStore.addProduct(product1);
        hardwareStore.addProduct(product2);
        hardwareStore.addProduct(product3);
        hardwareStore.addProduct(product4);



//        hardwareStore.setName(1, product1("Wheelbarrow"));
        System.out.println("Number of products: " + hardwareStore.getProducts().size());
        System.out.println("Products:");
        System.out.println(product1.getName()+ " costs " +product1.getPrice());
        System.out.println(product2.getName() +" costs " +product2.getPrice());
        System.out.println(product3.getName() +" costs " +product3.getPrice());
        System.out.println(product4.getName() +" costs " +product4.getPrice());

//        after removing a product from the hardware
        hardwareStore.removeProduct(product2);

        System.out.println("Number of products: " + hardwareStore.getProducts().size());


    }
}