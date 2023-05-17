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

/** 
 *
 * @author ACER
 */
public class MuhammadMujiannur_2110010345 {

    public static void main(String[] args) {
        // Membuat objek Admin Bank Syariah
        Bank_Admin Bank_Admin = new Bank_Admin("A001", "John Doe", "admin123");
        Bank_Admin.displayInfo();

        Kas Kas = new Kas("001", "872829", "Lunas", 20);
        Kas.displayInfo();
        
        Pengajuan Pengajuan = new Pengajuan("2", "lunas", "pinjaman", "12 mei", "lunas", "22353");
        Pengajuan.displayInfo();
        
        Perkiraan Perkiraan = new Perkiraan("test", "lunas", "200000");
        Perkiraan.displayInfo();
        
        Reimburse Reimburse = new Reimburse("32324", "test", "pinjaman", "350000", "24 juni", "lunas", "lunas", "223321");
        Reimburse.displayInfo();
        
        Transaksi Transaksi = new Transaksi("12345", "teller", "anang hermanto");
        Transaksi.displayInfo();
       
    }
    }

