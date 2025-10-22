import java.util.Scanner;

public class Siakadfor07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0; // variabel tambahan untuk menghitung kelulusan

        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();

            
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            // minimal atau sama dengan 60
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        //output
        System.out.println("\nNilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah  = " + terendah);
        System.out.println("Jumlah mahasiswa lulus       = " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus = " + tidakLulus);

        sc.close();
    }
}
