
import java.util.Scanner;

public class seleksiDuta {
    public static void main(String[] args) {
        String nama, kelas, perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Nama: ");
        nama = s.nextLine();
        System.out.println("Masukkan Kelas: ");
        kelas= s.next();
        if(kelas.equalsIgnoreCase("X")|| kelas.equalsIgnoreCase("XI")){
            System.out.println("Perilaku Baik/Cukup?");
            perilaku = s.next();
            if(perilaku.equalsIgnoreCase("Baik")){
                System.out.println("Masukkan Nilai rata-rata!");
                nilai = s.nextInt();
                if(nilai <=90){
                    System.out.println("lolos");
                }else{
                    System.out.println("gagal");
                }
            }else{
                System.out.println("Maaf, persyaratan anda tak terpenuhi :(");
            }
        }else{
            System.out.println("Maaf, persyaratan anda tak terpenuhi :(");
        }
    }
}
