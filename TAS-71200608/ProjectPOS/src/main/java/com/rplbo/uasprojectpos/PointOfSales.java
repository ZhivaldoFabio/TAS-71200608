package com.rplbo.uasprojectpos;

import java.util.ArrayList;
import java.util.HashMap;

public class PointOfSales {
    private ArrayList<Barang> arrBarang = new ArrayList<Barang>();

    public void inputBarang(Barang barang){
        arrBarang.add(barang);

    }

    public void tampilDaftarBarang(){
        
        System.out.println("Kode Barang \t NamaBarang \t\t\t\t Stok \t\t\t Harga");
        for (Barang i : arrBarang) {
            System.out.println(i.getKode()+"\t\t\t"+i.getNama()+"\t\t\t"+i.getStok()+"\t\t\t"+ i.getHarga());
        
        }


    }

    public PointOfSales() {
        this.arrBarang = arrBarang;
    }

    public void checkout(HashMap<Barang, Integer> keranjang, long nominal){
        long totalHarga=0;
        long exchange=0;
        for (Barang i : keranjang.keySet()) {
            totalHarga += i.getHarga() * keranjang.get(i);
            exchange = nominal - totalHarga;
            i.setStok(i.getStok()-keranjang.get(i));
        }
        System.out.println("-----Transaksi Sukses----");
        System.out.println("Total Tagihan \t : "+totalHarga);
        System.out.println("Total Bayar \t: "+nominal);
        System.out.println("Total Kembalian \t: "+exchange);

    }
}
