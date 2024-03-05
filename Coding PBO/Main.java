import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sisiPersegi = scanner.nextInt();
        String inputKedua = scanner.next();

        if (inputKedua.equals(";")){
            int luasPersegi = sisiPersegi * sisiPersegi;
            System.out.println(luasPersegi);
        } else {
            int alas = Integer.parseInt(inputKedua);
            int tinggi = (sisiPersegi);
            double luasSegitiga = 0.5 * alas * tinggi;
            System.out.println(luasSegitiga);
        }
        scanner.close();
    }
}