import java.util.Scanner;

public class tugas3array2d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Ukuran Area");
        int size = scan.nextInt();
        System.out.println("Masukkan titik start X");
        int x1 = scan.nextInt();
        System.out.println("Masukkan titik start Y");
        int y1 = scan.nextInt();
        System.out.println("Masukkan titik finish X");
        int x2 = scan.nextInt();
        System.out.println("Masukkan titik finish Y");
        int y2 = scan.nextInt();

        System.out.println();
        System.out.println("Start = " + x1 + ", " + y1);
        System.out.println("Finish = " + x2 + ", " + y2);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == x1 && j == y1) {
                    System.out.print("S" + " | ");
                } else if (i == y2 && j == x2) {
                    System.out.print("F" + " | ");
                } else {
                    System.out.print("x" + " | ");
                }
            }
            System.out.println();
        }

        while (x1 != x2 || y1 != y2) {
            if (x1 < x2) {
                x1++;
            } else if (x1 > x2) {
                x1--;
            } else if (y1 < y2) {
                y1++;
            } else if (y1 > y2) {
                y1--;
            }
            System.out.println("posisi robot sekarang ada di titik : " + x1 + ", " + y1);
        }

        scan.close();
    }
}
