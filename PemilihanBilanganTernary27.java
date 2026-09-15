import java.util.Scanner;

public class PemilihanBilanganTernary27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        
        String status = angka % 2 == 0 ? "Genap" : "Ganjil";
        
        System.out.println("Angka " + angka + " adalah bilangan " + status);
        sc.close();
    }
}