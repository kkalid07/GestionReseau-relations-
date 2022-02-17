/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fe2e.tests;

import fe2e.entities.Commentaire;
import fe2e.entities.Personne;
import fe2e.entities.Publication;
import fe2e.services.ServiceCommentaire;
import fe2e.services.ServicePersonne;
import fe2e.services.ServicePublication;
import fe2e.services.ServiceReseau;
import fe2e.utils.MyConnection;

/**
 *
 * @author khale
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyConnection mc = new MyConnection();
        //ServicePersonne sp= new ServicePersonne();
        //sp.ajouterPersonne();
       // Personne p=new Personne(2,"khalfaoui","khaled");
        //sp.ajouterPersonne2(p);
        //System.out.println(sp.afficherPersonnes());
        //sp.modifierPersonne();
        //sp.supprimerPersonne();
        
        
        //test reseau
        ServiceReseau sr=new ServiceReseau();
        //sr.ajouterAmi();
        //System.out.println(sr.parcourirMonReseau());
        //sr.supprimerAmi();
        
        
        //test publication
        Publication pub=new Publication(2,"hhhhhh 3ak3ak 7ella m3ak");
        ServicePublication spub=new ServicePublication();
        //spub.ajouterPublication(pub);
        //System.out.println(spub.afficherPublication());
        //spub.modifierPublication();
        //spub.supprimerPublication();
        
        
        //test commentaire 
        Commentaire com1=new Commentaire(2,3,"das ist sehr gut ");
        Commentaire com2=new Commentaire(2,1,"that's nice");
        ServiceCommentaire scom= new ServiceCommentaire();
        //scom.ajouterCommentaire(com1);
        //scom.ajouterCommentaire(com2);
        //System.out.println(scom.afficherCommentairesParPublication());
        //scom.modifierCommentaire();
        //scom.retirerCommentaire();
        scom.retirerCommentaireParUtilisateur();
    }
    
}
