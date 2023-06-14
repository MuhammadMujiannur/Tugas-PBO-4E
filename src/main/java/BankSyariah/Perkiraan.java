/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankSyariah;

/**
 *
 * @author ACER
 */
public class Perkiraan {
  private String kd_perkiraan;
    private String desk_perkiraan;
    private String saldo_normal;
    
    public Perkiraan(String kd_perkiraan, String desk_perkiraan, String saldo_normal) {
        this.kd_perkiraan = kd_perkiraan;
        this.desk_perkiraan = desk_perkiraan;
        this.saldo_normal = saldo_normal;
    }
    
    public String getKd_perkiraan() {
        return kd_perkiraan;
    }

    public void setKd_perkiraan(String kd_perkiraan) {
        this.kd_perkiraan = kd_perkiraan;
    }

    public String getDesk_perkiraan() {
        return desk_perkiraan;
    }

    public void setDesk_perkiraan(String desk_perkiraan) {
        this.desk_perkiraan = desk_perkiraan;
    }

    public String getSaldo_normal() {
        return saldo_normal;
    }

    public void setSaldo_normal(String saldo_normal) {
        this.saldo_normal = saldo_normal;
    }
    
     public void displayInfo() {
    System.out.println("kd_perkiraan: " + kd_perkiraan);
    System.out.println("desk_perkiraan: " + desk_perkiraan);
    System.out.println("saldo_normal: " + saldo_normal);
    
     }
}
