/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.muhammadmujiannur_2110010345;
import BankSyariah.Bank_Admin;
import BankSyariah.Kas;
import BankSyariah.Pengajuan;
import BankSyariah.Perkiraan;
import BankSyariah.Reimburse;
import BankSyariah.Transaksi;
import java.util.ArrayList;

/** 
 *
 * @author ACER
 */
public class MuhammadMujiannur_2110010345 {

    public static void main(String[] args) {
        // Membuat objek Admin Bank Syariah
        Bank_Admin Bank_Admin = new Bank_Admin("A001", "John Doe");
        Bank_Admin.displayInfo();
        ArrayList<String>email=new ArrayList<String>();
        System.out.print("Nama Email:");

        email.add("Muji9051@gmail.com");
        email.add("Muji9052@gmail.com");
        email.add("Muji9053@gmail.com");
        System.out.println(email.get(2));
        
        Kas Kas = new Kas("001","03","Lunas");
        Kas.displayInfo();
        ArrayList<Integer>kasKredit=new ArrayList<Integer>();
        System.out.print("Kredit:");
        
        kasKredit.add(01);
        kasKredit.add(02);
        kasKredit.add(03);
        System.out.println(kasKredit.get(2));
        
        Pengajuan Pengajuan = new Pengajuan("2", "lunas", "pinjaman", "12 mei", "lunas", "22353");
        Pengajuan.displayInfo();
        ArrayList<String>no_admin=new ArrayList<String>();
        System.out.print("Nomor Admin:");
        
        no_admin.add("1");
        no_admin.add("2");
        no_admin.add("3");
        System.out.println(no_admin.get(2));
        
        Perkiraan Perkiraan = new Perkiraan("test", "lunas", "200000");
        Perkiraan.displayInfo();
        
        Reimburse Reimburse = new Reimburse("32324", "test", "pinjaman", "350000", "24 juni", "lunas", "lunas", "223321");
        Reimburse.displayInfo();
        
        Transaksi Transaksi = new Transaksi("12345", "teller", "anang hermanto");
        Transaksi.displayInfo();
       
    }
    }

