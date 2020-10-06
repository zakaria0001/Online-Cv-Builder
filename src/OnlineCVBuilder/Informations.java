/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineCVBuilder;

import java.util.Date;

/**
 *
 * @author Zakaria Nabil
 */
public class Informations {
    private String nom,prénom;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prénom;
    }
     public Informations(String nom, String prénom) {
        
      
        
        this.nom = nom;
        this.prénom = prénom;
         
    }
      public String toString() {
        return "Employés{" + "nom=" + nom + ", prénom=" + prénom  + + '}';
    }
}
