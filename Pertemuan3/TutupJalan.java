import java.util.Scanner;

public class TutupJalan {
    public static void main(String[] args) {
        String platNomor; 
        Long gabunganAngka, hasil;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan 4 Plat Nomor : ");
        platNomor  = input.nextLine();
        String[] arrayofStrings = platNomor.split("[\\s+]");
        String hasilGabung = "";
        for (String str : arrayofStrings) {
            hasilGabung += str;
        }
        gabunganAngka = Long.parseLong(hasilGabung);

        hasil = gabunganAngka - 999999;
        if (hasil % 5 != 0) {
            System.out.print("berhenti");
        }
        else {
            System.out.print("jalan");
        }
    }
}
