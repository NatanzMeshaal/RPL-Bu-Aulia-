
import java.util.Scanner;

public class soalA {
    public static void main(String[] args) {
        int nilai;
        String predikat, keterangan, nama;

        Scanner input = new Scanner(System.in);
        System.out.println("» Siapakah Nama Panggilan Anda?");
        nama = input.nextLine();
        System.out.println("» Berapakah Nilai Akhir yang Kamu Dapat?");
        nilai = input.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            predikat = "A";
            keterangan = "lulus";
        } else if(nilai >= 70 && nilai <= 84) {
            predikat = "B";
            keterangan = "lulus";
        } else if(nilai >= 50 && nilai <= 69) {
            predikat = "C";
            keterangan = "lulus";
        } else if(nilai >= 40 && nilai <=49) {
            predikat = "D";
            keterangan = "Tidak Lulus";
        } else if(nilai >= 0 && nilai <= 39) {
            predikat = "E";
            keterangan = "Tidak Lulus";
        } else {
            predikat = "Error";
            keterangan = "Error";
            System.out.println("℗ Mohon maaf, Terjadi kesalahan ℗");
        }
        
        System.out.println("------------------------------");
        System.out.println("| »Yayasan Pendidikan Telkom |");
        System.out.println("------------------------------");
        System.out.println("| Nama               : " +nama+ " |\n| Nilai yang didapat : " +nilai+ "    |\n| Predikat           : " +predikat+ "     |\n| Keterangan         : "+keterangan+  " |" );
        System.out.println("------------------------------");
    }
}