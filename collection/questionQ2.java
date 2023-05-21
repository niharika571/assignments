
//Write an application to store 10 unique product objects. In case there is an attempt to add a
//        duplicate product, it should be silently rejected. Hint: Use HasSet or TreeSet
//        Extra(optional): Use ArrayList in the above solution. (This is optional)


import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;

    // Constructor
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class CollectionsQ2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Add unique products to the ArrayList
        products.add(new Product(1, "Product 1"));
        products.add(new Product(2, "Product 2"));
        products.add(new Product(3, "Product 3"));
        products.add(new Product(4, "Product 4"));
        products.add(new Product(5, "Product 5"));
        products.add(new Product(6, "Product 6"));
        products.add(new Product(7, "Product 7"));
        products.add(new Product(8, "Product 8"));
        products.add(new Product(9, "Product 9"));
        products.add(new Product(10, "Product 10"));



        //  add a duplicate product
        Product duplicateProduct = new Product(1, "Product 1");
        boolean isDuplicate = false;

        for (Product product : products) {
            if (product.getId() == duplicateProduct.getId()) {
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate) {
            System.out.println("Duplicate product rejected: " + duplicateProduct.getName());
        } else {
            products.add(duplicateProduct);
            System.out.println("Duplicate product added: " + duplicateProduct.getName());
        }
    }
}
