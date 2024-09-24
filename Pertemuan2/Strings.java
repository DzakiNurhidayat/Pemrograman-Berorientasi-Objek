import java.util.Scanner;

class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String teks1, teks2, lexicograph;
        int jumlahTeks;

        System.out.print("Masukkan Teks 1 : ");
        teks1 = scan.nextLine();
        System.out.print("Masukkan Teks 2 : ");
        teks2 = scan.nextLine();

        jumlahTeks = teks1.length() + teks2.length();
        if (teks1.compareTo(teks2) > 0) {
            lexicograph = "Yes";
        } else {
            lexicograph = "no";
        }

        String gabung = teks1 + " " + teks2;
        
        String teksAkhir = gabung.substring(0, 1).toUpperCase() + gabung.substring(1, 6) +
                        gabung.substring(6, 7).toUpperCase() + gabung.substring(7);

        System.out.println(jumlahTeks);
        System.out.println(lexicograph);
        System.out.println(teksAkhir);
    }
}
