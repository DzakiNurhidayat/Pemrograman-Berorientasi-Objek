import java.util.Scanner;

public class GajiAgent {
    public static void main(String[] args) {
        double penjualan, gaji;
        double gajiPokok = 500000;
        double item = 50000;
        double bonus, hukuman;

        Scanner input = new Scanner(System.in);
        penjualan  = input.nextDouble();

        if (penjualan >= 80) {
            bonus = (item * penjualan) * 0.35;
            gaji = (item * penjualan) + bonus + gajiPokok;
        }
        else if (penjualan >= 40){
            bonus = (item * penjualan) * 0.25;
            gaji = bonus + gajiPokok;
        }
        else if (penjualan > 15) {
            bonus = (item * penjualan) * 0.10;
            gaji = bonus + gajiPokok;
        }
        else {
            hukuman = (item * (15 - penjualan)) * 0.15; 
            gaji = gajiPokok - hukuman;
        }
        System.out.print(gaji);
    }
}
