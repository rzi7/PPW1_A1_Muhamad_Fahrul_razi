import java.util.Scanner;

public class penjumlahan {
    public static void main(String[] args)
    {
        // Volume balok
        int pb, lb, tb, hasil;

        pb = 58;
        lb = 88;
        tb = 7;

        hasil = pb*lb*tb;
        System.out.println("Volume Balok "+hasil);

        // Luas segitiga
        int alas, ts;
        float hasils;
        alas = 98;
        ts = 57;
        hasils = (alas/2)*ts;

        System.out.println("Luas segitiga "+hasils);

        // Konversi galon ke liter
        float liter;
        liter = 3.7854f;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah galon: ");
        int inputNumber = scanner.nextInt();

        System.out.println(inputNumber*liter);

        // Membuat data diri 
        System.out.print("Masukkan nama : ");
        String inputNama = scanner.next();
        
        System.out.print("Masukkan usia : ");
        int inputUsia = scanner.nextInt();
        
        System.out.print("Masukkan IPK : ");
        float inputIpk = scanner.nextFloat();
        
        System.out.print("Masukkan Status anda : ");
        boolean inputStatus = scanner.nextBoolean();
        
        System.out.println("Nama : " + inputNama);
        System.out.println("Usia : " + inputUsia);
        System.out.println("IPK : " + inputIpk);

        if (!inputStatus) {
            System.out.println(inputNama + " belum menikah ");
        } else {
            System.out.println(inputNama + " sudah menikah ");
        }

        if (inputUsia <= 12) {
            System.out.println(inputNama + " masih anak-anak");
        } else if (inputUsia >= 13 && inputUsia <= 17){
            System.out.println(inputNama + " sudah remaja");
        } else {
            System.out.println(inputNama + " sudah dewasa");
        }
        
        scanner.close();
        
        


        // int a, b, c;
        // a = 4;
        // b = 6;
        // c = a+b;

        // String result = "Hasil penjumlahannya adalah ";
        // System.out.println(result  + c);
    }
}