import java.util.Scanner;

public class Berhitung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operasi;
        System.out.print("A Operator B\n");
        operasi  = input.nextLine();

        String[] arrayofStrings = operasi.split("[\\s]");
        int a = Integer.parseInt(arrayofStrings[0]);
        int b = Integer.parseInt(arrayofStrings[2]);
        String operator =  arrayofStrings[1];

        if (a < 1 || a > 1000 || b < 1 || b > 1000) {
            System.out.print("Angka Diluar Jangkauan Program");
            return;
        }

        if (operator == "+" && operator == "-" && operator == "*" && operator == "/" && operator == "%") {
            System.out.print("Operator Tidak Sahih");
            return;
        }
        switch (operator) {
            case "+":
                System.out.print(a + b);
                break;
            
            case "-":
                System.out.print(a - b);
                break;

            case "*":
                System.out.print(a * b);
                break;

            case "/":
                if (a % b == 0) {
                    System.out.print(a / b);
                }
                else {
                    System.out.print("A Tidak Habis Dibagi B");
                }
                break;

            case "%":
                System.out.print(a % b);
                break;

            default:
                System.out.print("Operator Tidak Sesuai");
                break;
        }
    }
}
