import java.util.stream.Gatherer.Integrator;

public class GenericsMethods {

    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]){
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Java");
        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Java");

        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
        // Mencoba Mengecek Untuk Tipe Data String
        isEqual = GenericsMethods.isEqual(g1, g2);

        System.out.println(isEqual);

        GenericsType<Integer> h1 = new GenericsType<>();
        h1.set(12);
        GenericsType<Integer> h2 = new GenericsType<>();
        h2.set(10);

        boolean isEqualInt = GenericsMethods.<Integer>isEqual(h1, h2);
        // Mencoba Mengecek Untuk Tipe Data Int
        isEqualInt = GenericsMethods.isEqual(h1, h2);

        System.out.println(isEqualInt);

        /*This feature, known as type inference, allows you to invoke
        a generic method as an ordinary method, without specifying a type
        between angle brackets */
        //Compiler will infer the type that is needed
    }
}