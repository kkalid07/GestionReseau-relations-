/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fe2e.services;

import fe2e.entities.Personne;
import fe2e.entities.Reseau;
import fe2e.utils.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khale
 */
public class ServiceReseau {
    
    public void ajouterAmi(){
        try {
            String requete="insert into reseau (Id_reseau,id_current_user,Id_user)"+"values (1,1,2)";
            Statement st= new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete);
            System.out.println("Ami ajoutée avec succées");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public List<Reseau> parcourirMonReseau(){
        List<Reseau> lamis= new ArrayList<>();
        try {
            String requete3="select * from reseau where id_current_user=1";
            Statement st= new MyConnection().getCnx().createStatement();
            ResultSet rs=st.executeQuery(requete3);
            while(rs.next()){
                Reseau r = new Reseau();
                r.setIdResau(rs.getInt(1));
                r.setId_current_user(rs.getInt(2));
                r.setIdUser(rs.getInt(3));
                lamis.add(r);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return lamis;
    }
    
    public void supprimerAmi(){
        try {
            String requete5="delete from reseau where id_current_user=1 and Id_user=2";
            Statement st= new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete5);
            System.out.println("votre ami est retiré de votre reseau");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    
    
}
