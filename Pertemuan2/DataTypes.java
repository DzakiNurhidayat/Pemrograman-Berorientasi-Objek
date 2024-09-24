import java.util.Scanner;

public class DataTypes {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String input;
        for (int i = 1; i <= 6; i++) {
            System.out.print("\nMasukkan Angka : ");
            input = scan.nextLine();
            
            try {
                long angka = Long.parseLong(input);

                if (angka >= Byte.MIN_VALUE && angka <= Byte.MAX_VALUE) {
                    System.out.print("\n" + angka + " can be fitted in: \n * byte\n * short\n * int\n * long ");
                }
                else if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE) {
                    System.out.print("\n" + angka + " can be fitted in: \n * short\n * int\n * long ");
                }
                else if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
                    System.out.print("\n" + angka + " can be fitted in: \n * int\n * long ");
                }
                else if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
                    System.out.print("\n" + angka + " can be fitted in: \n * long ");
                }
            } catch (NumberFormatException e) {
                System.out.print(" can’t be fitted anywhere");
            }
        }
    }
}
