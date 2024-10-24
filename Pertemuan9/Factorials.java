// ****************************************************************
// Factorials.java
// Reads integers from the user and prints the factorial of each.
//
// ****************************************************************
import java.util.Scanner;
import java.lang.Math;

public class Factorials extends RuntimeException{
    public static void main(String[] args){
    String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("y")){
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            try {
                if (val < 0) {
                    throw new IllegalArgumentException("Nilai Faktorial Tidak dapat bernilai minus");
                }
                else if (val > 16) {
                    throw new IllegalArgumentException("Nilai Faktorial diatas 16 tidak dapat dilakukan karena menggunakan int");
                }
                System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}