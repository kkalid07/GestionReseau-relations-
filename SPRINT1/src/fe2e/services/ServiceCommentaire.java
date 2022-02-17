/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fe2e.services;

import fe2e.entities.Commentaire;
import fe2e.entities.Personne;
import fe2e.utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khale
 */
public class ServiceCommentaire {
    
    public void ajouterCommentaire(Commentaire c){
        
        try {
            String requete2="insert into commentaire (Id_pub,id_commentor_user ,contenu)"+"values(?,?,?)";
            PreparedStatement pst= new MyConnection().getCnx().prepareStatement(requete2);
            pst.setInt(1,c.getId_pub());
            pst.setInt(2,c.getId_commentor_user());
            pst.setString(3,c.getContenu());
            pst.executeUpdate();
            System.out.println("Votre commentaire sur la publication ajoutée avec succées");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public List<Commentaire> afficherCommentairesParPublication(){
        List<Commentaire> lcoms= new ArrayList<>();
        try {
            String requete3="select * from commentaire where Id_pub=2 ";
            Statement st= new MyConnection().getCnx().createStatement();
            ResultSet rs=st.executeQuery(requete3);
            while(rs.next()){
                Commentaire c = new Commentaire();
                c.setId_commentaire(rs.getInt(1));
                c.setId_pub(rs.getInt("Id_pub"));
                c.setId_commentor_user(rs.getInt("id_commentor_user"));
                c.setContenu(rs.getString("contenu"));
                lcoms.add(c);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return lcoms;
    }
    
    public void modifierCommentaire(){
        try {
            String requete4="update  commentaire set contenu ='mauvais choix' where Id_comm =2 and Id_pub=2 and id_commentor_user=3";
            Statement st= new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete4);
            System.out.println("Commentaire modifiée avec succès");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void retirerCommentaire(){
        try {
            String requete5="delete from commentaire where id_commentor_user=3 and Id_comm=2";
            Statement st= new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete5);
            System.out.println("Votre commentaire est bien retirée");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void retirerCommentaireParUtilisateur(){
        try {
            String requete5="delete from commentaire where id_commentor_user=3 ";
            Statement st= new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete5);
            System.out.println("Vos commentaires sur la publication sont bien retirées ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    
    
}
