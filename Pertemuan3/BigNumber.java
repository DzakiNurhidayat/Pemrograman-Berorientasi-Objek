import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        BigInteger tambah = bigA.add(bigB);
        BigInteger kali = bigA.multiply(bigB);

        System.out.println(tambah);
        System.out.println(kali);
    }
}
