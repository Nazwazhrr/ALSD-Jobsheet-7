public class DataDosen15 {
    Dosen15[] dataDosen;
    int idx;

    public DataDosen15(int jumlah) {
        dataDosen = new Dosen15[jumlah];
        idx = 0;
    }

    public void tambah(Dosen15 d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    public void tampil() {
        for (Dosen15 d : dataDosen) {
            if (d != null) {
                d.tampil();
            }
        }    
    }
    
    // Pencarian Data Sequential )
    public void PencarianDataSequential15(String cariNama) {
        boolean ditemukan = false;
        for (Dosen15 d : dataDosen) {
            if (d != null && d.nama.equalsIgnoreCase(cariNama)) {
                d.tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }
    
    // Pencarian Data Binary
    public void PencarianDataBinary15(int cariUsia) {
        int left = 0, right = idx - 1;
        boolean ditemukan = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dataDosen[mid].usia == cariUsia) {
                System.out.println("Dosen ditemukan:");
                int i = mid;
                while (i >= 0 && dataDosen[i].usia == cariUsia) {
                    dataDosen[i].tampil();
                    i--;
                }
                i = mid + 1;
                while (i < idx && dataDosen[i].usia == cariUsia) {
                    dataDosen[i].tampil();
                    i++;
                }
                ditemukan = true;
                break;
            }
            if (dataDosen[mid].usia > cariUsia) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan usia " + cariUsia + " tidak ditemukan.");
        }
    }
}