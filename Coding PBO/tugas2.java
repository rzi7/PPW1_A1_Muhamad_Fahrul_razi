import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {

        // Membuat input 
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angak pertama : ");
        String angka1 = scan.nextLine();
        System.out.print("Masukkan angak kedua : ");
        String angka2 = scan.nextLine();

        // Mengubah input string menjadi integer
        int angkaPertama = Integer.parseInt(angka1);
        int angkaKedua = Integer.parseInt(angka2);

        // Mengecek angka genap atau ganjil
        if (angkaPertama % 2 == 0) {
            System.out.println(angkaPertama + " adalah bilangan genap");
        } else {
            System.out.println(angkaPertama + " adalah bilangan ganjil");
        }
        if (angkaKedua % 2 == 0) {
            System.out.println(angkaKedua + " adalah bilangan genap");
        } else {
            System.out.println(angkaKedua + " adalah bilangan ganjil");
        }

        // Mengecek angka positif atau negatif
        if (angkaPertama >= 0) {
            System.out.println(angkaPertama + " adalah bilangan positif");
        } else {
            System.out.println(angkaPertama + " adalah bilangan negatif");
        }
        if (angkaKedua >= 0) {
            System.out.println(angkaKedua + " adalah bilangan positif");
        } else {
            System.out.println(angkaKedua + " adalah bilangan negatif");
        }

        // Mengecek jumlah digit angka 
        System.out.println("Jumlah digit angka pertama :" + (angka1.length()));
        System.out.println("Jumlah digit angka pertama :" + (angka2.length()));
        

        // Selisih kedua angka yang selalu positif
        if (angkaPertama > angkaKedua) {
            System.out.println("Selisih kedua angak : " + (angkaPertama-angkaKedua));
        } else {
            System.out.println("Selisih kedua angka : " + (angkaKedua-angkaPertama));
        }
        scan.close();
    }
}
