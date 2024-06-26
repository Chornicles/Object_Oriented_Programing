package UTS_OOP;

import java.util.Scanner;

/**
 *
 * @author I Gusti Ngurah Gede Ardi Purnabawa
 * NIM: 2201010171
 * TGL : 12-05-2024
 */

public class GramediaApp {
    private static final int MAX_PENGUNJUNG = 100;
    private static GramedVisitor[] pengunjung = new GramedVisitor[MAX_PENGUNJUNG];
    private static int jumlahPengunjung = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tulis nama pengunjung");
            System.out.println("2. Tampilkan jumlah pengunjung");
            System.out.println("3. Ubah data pengunjung");
            System.out.println("4. Hapus data pengunjung");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline dari buffer

            switch (pilihan) {
                case 1:
                    tulisPengunjung();
                    break;
                case 2:
                    tampilkanJumlahPengunjung();
                    break;
                case 3:
                    ubahDataPengunjung();
                    break;
                case 4:
                    hapusDataPengunjung();
                    break;
                case 5:
                    System.out.println("TerimaKasih Telah Menggunakan App Ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 5);
    }

    private static void tulisPengunjung() {
        if (jumlahPengunjung < MAX_PENGUNJUNG) {
            System.out.print("Masukkan nama pengunjung: ");
            String nama = scanner.nextLine();
            pengunjung[jumlahPengunjung] = new GramedVisitor(nama);
            jumlahPengunjung++;
            System.out.println("nama Pengunjung berhasil ditulis");
        } else {
            System.out.println("Kapasitas pengunjung sudah penuh");
        }
    }

    private static void tampilkanJumlahPengunjung() {
        System.out.println("Jumlah pengunjung: " + jumlahPengunjung);
        System.out.println("Daftar pengunjung:");
        for (int i = 0; i < jumlahPengunjung; i++) {
            System.out.println((i + 1) + ". " + pengunjung[i].getNama());
        }
    }

    private static void ubahDataPengunjung() {
        System.out.print("Masukkan nomor pengunjung yang ingin diubah: ");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline dari buffer

        if (nomor > 0 && nomor <= jumlahPengunjung) {
            System.out.print("Masukkan nama baru: ");
            String namaBaru = scanner.nextLine();
            pengunjung[nomor - 1].setNama(namaBaru);
            System.out.println("Data pengunjung berhasil diubah");
        } else {
            System.out.println("Nomor pengunjung tidak valid");
        }
    }

    private static void hapusDataPengunjung() {
        System.out.print("Masukkan nomor pengunjung yang ingin dihapus: ");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline dari buffer

        if (nomor > 0 && nomor <= jumlahPengunjung) {
            for (int i = nomor - 1; i < jumlahPengunjung - 1; i++) {
                pengunjung[i] = pengunjung[i + 1];
            }
            jumlahPengunjung--;
            System.out.println("Data pengunjung berhasil dihapus.");
        } else {
            System.out.println("Nomor pengunjung tidak valid");
        }
    }
}
