/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankSyariah;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Reimburse {
    private Integer no_reimburse;
    private String kd_perkiraan;
    private String uraian_reimburse;
    private String biaya_reimburse;
    private String tgl_reimburse;
    private String status_reimburse;
    private String status_reinburse;
    private String no_admin;
    
    public Reimburse(Integer no_reimburse, String kd_perkiraan, String uraian_reimburse, String biaya_reimburse, String tgl_reimburse, String status_reimburse, String status_reinburse, String no_admin) {
        this.no_reimburse = no_reimburse;
        this.kd_perkiraan = kd_perkiraan;
        this.uraian_reimburse = uraian_reimburse;
        this.biaya_reimburse = biaya_reimburse;
        this.tgl_reimburse = tgl_reimburse;
        this.status_reimburse = status_reimburse;
        this.status_reinburse = status_reinburse;
        this.no_admin = no_admin;
    }
    
    public Integer getno_reimburse() {
        return no_reimburse;
    }

    public void setKd_perkiraan(Integer no_reimburse) {
        this.no_reimburse = no_reimburse;
    }

    public String getKd_perkiraan() {
        return kd_perkiraan;
    }

    public void setKd_perkiraan(String kd_perkiraan) {
        this.kd_perkiraan = kd_perkiraan;
    }

    public String getUraian_reimburse() {
        return uraian_reimburse;
    }

    public void setUraian_reimburse(String uraian_reimburse) {
        this.uraian_reimburse = uraian_reimburse;
    }

    public String getBiaya_reimburse() {
        return biaya_reimburse;
    }

    public void setBiaya_reimburse(String biaya_reimburse) {
        this.biaya_reimburse = biaya_reimburse;
    }

    public String getTgl_reimburse() {
        return tgl_reimburse;
    }

    public void setTgl_reimburse(String tgl_reimburse) {
        this.tgl_reimburse = tgl_reimburse;
    }

    public String getStatus_reimburse() {
        return status_reimburse;
    }

    public void setStatus_reimburse(String status_reimburse) {
        this.status_reimburse = status_reimburse;
    }

    public String getStatus_reinburse() {
        return status_reinburse;
    }

    public void setStatus_reinburse(String status_reinburse) {
        this.status_reinburse = status_reinburse;
    }

    public String getNo_admin() {
        return no_admin;
    }

    public void setNo_admin(String no_admin) {
        this.no_admin = no_admin;
    } 
    
     public void displayInfo() {
    System.out.println("No Reimburse : " + no_reimburse);
    System.out.println("Kode Perkiraan : " + kd_perkiraan);
    System.out.println("Uraian Reimburse : " + uraian_reimburse);
    System.out.println("Biaya Reimburse : " + biaya_reimburse);
    System.out.println("Tanggal Reimburse : " + tgl_reimburse);
    System.out.println("Status Reimburse : " + status_reimburse);
    System.out.println("Status Reimburse : " + status_reimburse);
    System.out.println("No Admin : " + no_admin);
     
     }
}
