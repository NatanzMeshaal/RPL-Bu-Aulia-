
import java.util.Scanner;

public class seleksiKelas {
    public static void main(String[] args) {
        int pilihan;
        String kelas;

        Scanner s = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Masukkan Angka Untuk Pemilihan kelas!");
        System.out.println(("1. XRPL1\n2. XRPL2\n3. XRPL3\n4. XRPL4\n5. XRPL5"));
        System.out.println(" Note : Input angka 1 - 5 !!!");
        System.out.println("===============================");
        pilihan = s.nextInt();

        switch (pilihan) {
            case 1:
                kelas= "XRPL1";
                break;
            case 2:
                kelas= "XRPL2";
                break;
            case 3:
                kelas= "XRPL3";
                break;
            case 4:
                kelas= "XRPL4";
                break;
            case 5:
                kelas= "XRPL5";
                break;
            default:
                throw new AssertionError();
                // kelas = "Kelas Tidak Terdaftar!";
        }
        System.out.println("===============================");
        System.out.println("Selamat Datang di kelas " +kelas+ "!!!");
    }
}
