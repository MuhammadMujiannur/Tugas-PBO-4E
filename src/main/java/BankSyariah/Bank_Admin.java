/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankSyariah;

/**
 *
 * @author ACER
 */
public class Bank_Admin {
  private String username;
    private String password;
    private String email;

    public Bank_Admin(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email; 
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

   public void setemail(String password) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }

    public void displayInfo() {
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
        System.out.println("Email : " + email);
    }
}
