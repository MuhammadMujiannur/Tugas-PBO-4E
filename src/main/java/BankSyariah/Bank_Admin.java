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
public class Bank_Admin {
  private String username;
    private String password;
    private ArrayList<String>email;

    public Bank_Admin(String username, String password) {
        this.username = username;
        this.password = password;
        email=new ArrayList<String>(); 
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

   public void insertemail(String isi){
       this.email.add(isi);
   }
   
   public ArrayList<String> getrecordemail(){
       return this.email;
   }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
