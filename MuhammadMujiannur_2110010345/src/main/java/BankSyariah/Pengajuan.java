/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankSyariah;

/**
 *
 * @author ACER
 */
public class Pengajuan {
private String no_pengajuan;
    private String kd_perkiraan;
    private String uraian_pengajuan;
    private String tgl_pengajuan;
    private String status_pengajuan;
    private String no_admin;
    
    public Pengajuan(String no_pengajuan, String kd_perkiraan, String uraian_pengajuan, String tgl_pengajuan, String status_pengajuan, String no_admin) {
        this.no_pengajuan = no_pengajuan;
        this.kd_perkiraan = kd_perkiraan;
        this.uraian_pengajuan = uraian_pengajuan;
        this.tgl_pengajuan = tgl_pengajuan;
        this.status_pengajuan = status_pengajuan;
        this.no_admin = no_admin;
    }
    
    public String getNo_pengajuan() {
        return no_pengajuan;
    }

    public void setNo_pengajuan(String no_pengajuan) {
        this.no_pengajuan = no_pengajuan;
    }

    public String getKd_perkiraan() {
        return kd_perkiraan;
    }

    public void setKd_perkiraan(String kd_perkiraan) {
        this.kd_perkiraan = kd_perkiraan;
    }

    public String getUraian_pengajuan() {
        return uraian_pengajuan;
    }

    public void setUraian_pengajuan(String uraian_pengajuan) {
        this.uraian_pengajuan = uraian_pengajuan;
    }

    public String getTgl_pengajuan() {
        return tgl_pengajuan;
    }

    public void setTgl_pengajuan(String tgl_pengajuan) {
        this.tgl_pengajuan = tgl_pengajuan;
    }

    public String getStatus_pengajuan() {
        return status_pengajuan;
    }

    public void setStatus_pengajuan(String status_pengajuan) {
        this.status_pengajuan = status_pengajuan;
    }

    public String getNo_admin() {
        return no_admin;
    }

    public void setNo_admin(String no_admin) {
        this.no_admin = no_admin;
    }
    
     public void displayInfo() {
    System.out.println("no_pengajuan: " + no_pengajuan);
    System.out.println("kd_perkiraan: " + kd_perkiraan);
    System.out.println("uraian_pengajuan: " + uraian_pengajuan);
    System.out.println("tgl_pengajuan: " + tgl_pengajuan);
    System.out.println("status_pengajuan: " + status_pengajuan);
    System.out.println("no_admin: " + no_admin);
     }
}
