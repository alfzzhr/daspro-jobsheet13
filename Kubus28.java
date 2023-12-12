import java.util.Scanner;
public class Kubus28{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisiKubus = scanner.nextDouble();

        double volume = hitungVolume(sisiKubus);
        System.out.println("Volume Kubus dengan sisi " + sisiKubus + " adalah: " + volume);

        double luasPermukaan = hitungLuasPermukaan(sisiKubus);
        System.out.println("Luas Permukaan Kubus dengan sisi " + sisiKubus + " adalah: " + luasPermukaan);
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }
}