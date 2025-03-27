import java.util.Scanner;
public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input.nextInt();
        input.nextLine();

        DataDosen15 data = new DataDosen15(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = input.nextLine();
            System.out.print("Nama       : ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
            boolean jenisKelamin = input.nextBoolean();
            System.out.print("Usia       : ");
            int usia = input.nextInt();
            input.nextLine();

            data.tambah(new Dosen15(kode, nama, jenisKelamin, usia));
        }

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Cari Dosen berdasarkan Nama (Sequential)");
            System.out.println("3. Cari Dosen berdasarkan Usia (Binary)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nData Dosen:");
                    data.tampil();
                    break;
                case 2:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = input.nextLine();
                    data.PencarianDataSequential15(cariNama);
                    break;
                case 3:
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = input.nextInt();
                    data.PencarianDataBinary15(cariUsia);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }
}
