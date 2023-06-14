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
public class datasetReimburse {
private ArrayList<Integer> no_reimburse;
    private ArrayList<String> kd_perkiraan;
    private ArrayList<String> uraian_reimburse;
    private ArrayList<String> biaya_reimburse;
    private ArrayList<String> tgl_reimburse;
    private ArrayList<String> status_reimburse;
    private ArrayList<String> status_reinburse;
    private ArrayList<String> no_admin;

public datasetReimburse(){
        no_reimburse =new ArrayList<Integer>();
        kd_perkiraan = new ArrayList<String>();
        uraian_reimburse = new ArrayList<String>();
        biaya_reimburse = new ArrayList<String>();
        tgl_reimburse = new ArrayList<String>();
        status_reimburse = new ArrayList<String>();
        status_reinburse = new ArrayList<String>();
        no_admin = new ArrayList<String>();
}    

 public void setno_reimburse(Integer isi){
       this.no_reimburse.add(isi);
   }
   
   public void setkd_perkiraan(String isi){
       this.kd_perkiraan.add(isi);
   }
   
   public void seturaian_reimburse(String isi){
       this.uraian_reimburse.add(isi);
   }
    public void setbiaya_reimburse(String isi){
       this.biaya_reimburse.add(isi);
   }
     public void settgl_reimburse(String isi){
       this.tgl_reimburse.add(isi);
   }
      public void setstatus_reimburse(String isi){
       this.status_reimburse.add(isi);
   }
      public void setno_admin(String isi){
       this.no_admin.add(isi);
}
      
       public ArrayList<Integer> getno_reimburse(){
       return this.no_reimburse;
   }
   
   public ArrayList<String> getkd_perkiraan(){
       return this.kd_perkiraan;
   }
   
   public ArrayList<String> geturaian_reimburse(){
       return this.uraian_reimburse;
   }
   public ArrayList<String> getbiaya_reimburse(){
       return this.biaya_reimburse;
   }
   public ArrayList<String> gettgl_reimburse(){
       return this.tgl_reimburse;
   }
    public ArrayList<String> getstatus_reimburse(){
       return this.status_reimburse;
   }
    public ArrayList<String> getno_admin(){
       return this.no_admin;
   }
}

