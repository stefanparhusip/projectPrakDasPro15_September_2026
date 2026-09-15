import java.util.Scanner;

public class KafeModifikasi27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan menu (kopi/teh/coklat): ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup (S/M/L): ");
        ukuranCup = Character.toUpperCase(sc.next().charAt(0));
        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        String ukuranCupLabel;
        switch (ukuranCup) {
            case 'S':
                ukuranCupLabel = "Small";
                break;
            case 'M':
                ukuranCupLabel = "Medium";
                break;
            case 'L':
                ukuranCupLabel = "Large";
                break;
            default:
                ukuranCupLabel = "Tidak tersedia";
                System.out.println("Ukuran cup yang dipilih tidak tersedia.");
                sc.close();
                return;
        }

        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            default:
                System.out.println("Menu yang dipilih tidak tersedia.");
                sc.close();
                return;
        }

        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCupLabel);
        System.out.println("Nominal bayar: " + nominalBayar);

        sc.close();
    }
}