import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String s;

        System.out.print("Masukkan String : ");
        s  = input.nextLine();
        
        String[] arrayofStrings = s.split("[\\s.;!,?_'@]"); 
        System.out.println(arrayofStrings.length);

        for (String j : arrayofStrings) {
            System.out.println(j);
        }
    }
}
