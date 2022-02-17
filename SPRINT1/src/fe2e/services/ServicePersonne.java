/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fe2e.services;

import fe2e.entities.Personne;
import fe2e.utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khale
 */
public class ServicePersonne {
    
    public void ajouterPersonne(){
        try {
            String requete="insert into personne (id,nom,prenom)"+"values (1,'kalboussi','Ahmed')";
            Statement st= new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete);
            System.out.println("Personne ajoutée avec succées");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void ajouterPersonne2(Personne p){
        
        try {
            String requete2="insert into Personne (id,nom,prenom)"+"values(?,?,?)";
            PreparedStatement pst= new MyConnection().getCnx().prepareStatement(requete2);
            pst.setInt(1,p.getId());
            pst.setString(2, p.getNom());
            pst.setString(3, p.getPrenom());
            pst.executeUpdate();
            System.out.println("Personne ajoutée avec succées");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public List<Personne> afficherPersonnes(){
        List<Personne> lp= new ArrayList<>();
        try {
            String requete3="select * from personne";
            Statement st= new MyConnection().getCnx().createStatement();
            ResultSet rs=st.executeQuery(requete3);
            while(rs.next()){
                Personne p = new Personne();
                p.setId(rs.getInt(1));
                p.setNom(rs.getString("nom"));
                p.setPrenom(rs.getString("prenom"));
                lp.add(p);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return lp;
    }
    
    public void modifierPersonne(){
        try {
            String requete4="update  personne set prenom ='jalel' where id=2";
            Statement st= new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete4);
            System.out.println("Personne modifiée avec succès");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void supprimerPersonne(){
        try {
            String requete5="delete from Personne where id=1";
            Statement st= new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete5);
            System.out.println("Personne est supprimée");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
