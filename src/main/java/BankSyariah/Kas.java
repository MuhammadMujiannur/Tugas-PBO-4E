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
public class Kas {
private String noKredit;
    private String kodePerkiraan;
    private String uraianKredit;
    private ArrayList<Integer> kasKredit;
    

    public Kas(String noKredit, String kodePerkiraan, String uraianKredit) {
        this.noKredit = noKredit;
        this.kodePerkiraan = kodePerkiraan;
        this.uraianKredit = uraianKredit;
        kasKredit=new ArrayList<Integer>();
       
    }

    public Kas(String string, String string0, String lunas, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public void insertkasKredit(Integer isi){
        this.kasKredit.add(isi);
    }

   public ArrayList<Integer> getrecordkasKredit(){
       return this.kasKredit;
   }

    public void displayInfo() {
        System.out.println("Kas Credit Information:");
        System.out.println("No Kredit: " + noKredit);
        System.out.println("Kode Perkiraan: " + kodePerkiraan);
        System.out.println("Uraian Kredit: " + uraianKredit);
    }

   
}
