
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-1
 */
public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku() {
    this.namaBuku.add("Laskar Pelangi");
    this.stok.add(25);
    this.harga.add(2500);
    this.namaBuku.add("Hujan di Bulan Juni");
    this.stok.add(30);
    this.harga.add(3000);
    this.namaBuku.add("Kisah Kancil dan Buaya");
    this.stok.add(20);
    this.harga.add(1500);
    }
    public int getJmlBuku(){
    return this.namaBuku.size();
    }
    public void setNamaBuku(String namaBuku ){
    this.namaBuku.add(namaBuku);
    }
    public String getNamaBuku(int idBuku){
    return this.namaBuku.get(idBuku);
    }

    public void setStok(int stok ){
    this.stok.add(stok);
    }
    public int getStok(int idBuku){
    return this.stok.get(idBuku);
    }
    public void editStok(int idBuku, int stok){
    this.stok.set(idBuku, stok);
    }
    public void setHarga(int harga ){
    this.harga.add(harga);
    }
    public int getHarga(int idBuku){
    return this.harga.get(idBuku);
    }
  }
