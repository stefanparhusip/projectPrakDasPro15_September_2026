import java.util.Scanner;

public class PemilihanBilangan27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) 
        {
            System.out.println("Angka" + angka + "termasuk bilangan genap.");
        } 
            else 
        {
            System.out.println( "Angka" + angka + "termasuk bilangan ganjil ");
        }
        sc.close();
    }
}

        // "jika ingin menggunakan ganjil, bisa menggunakan else if dengan command dibawah dan tetap menggunakan else di akhir"
        // else if (angka  % 2 == 1) 
        //{
        //    System.out.println("Angka" + angka + "termasuk bilangan ganjil");
        //}