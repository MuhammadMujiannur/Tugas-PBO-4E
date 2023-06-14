/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author W11
 */
public class datasetTransaksi {
 private ArrayList<String> no_transaksi;
    private ArrayList<String> divisi;
    private ArrayList<String> nama;
    
    public datasetTransaksi (){
    no_transaksi = new ArrayList<String>();
    divisi =new ArrayList<String>();
    nama = new ArrayList<String>();
}
 public void setno_transaksi(String isi){
       this.no_transaksi.add(isi);
   }
   
   public void setdivisi(String isi){
       this.divisi.add(isi);
   }
   
   public void setnama(String isi){
       this.nama.add(isi);
   }

   public ArrayList<String> getno_transaksi(){
       return this.no_transaksi;
   }
   
   public ArrayList<String> getdivisi(){
       return this.divisi;
   }
   
   public ArrayList<String> getnama(){
       return this.nama;
   }
}
