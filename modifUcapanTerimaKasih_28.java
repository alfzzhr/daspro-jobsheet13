import java.util.Scanner;

public class modifUcapanTerimaKasih_28 {
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
        
        // Panggil UcapanTambahan dengan parameter
        UcapanTambahan("Jangan lupa traktir bakso!");
    }

    // Fungsi UcapanTambahan dengan parameter String
    public static void UcapanTambahan(String tambahan) {
        System.out.println("Tambahan: " + tambahan);
    }
}
