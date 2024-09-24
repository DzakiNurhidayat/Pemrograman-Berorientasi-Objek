import com.jadwalKuliah.*;

public class App {
    public static void main(String[] args) {
        // Data Mahasiswa
        Mahasiswa[] mahasiswaList = new Mahasiswa[10];
        mahasiswaList[0] = new Mahasiswa("Dzaki", "231511083");
        mahasiswaList[1] = new Mahasiswa("Fauzan", "231511076");
        mahasiswaList[2] = new Mahasiswa("Hafiz", "231511077");
        mahasiswaList[3] = new Mahasiswa("Restu", "231511088");
        mahasiswaList[4] = new Mahasiswa("Elsa",  "231511071");
        mahasiswaList[5] = new Mahasiswa("Aulia", "231511068");
        mahasiswaList[6] = new Mahasiswa("Yanto",  "231511081");
        mahasiswaList[7] = new Mahasiswa("Jupri", "231511084");
        mahasiswaList[8] = new Mahasiswa("Wildan", "231511085");
        mahasiswaList[9] = new Mahasiswa("Afriza", "231511066");

        // Menampilkan Data Mahasiswa
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) {
            mhs.display();
            
        }

        System.out.println();

        // Data Dosen
        Dosen[] dosenList = new Dosen[10];
        dosenList[0] = new Dosen("Yudi Widhiyasana", "2345");
        dosenList[1] = new Dosen("Trisna Gelar A", "1233");
        dosenList[2] = new Dosen("Muhammad Rizqi S", "1231");
        dosenList[3] = new Dosen("Santi Sundari", "1230");
        dosenList[4] = new Dosen("Suprihanto", "1111");
        dosenList[5] = new Dosen("Yadhi Aditya P.", "1123");
        dosenList[6] = new Dosen("Ade Chandra Nugraha", "1192");
        dosenList[7] = new Dosen("Zulkifli Arsyad", "1873");
        dosenList[8] = new Dosen("Ade Hodijah", "1021");
        dosenList[9] = new Dosen("Irwan Setiawan", "1100");

        // Menampilkan Data Dosen
        System.out.println("Data Dosen:");
        for (Dosen dosen : dosenList) {
            dosen.display();
        }

        System.out.println();
        
        // Data MataKuliah
        MataKuliah[] mkList = new MataKuliah[6];
        mkList[0] = new MataKuliah("Pemrograman Berorientasi Objek", "21IF2011");
        mkList[1] = new MataKuliah("Komputer Grafik", "21IF2015");
        mkList[2] = new MataKuliah("Matematika Diskrit II", "21IF2010");
        mkList[3] = new MataKuliah("Basis Data", "21IF2012");
        mkList[4] = new MataKuliah("Pengantar Rekayasa Perangkat Lunak", "21IF2013");
        mkList[5] = new MataKuliah("Proyek 3:", "21IF2016");

        // Data Ruang
        Ruang[] ruangList = new Ruang[5];
        ruangList[0] = new Ruang("Ruang 101");
        ruangList[1] = new Ruang("Ruang 102");
        ruangList[2] = new Ruang("Ruang 103");
        ruangList[3] = new Ruang("Ruang 104");
        ruangList[4] = new Ruang("Ruang 105");

        // Jadwal Perkuliahan
        Jadwal[] jadwalList = {
            new Jadwal("Senin", "2024-09-30", 1, mkList[0], dosenList[0], ruangList[0]),
            new Jadwal("Senin", "2024-09-30", 2, mkList[1], dosenList[1], ruangList[1]),
            new Jadwal("Selasa", "2024-10-01", 1, mkList[2], dosenList[2], ruangList[2]),
            new Jadwal("Selasa", "2024-10-01", 2, mkList[3], dosenList[3], ruangList[3]),
            new Jadwal("Rabu", "2024-10-02", 1, mkList[4], dosenList[4], ruangList[4]),
            new Jadwal("Kamis", "2024-10-03", 1, mkList[2], dosenList[8], ruangList[4]),
            new Jadwal("Kamis", "2024-10-03", 2, mkList[0], dosenList[0], ruangList[0]),
            new Jadwal("Kamis", "2024-10-03", 3, mkList[1], dosenList[1], ruangList[1]),
            new Jadwal("Jumat", "2024-10-04", 1, mkList[2], dosenList[2], ruangList[2]),
            new Jadwal("Jumat", "2024-10-04", 2, mkList[3], dosenList[3], ruangList[3]),
            new Jadwal("Jumat", "2024-10-04", 3, mkList[4], dosenList[4], ruangList[4]),
            new Jadwal("Jumat", "2024-10-04", 4, mkList[5], dosenList[5], ruangList[0]),
        };

        // Menampilkan Jadwal
        System.out.println("Jadwal Perkuliahan:");
        for (Jadwal jadwal : jadwalList) {
            jadwal.display();
            System.out.println();
        }
    }
}
