import java.util.Scanner;
import java.util.ArrayList;

public class tugas3size {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan size array: ");
        int count = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Masukkan Elemen array: ");
        for (int i = 0; i < count; i++) {
            System.out.print("Elemen " + (i + 1) + ": ");
            list.add(scan.nextInt());
        }

        System.out.print("Final array: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }

        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Angka terbesar: " + max);
        scan.close();
    }
}