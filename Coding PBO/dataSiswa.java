import java.util.Scanner;

public class dataSiswa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nama Siswa");
        String nama = scan.nextLine();
        System.out.println("Nilai Matematika");
        float mtk = scan.nextFloat();
        System.out.println("Nilai IPA");
        float ipa = scan.nextFloat();
        System.out.println("Nilai Bahasa Indonesia");
        float bind = scan.nextFloat();
        System.out.println("Nilai Bahasa Inggris");
        float bing = scan.nextFloat();

        float rata = (mtk + ipa + bind + bing) / 4;
        String ket = "";
        if (rata > 50) {
            ket = "lulus";
        } else {
            ket = "tidak lulus";
        }

        System.out.println(nama + " mendapatkan nilai rata rata sebesar " + rata + ", dan di nyatakan " + ket);
        scan.close();
    }
}
