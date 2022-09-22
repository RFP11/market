package ulangan;

public class makanan {
    int harga;

    public int getHarga() {
        return harga;
    }

    public void setHarga(String namaMakanan) {
        if (namaMakanan == "Bala-Bala") {
            this.harga = 5000;
        } else if (namaMakanan == "Gehu") {
            this.harga = 10000;
        }
        if (namaMakanan == "Seblak") {
            this.harga = 15000;
        }
    }

    int jumlah;

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    int nomorMakanan;

    public int getNomorMakanan() {
        return nomorMakanan;
    }

    public void setNomorMakanan(int nomorMakanan) {
        this.nomorMakanan = nomorMakanan;
    }

    String namaMakanan;

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(int nomorMakanan) {
        if (nomorMakanan == 1) {
            this.namaMakanan = "Bala-Bala";
        } else if (nomorMakanan == 2) {
            this.namaMakanan = "Gehu";
        } else if (nomorMakanan == 3) {
            this.namaMakanan = "Seblak";
        }
    }

    double diskon;

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(int nomorMakanan) {
        if (nomorMakanan == 1) {
            this.diskon = 0.05;
        } else if (nomorMakanan == 2) {
            this.diskon = 0.10;
        } else if (nomorMakanan == 3) {
            this.diskon = 0.15;
        }
    }

    String namaMenu;

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public void menuMakanan() {
        System.out.println("***************************************");
        System.out.println("-----------------Menu------------------");
        System.out.println("***************************************");
        System.out.println("1.Bala-bala                    Rp. 5000");
        System.out.println("2.Gehu                       Rp. 10.000");
        System.out.println("3.Seblak                     Rp. 15.000");
        System.out.println("***************************************");
    }
}
