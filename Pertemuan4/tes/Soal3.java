package tes;

import com.polban.jtk.sales.*;

public class Soal3 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 10000000, 7);
        Sales sales = new Sales(product);

        sales.sellProduct(5);
        sales.restockProduct(8);
        sales.updateProductPrice(-187227);
    }
}
