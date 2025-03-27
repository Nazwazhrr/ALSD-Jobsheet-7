import java.util.Scanner;
public class MahasiswaDemo15 {
public static void main(String[] args) {
    Scanner input15 = new Scanner (System.in);
    
    MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();
    System.out.println("Masukkan jumlah data mahasiswa : ");
    int jumlah = input15.nextInt();
    input15.nextLine();

    for (int i = 0; i < jumlah; i++) {
        System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
        System.out.print("NIM : ");
        String nim = input15.nextLine();
        System.out.print("Nama : ");
        String nama = input15.nextLine();
        System.out.print("Kelas : ");
        String kelas = input15.nextLine();
        System.out.print("IPK : ");
        String ip = input15.nextLine();
        double ipk = Double.parseDouble(ip);
        System.out.println("---------------------------------------");
        list.tambah(new Mahasiswa15(nama, nim, kelas, ipk));
    }  
        list.tampil();
        //melakukan pencarian data sequential
        // System.out.println("-----------------------------------------");
        // System.out.println("Pencarian data");
        // System.out.println("-----------------------------------------");
        // System.out.println("Masukkan IPK mahasiswa yang dicari : ");
        // System.out.print("IPK: ");
        // double cari = input15.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearch(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

         //melakukan pencarian data Binary
         System.out.println("-----------------------------------------");
         System.out.println("Pencarian data");
         System.out.println("-----------------------------------------");
         System.out.println("Masukkan IPK mahasiswa yang dicari : ");
         System.out.print("IPK: ");
         double cari = input15.nextDouble();
         System.out.println("-----------------------------------------");
         System.out.println("menggunakan binary search");
         System.out.println("-----------------------------------------");
         double posisi2 = list.findBinarySearch(cari, 0, jumlah-1);
         int pss2 = (int)posisi2;
         list.tampilPosisi(cari, pss2);
         list.tampilDataSearch(cari, pss2);
    }
}