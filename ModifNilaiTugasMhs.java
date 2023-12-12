import java.util.Scanner;

public class ModifNilaiTugasMhs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari user untuk jumlah mahasiswa dan jumlah tugas
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        // Membuat array 2 dimensi untuk menyimpan nilai tugas mahasiswa
        int[][] nilaiTugas = new int[jumlahMahasiswa][jumlahTugas];

        // Membuat array untuk menyimpan nama mahasiswa
        String[] mahasiswa = new String[jumlahMahasiswa];

        // Meminta input nama mahasiswa dari user
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            mahasiswa[i] = scanner.next();
        }

        // Fungsi a: Meninputkan data nilai mahasiswa
        inputNilaiTugas(mahasiswa, nilaiTugas, scanner);

        // Fungsi b: Menampilkan seluruh nilai mahasiswa
        tampilkanSeluruhNilai(mahasiswa, nilaiTugas);

        // Fungsi c: Mencari hari keberapakah terdapat nilai tertinggi dibanding hari lain
        int hariTertinggi = cariHariTertinggi(nilaiTugas);
        System.out.println("Nilai tertinggi terdapat pada hari ke-" + hariTertinggi);

        // Fungsi d: Menampilkan mahasiswa yang memiliki nilai tertinggi
        tampilkanMahasiswaTertinggi(mahasiswa, nilaiTugas, hariTertinggi);

        // Menutup scanner setelah selesai
        scanner.close();
    }

    // Fungsi a: Meninputkan data nilai mahasiswa
    public static void inputNilaiTugas(String[] mahasiswa, int[][] nilaiTugas, Scanner scanner) {
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan nilai tugas untuk " + mahasiswa[i] + ":");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print("Minggu ke " + (j + 1) + ": ");
                nilaiTugas[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi b: Menampilkan seluruh nilai mahasiswa
    public static void tampilkanSeluruhNilai(String[] mahasiswa, int[][] nilaiTugas) {
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.print("          ");
        for (int i = 0; i < nilaiTugas[0].length; i++) {
            System.out.printf("%-15s", "Minggu ke " + (i + 1));
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------");

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.printf("%-10s", mahasiswa[i]);
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.printf("%-12d", nilaiTugas[i][j]);
            }
            System.out.println();
        }
    }

    // Fungsi c: Mencari hari keberapakah terdapat nilai tertinggi dibanding hari lain
    public static int cariHariTertinggi(int[][] nilaiTugas) {
        int hariTertinggi = 0;
        int nilaiTertinggi = nilaiTugas[0][0];

        for (int j = 1; j < nilaiTugas[0].length; j++) {
            int totalNilaiHari = 0;
            for (int i = 0; i < nilaiTugas.length; i++) {
                totalNilaiHari += nilaiTugas[i][j];
            }

            if (totalNilaiHari > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHari;
                hariTertinggi = j + 1;
            }
        }

        return hariTertinggi;
    }

    // Fungsi d: Menampilkan mahasiswa yang memiliki nilai tertinggi
    public static void tampilkanMahasiswaTertinggi(String[] mahasiswa, int[][] nilaiTugas, int hariTertinggi) {
        System.out.println("\nMahasiswa dengan nilai tertinggi pada hari ke-" + hariTertinggi + ":");
        int indeksMahasiswaTertinggi = 0;
        int nilaiTertinggi = nilaiTugas[0][hariTertinggi - 1];

        for (int i = 1; i < mahasiswa.length; i++) {
            if (nilaiTugas[i][hariTertinggi - 1] > nilaiTertinggi) {
                nilaiTertinggi = nilaiTugas[i][hariTertinggi - 1];
                indeksMahasiswaTertinggi = i;
            }
        }

        System.out.println(mahasiswa[indeksMahasiswaTertinggi] + " dengan nilai " + nilaiTertinggi + " pada minggu ke-" + hariTertinggi);
    }
}
