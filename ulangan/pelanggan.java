package ulangan;

import java.util.Scanner;

public class pelanggan {
    boolean memberCheck;
    int hargaTotal;
    Scanner s = new Scanner(System.in);
    penjualan hitung = new penjualan();
    makanan setMakanan1 = new makanan();
    makanan setMakanan2 = new makanan();

    public void pesan() {
        System.out.print("Masukan menu 1: ");
        int menu1 = s.nextInt();
        setMakanan1.setNomorMakanan(menu1);
        setMakanan1.setNamaMakanan(setMakanan1.getNomorMakanan());
        setMakanan1.setHarga(setMakanan1.getNamaMakanan());
        int hargaAwal1 = setMakanan1.getHarga();
        hitung.setHarga1(hargaAwal1);
        setMakanan1.setDiskon(setMakanan1.getNomorMakanan());
        hitung.setDiskon1(setMakanan1.getDiskon());
        System.out.print("Masukan Jumlah yang ingin dibeli: ");
        int jumlah1 = s.nextInt();
        hitung.setJumlah1(jumlah1);
        System.out.print("Masukan menu 2: ");
        int menu2 = s.nextInt();
        setMakanan2.setNomorMakanan(menu2);
        setMakanan2.setNamaMakanan(setMakanan2.getNomorMakanan());
        setMakanan2.setHarga(setMakanan2.getNamaMakanan());
        int hargaAwal2 = setMakanan2.getHarga();
        hitung.setHarga2(hargaAwal2);
        setMakanan2.setDiskon(setMakanan2.getNomorMakanan());
        hitung.setDiskon2(setMakanan2.getDiskon());
        System.out.print("Masukan Jumlah yang ingin dibeli: ");
        int jumlah2 = s.nextInt();
        hitung.setJumlah2(jumlah2);
        System.out.print("Masukan nominal uang yang akan dibayarkan: ");
        int uang = s.nextInt();
        hitung.setUang(uang);
        System.out.print("member ? (y/n)");
        String member = s.next();
        switch (member) {
            case "y":
                memberCheck = true;
                break;
            case "n":
                memberCheck = false;
                break;
        }
    }

    public void struk() {
        System.out.println("***************************************");
        System.out.println("***********STRUK PEMBAYARAN************");
        System.out.println("***************************************");
        System.out.println("Menu 1: " + setMakanan1.getNamaMakanan());
        System.out.println("Harga menu 1: " + setMakanan1.getHarga());
        System.out.println("Menu 2: " + setMakanan2.getNamaMakanan());
        System.out.println("Harga menu 2: " + setMakanan2.getHarga());
        System.out.println("Total Harga: " + ((hitung.getHarga1() * hitung.getJumlah1())
                + (hitung.getHarga2() * hitung.getJumlah2())));
        if (memberCheck) {
            System.out.println(
                    "Total Harga Setelah Diskon: " + (((hitung.getHarga1() * hitung.getJumlah1()) - hitung.getDiskon1())
                            + (hitung.getHarga2() * hitung.getJumlah2()) - hitung.getDiskon2()));
        }

        System.out.println("Pembayaran: " + hitung.getUang());
        System.out.println("Member: " + memberCheck);
        if (memberCheck) {
            System.out.println("kembalian: " + ((((hitung.getHarga1() * hitung.getJumlah1()) - hitung.getDiskon1())
                    + (hitung.getHarga2() * hitung.getJumlah2()) - hitung.getDiskon2()) - hitung.getUang()));
        } else {
            System.out.println("kembalian: " + (((hitung.getHarga1() * hitung.getJumlah1())
                    + (hitung.getHarga2() * hitung.getJumlah2())) - hitung.getUang()));

        }
        System.out.println("***************************************");
    }
}
