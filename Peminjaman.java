
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-1
 */
public class Peminjaman {
   private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();

    public Peminjaman() {
    this.idSiswa.add(0);
    this.idBuku.add(0);
    this.banyak.add(2);
    this.idSiswa.add(0);
    this.idBuku.add(1);
    this.banyak.add(3);
    this.idSiswa.add(1);
    this.idBuku.add(0);
    this.banyak.add(1);
    this.idSiswa.add(1);
    this.idBuku.add(2);
    this.banyak.add(2);
 }
 public void prosesPeminjaman(Siswa siswa, Peminjaman peminjaman, Buku
    buku){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Silahkan Meminjam Buku");
    System.out.println("Masukkan ID Member");
    int idSiswa = myObj.nextInt();
    System.out.println("Selamat datang "+siswa.getNama(idSiswa));
    ArrayList<Integer> idBuku = new ArrayList<Integer>();
    ArrayList<Integer> banyak = new ArrayList<Integer>();
    int i=0;
    int temp=0;
    do{
    System.out.println("Masukkan kode barang :");
    temp=myObj.nextInt();
    if (temp!=99){
        idBuku.add(temp);
        System.out.print(buku.getNamaBuku(idBuku.get(i))+ " sebanyak : ");
        banyak.add(myObj.nextInt());
        i++;
    }
    }while (temp!=99);
     if (!siswa.getStatus(idSiswa)) {
         System.out.println("Tidak bisa meminjam");
     }else{
         System.out.println("Transaksi belanja "+siswa.getNama(idSiswa)+"sebagai berikut");
        System.out.println("Nama Buku \tQty \tHarga \tJumlah \t");

        int total=0;
        int x = idBuku.size();
        for (int j = 0; j < x; j++){
            int jumlah=banyak.get(j) * buku.getHarga(idBuku.get(j));
            total+=jumlah;
            System.out.println(buku.getNamaBuku(idBuku.get(j))+"\t"+
            banyak.get(j)+"\t"+
            buku.getHarga(idBuku.get(j))+"\t"+jumlah);
            peminjaman.setPeminjaman(buku, idSiswa, idBuku.get(j),banyak.get(j));
        }

        System.out.println("Total Harga Peminjaman : "+total);
        siswa.editStatus(idSiswa, !siswa.getStatus(idSiswa));
     }
    }
    public void setPeminjaman(Buku buku, int idSiswa, int idBuku, int banyaknya){
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku)-banyaknya);
    }
    public int getIdBuku(int id){
        return this.idBuku.get(id);
    }
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }
    public int getIdSiswa(int id){
        return this.idSiswa.get(id);
    } 
    public int getJmlPeminjaman(){
        return this.idSiswa.size();
    } 
}

