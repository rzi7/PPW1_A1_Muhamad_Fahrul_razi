import java.util.ArrayList;

public class perte3 {
    public static void main(String[] args) {
        // kita harus menginiliasisasi new pada variabel untuk membuat panjang array.
        int[] numbers = new int[3]; // int[3] angka 3 didalam kurung siku menandakan jumlah ukuran pada array,
                                    // sehingga apabila dimasukkan index ke tiga (numbers[3 dst]) maka akan error
        int angka[] = new int[3]; // kurung siku dapat diletakkan di depan atau belakang variabel untuk menandakan
                                  // bahawa variabel tersebut adalah array.

        numbers[0] = 1;
        numbers[1] = 2;

        angka[0] = 'a';
        angka[1] = 'b';

        // Array list untuk membuat array tanpa batasan panjang array.
        ArrayList<Integer> nomor = new ArrayList<Integer>(); // didalam lebih dari dan kurang dari (<>) harus dituliskan
                                                             // nama tipe data dengan lengkap.
        nomor.add(1); // menambahkan elemen ke dalam array (bukan index)
        nomor.add(2);
        nomor.add(3);
        nomor.add(4);
        nomor.add(5);
        nomor.add(6);
        nomor.add(7);
        nomor.add(8);
        nomor.add(9);
        nomor.add(10);
        System.out.println(nomor);
        nomor.remove(3); // untuk menghapus elemen array berdasarkan index
        nomor.remove(Integer.valueOf(6)); // Untuk menghapus nomor / elemen pada array, bukan indexnya
        System.out.println(nomor);

        // System.out.print(numbers);
        // System.out.print(angka);

        // // perulangan for dengan i adalah variabel yang berada didalam for / lokal
        // dan hanya dijalankan sekali
        // // i < 5 merupakan kondisi yang harus memenuhi dalam for agar perulangan
        // tetap berjalan
        // // i+2 merupakan paramater yang akan dijalankan diakhir jika memenuhi kondisi
        // for (int i = 0; i < 11; i+=2) {
        // System.out.println(i);
        // }

        int tugas[] = new int[5];
        for (int i = 0; i < 5; i++) {
            tugas[i] = i * 2 + 2;
        }

        for (int a : tugas) {
            System.out.println(a);
        }

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        String bakSoo = "bakSoo";
        // char bakso [] = new char[6];
        ArrayList<Character> bakso = new ArrayList<Character>();
        // String baksoo = new String(bakso);
        for (i = 0; i < bakSoo.length(); i++) {
            bakso.add(bakSoo.charAt(i));
            System.out.println(bakso);
            // System.out.println(bakSoo.charAt(i));
        }

        // System.out.println(bakso);
        System.out.println(bakSoo);
        // for (int a : nomor) {
        // System.out.println(a);
        // }

        for (i = 1; i <= 20; i++) {
            double akar = Math.sqrt(i);
            System.out.println("Akar dari " + i + " adalah " + akar);
            System.out.println("Error adalah " + (i - (akar * akar)) + "\n");
            // System.out.println(" ");
        }
        // // Perulangan while dengan variabel i dilaukan diluar maka variabel global
        // // kondisi yang harus memenuhi dalam while dituliskan didalm kurung
        // // dan kode yang akan dijalankan diakhir dituliskan diakhir dalam while
        // (didalam kurung kurawal)
        // int i = 0;
        // while (i < 11) {
        // System.out.println(i);
        // i += 2;
        // }
    }
}