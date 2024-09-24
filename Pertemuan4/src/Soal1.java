import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Soal1 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 10000000, 7);
        Sales sales = new Sales(product);

        sales.sellProduct(5);
        sales.restockProduct(8);
        sales.updateProductPrice(-187227);
    }
}
