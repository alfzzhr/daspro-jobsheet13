import java.util.Scanner;
public class Percobaan6_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("Masukan panjang: ");
        p=input.nextInt();
        System.out.print("Masukan lebar: ");
        l=input.nextInt();
        System.out.print("Masukan tinggi: ");
        t=input.nextInt();

        L=p*l;
        System.out.println("Luas Persegi panjang adalah "+L);

        vol=p*l*t;
        System.out.println("Volume balok adalah "+ vol);
    }
    static int hitungLuas (int pjg, int lb){
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungLuas(a,b)*tinggi;
        return volume;
    }
}
