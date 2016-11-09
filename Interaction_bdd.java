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

public class Interaction_bdd {
    
    Connection connexion = null;    // variable pour la connexion à la bdd
    Statement st = null;            // Déclaration d'un statement pour faire une requête sql
    ResultSet rs = null;            // Déclaration d'un resultSet pour lire dans la bdd
    
    // on va lire l'element a dans la table b
    public void lecture (String element, String table) throws SQLException {
    
        connexion_bdd();
        
try {
    /* Création de l'objet gérant les requêtes */

/* Exécution d'une requête de lecture */
String sql = "SELECT " + element + " FROM ROOT." + table;
rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getString(element));
        }
// Requête de lecture //
        
}  catch ( SQLException e ) {
    System.out.println("erreur requête :");
    System.out.println(e);
    
} finally {
    if ( connexion != null )
        try {
            System.out.println("connexion null");
            /* Fermeture de la connexion */
            connexion.close();
        } catch ( SQLException ignore ) {
            /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
        }
}

    }   
    



    
    
    
    
    
    
    public void connexion_bdd() throws SQLException  {  //throws SQLException
        
        /* Chargement du driver JDBC pour MySQL */
try {
    Class.forName( "com.derby.jdbc.Driver" );
} catch ( ClassNotFoundException e ) {
    /* Gérer les éventuelles erreurs ici. */
}

        /* Connexion à la base de données */
String url = "jdbc:derby://localhost:1527/test";
String utilisateur = "root";
String motDePasse = "root";
connexion = null;
try {
    connexion = DriverManager.getConnection( url, utilisateur, motDePasse);

} catch ( SQLException e ) {
    System.out.println(e);
    /* Gérer les éventuelles erreurs ici */ }

st = connexion.createStatement();
rs = null;
    }
    
}
