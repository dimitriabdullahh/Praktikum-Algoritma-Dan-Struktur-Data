import java.util.Scanner;
   
public class Pemilihan1{
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM PERHITUNGAN NILAI AKHIR");
        System.out.println("-------------------------------");
        System.out.print("masukkan nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("masukkan nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("masukkan nilai UAS: ");
        int uas = sc.nextInt();
        float nilaiAkhir;
        String nilaiHuruf;
        nilaiAkhir = (float) ((0.2*tugas)+(0.35*uts)+(0.45*uas));
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        if(nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("SELAMAT ANDA LULUS");
        } else if(nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            System.out.println("NILAI HURUF: " + nilaiHuruf);
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            System.out.println("NILAI HURUF: " + nilaiHuruf);
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            System.out.println("NILAI HURUF: " + nilaiHuruf);
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            System.out.println("NILAI HURUF: " + nilaiHuruf);
            System.out.println("MAAF ANDA TIDAK LULUS");
        } else if (nilaiAkhir > 0 && nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            System.out.println("NILAI HURUF: " + nilaiHuruf);
            System.out.println("MAAF ANDA TIDAK LULUS");
    
        }
    }
}