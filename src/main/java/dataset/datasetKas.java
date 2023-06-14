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
public class datasetKas {
 private ArrayList <String> noKredit;
 private ArrayList <String> kodePerkiraan;
 private ArrayList <String> uraianKredit;
 private ArrayList <Integer> kasKredit;
    
 public datasetKas(){
       noKredit=new ArrayList<String>();
       kodePerkiraan=new ArrayList<String>();
       uraianKredit=new ArrayList<String>();
       kasKredit=new ArrayList<Integer>();
   }
//method
   public void insertnoKredit(String isi){
       this.noKredit.add(isi);
   }
   
   public void insertkodePerkiraan(String isi){
       this.kodePerkiraan.add(isi);
   }
   
   public void inserturaianKredit(String isi){
       this.uraianKredit.add(isi);
   }
   
   public void insertkasKredit(Integer isi){
       this.kasKredit.add(isi);
   }

   //keluaran ArrayList
   public ArrayList<String> getrecordnoKredit(){
       return this.noKredit;
   }
   
   public ArrayList<String> getrecordkodePerkiraan(){
       return this.kodePerkiraan;
   }
   
   public ArrayList<String> getrecorduraianKredit(){
       return this.uraianKredit;
   }
   
   public ArrayList<Integer> getrecordkasKredit(){
       return this.kasKredit;
   }
    
}
