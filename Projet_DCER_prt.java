/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_dcer_prt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author jeremie
 */
public class Projet_DCER_prt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        JFrame fenetre = new acceuil();
        fenetre.setVisible(true);
        //Définit un titre pour notre fenêtre
        fenetre.setTitle("Menu Principal");
        //Nous demandons maintenant à notre objet de se positionner au centre
        fenetre.setLocationRelativeTo(null);
        //Termine le processus lorsqu'on clique sur la croix rouge
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
        
        
        /*Interaction_bdd interact1 = new Interaction_bdd();
        String element = "matricule";
        String table = "employe" ;
        interact1.lecture(element,table);  // on va lire le matricule des employé dans la table employe
        
        element = "mdp";
        interact1.lecture(element,table);  // on va lire le matricule des employé dans la table employe
      
        */
        
    }

   
    
}
