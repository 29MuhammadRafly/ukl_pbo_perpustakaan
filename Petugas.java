
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
public class Petugas {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Petugas() {
    this.namaPetugas.add("admin");
    this.alamat.add("kedung kandang");
    this.telepon.add("081112223333");
    this.jabatan.add(0);
    }
    public void setJabatan(int jabatan ){
    this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
    return this.jabatan.get(id);
    }
    public int getJmlPetugas(){
    return this.namaPetugas.size();
    }
    public void setNama(String namaPetugas ){
    this.namaPetugas.add(namaPetugas);
    }

    public void setAlamat(String alamat ){
    this.namaPetugas.add(alamat);
    }
    public void setTelepon(String telepon ){
    this.namaPetugas.add(telepon);
    }

    public String getNama(int idPetugas){
    return this.namaPetugas.get(idPetugas);
    }

    public String getAlamat(int idPetugas){
    return this.alamat.get(idPetugas);
    }

    public String getTelepon(int idPetugas){
    return this.telepon.get(idPetugas);
    }
   }