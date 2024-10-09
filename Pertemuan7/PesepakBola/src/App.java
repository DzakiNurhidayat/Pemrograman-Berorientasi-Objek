import com.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Membuat beberapa objek pesepakbola
        Forward forward = new Forward("Lewandowski", 32, 9, 30);
        midfielder midfielder = new midfielder("Reus", 31, 10, 15);
        Goalkeeper goalkeeper = new Goalkeeper("Kobel", 24, 1, 10);

        // Latihan
        System.out.println("Latihan dimulai:");
        forward.train();
        midfielder.train();
        goalkeeper.train();

        System.out.println("\nPertandingan dimulai:");

        // Bermain
        forward.play();
        midfielder.play();
        goalkeeper.play();

        // Penyerang mencetak Gol
        System.out.println("\nAksi Penyerang:");
        forward.penalty();
        forward.tapIn();
        forward.bicycleKick();

        // Statistik Akhir Laga
        System.out.println("\nStatistik setelah pertandingan:");
        forward.displayPlayerInfo();
        System.out.println("Gol Dicetak: " + forward.getGolDicetak());

        midfielder.displayPlayerInfo();
        System.out.println("Assist Diberikan: " + midfielder.getAssistDiberikan());

        goalkeeper.displayPlayerInfo();
        System.out.println("Clean Sheat Dicatatkan: " + goalkeeper.getCleanSheatDicatatkan());
    }
}
