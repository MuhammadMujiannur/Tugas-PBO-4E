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
public class datasetPerkiraan {
    private ArrayList<String> kd_perkiraan;
    private ArrayList<String> desk_perkiraan;
    private ArrayList<String> saldo_normal;
   
    public datasetPerkiraan(){
    kd_perkiraan = new ArrayList<String>();
    desk_perkiraan =  new ArrayList<String>();
    saldo_normal =  new ArrayList<String>();
}
    public void setkd_perkiraan(String isi){
       this.kd_perkiraan.add(isi);
   }
   
   public void setdesk_perkiraan(String isi){
       this.desk_perkiraan.add(isi);
   }
   
   public void setsaldo_normal(String isi){
       this.saldo_normal.add(isi);
   }
   
   public ArrayList<String> getkd_perkiraan(){
       return this.kd_perkiraan;
   }
   
   public ArrayList<String> getdesk_perkiraan(){
       return this.desk_perkiraan;
   }
   
   public ArrayList<String> getsaldo_normal(){
       return this.saldo_normal;
   }
}


