/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankSyariah;



/**
 *
 * @author ACER
 */
public class Kas {
private String noKredit;
    private String kodePerkiraan;
    private String uraianKredit;
    private int kasKredit;
    

    public Kas(String noKredit, String kodePerkiraan, String uraianKredit, int kasKredit) {
        this.noKredit = noKredit;
        this.kodePerkiraan = kodePerkiraan;
        this.uraianKredit = uraianKredit;
        this.kasKredit = kasKredit;
       
    }

    public String getNoKredit() {
        return noKredit;
    }
    
    public void setNokredit(String nokredit) {
        this.noKredit = nokredit;
    }

    public String getKodePerkiraan() {
        return kodePerkiraan;
    }
    
     public void setkodePerkiraan(String kodePerkiraan) {
        this.kodePerkiraan = kodePerkiraan;
     }

    public String getUraianKredit() {
        return uraianKredit;
    }
    
     public void seturaianKredit(String uraianKredit) {
        this. uraianKredit =  uraianKredit;
     }

    public int getKasKredit() {
        return kasKredit;
    }
    
    public void setKasKredit(int kasKredit) {
        this.kasKredit =  kasKredit;
     }

   

    public void displayInfo() {
        System.out.println("Kas Credit Information:");
        System.out.println("No Kredit: " + noKredit);
        System.out.println("Kode Perkiraan: " + kodePerkiraan);
        System.out.println("Uraian Kredit: " + uraianKredit);
        System.out.println("Kas Kredit: " + kasKredit);
    }

   
}
