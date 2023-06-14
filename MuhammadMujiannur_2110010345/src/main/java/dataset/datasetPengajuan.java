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
public class datasetPengajuan {
 private ArrayList <String> no_pengajuan;
 private ArrayList <String> kd_perkiraan;
 private ArrayList <String> uraian_pengajuan;
 private ArrayList <String> tgl_pengajuan;
 private ArrayList <String> status_pengajuan;
 private ArrayList <String> no_admin;
    
 public datasetPengajuan(){
       no_pengajuan=new ArrayList<String>();
       kd_perkiraan=new ArrayList<String>();
       uraian_pengajuan=new ArrayList<String>();
       tgl_pengajuan=new ArrayList<String>();
       status_pengajuan=new ArrayList<String>();
       no_admin=new ArrayList<String>();
   }
//method
   public void setNo_pengajuan(String isi){
       this.no_pengajuan.add(isi);
   }
   
   public void setkd_perkiraan(String isi){
       this.kd_perkiraan.add(isi);
   }
   
   public void seturaian_pengajuan(String isi){
       this.uraian_pengajuan.add(isi);
   }
   
   public void settgl_pengajuan(String isi){
       this.tgl_pengajuan.add(isi);
   }

   //keluaran ArrayList
   public ArrayList<String> getNo_pengajuan(){
       return this.no_pengajuan;
   }
   
   public ArrayList<String> getKd_perkiraan(){
       return this.kd_perkiraan;
   }
   
   public ArrayList<String> getUraian_pengajuan(){
       return this.uraian_pengajuan;
   }
   
   public ArrayList<String> getTgl_pengajuan(){
       return this.tgl_pengajuan;
   }
    
    public ArrayList<String> getStatus_pengajuan(){
       return this.status_pengajuan;
   }
    
     public ArrayList<String> getno_admin(){
       return this.no_admin;
   }

    public void setstatus_pengajuan(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setno_admin(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
