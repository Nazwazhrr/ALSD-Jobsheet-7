public class Dosen15 {
    String kode; 
    String nama;
    boolean jenisKelamin;
    int usia;
        
    Dosen15(String kd, String name, boolean jk, int age) {
    kode = kd;
    nama = name;                
    jenisKelamin = jk;
    usia = age;
    }
        
    void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", Usia: " + usia + ", Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
    }
}
