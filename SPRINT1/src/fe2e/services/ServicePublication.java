/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fe2e.services;

import fe2e.entities.Personne;
import fe2e.entities.Publication;
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
public class ServicePublication {
    
    public void ajouterPublication(Publication p){
        
        try {
            String requete2="insert into publication (Id_user,Contenu)"+"values(?,?)";
            PreparedStatement pst= new MyConnection().getCnx().prepareStatement(requete2);
            //pst.setInt(1,p.getId_Pub());
            pst.setInt(1, p.getId_user());
            pst.setString(2, p.getContenu());
            pst.executeUpdate();
            System.out.println("votre publication crée avec succées");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public List<Publication> afficherPublication(){
        List<Publication> lpubs= new ArrayList<>();
        try {
            String requete3="select Contenu from publication where Id_user=2";
            Statement st= new MyConnection().getCnx().createStatement();
            ResultSet rs=st.executeQuery(requete3);
            while(rs.next()){
                Publication pub = new Publication();
                pub.setContenu(rs.getString("Contenu"));
                lpubs.add(pub);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return lpubs;
    }
    
    public void modifierPublication(){
        try {
            String requete4="update  publication set Contenu ='tres jolie ' where Id_Pub=3 and Id_user =2";
            Statement st= new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete4);
            System.out.println("Votre publication modifiée avec succès");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
     public void supprimerPublication(){
        try {
            String requete5="delete from Publication where Id_Pub=1";
            Statement st= new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete5);
            System.out.println("Publication est supprimée");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
