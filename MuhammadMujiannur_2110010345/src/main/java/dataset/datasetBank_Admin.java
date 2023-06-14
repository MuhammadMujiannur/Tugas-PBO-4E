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
public class datasetBank_Admin {
 private ArrayList <String> username;
 private ArrayList <String> password;
 private ArrayList <String> email;
    
    

    public datasetBank_Admin() {
        username = new ArrayList <String> ();
        password = new ArrayList <String> ();
        email =  new ArrayList <String> ();
    }
    
public void insertusername(String isi){
    this.username.add(isi);
}

public ArrayList<String> getdatasetusername(){
    return this.username;
}

public void insertpassword(String isi){
    this.password.add(isi);
}

public ArrayList<String> getdatasetpassword(){
    return this.password;
}

public void insertemail(String isi){
    this.email.add(isi);
}

public ArrayList<String> getdatasetemail(){
    return this.email;
}
}
