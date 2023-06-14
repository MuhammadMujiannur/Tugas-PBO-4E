/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankSyariah;

/**
 *
 * @author ACER
 */
public class Transaksi {
  private String no_transaksi;
    private String divisi;
    private String nama;
    
    public Transaksi(String no_transaksi, String divisi, String nama) {
        this.no_transaksi = no_transaksi;
        this.divisi = divisi;
        this.nama = nama;
    }
    
    public String getNo_transaksi() {
        return no_transaksi;
    }

    public void setNo_transaksi(String no_transaksi) {
        this.no_transaksi = no_transaksi;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    } 
    
    public void displayInfo() {
    System.out.println("no_transaksi: " + no_transaksi);
    System.out.println("divisi: " + divisi);
    System.out.println("nama: " + nama);
    }
}
