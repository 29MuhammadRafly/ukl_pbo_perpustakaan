/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-1
 */
public class Run {
    public static void main(String[] args) {
        Buku buku= new Buku();
        Siswa siswa= new Siswa();
        Peminjaman peminjaman= new Peminjaman();
        Laporan lap= new Laporan();
        Pengembalian pengembalian= new Pengembalian();
        lap.laporan(buku);
        lap.laporan(siswa);
        peminjaman.prosesPeminjaman(siswa, peminjaman, buku);
        lap.laporan(peminjaman, buku);
        lap.laporan(buku);
        lap.laporan(siswa);
        pengembalian.prosesPengembalian(siswa, pengembalian, buku);
        lap.laporan(buku);
        lap.laporan(siswa);
    }
}

