/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fe2e.entities;

/**
 *
 * @author khale
 */
public class Commentaire {
    
    public int id_commentaire;
    public int id_pub;
    public int id_commentor_user;
    public String contenu;
    
    public Commentaire(){}

    public Commentaire(int id_pub, int id_commentor_user, String contenu) {
        this.id_pub = id_pub;
        this.id_commentor_user = id_commentor_user;
        this.contenu = contenu;
    }

    public Commentaire(int id_commentaire, int id_pub, int id_commentor_user, String contenu) {
        this.id_commentaire = id_commentaire;
        this.id_pub = id_pub;
        this.id_commentor_user = id_commentor_user;
        this.contenu = contenu;
    }

    public int getId_commentaire() {
        return id_commentaire;
    }

    public void setId_commentaire(int id_commentaire) {
        this.id_commentaire = id_commentaire;
    }

    public int getId_pub() {
        return id_pub;
    }

    public void setId_pub(int id_pub) {
        this.id_pub = id_pub;
    }

    public int getId_commentor_user() {
        return id_commentor_user;
    }

    public void setId_commentor_user(int id_commentor_user) {
        this.id_commentor_user = id_commentor_user;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "publicaion=" + id_pub + ", id_commentor_user=" + id_commentor_user + ", commentaire=" + contenu + '}';
    }

    
    
    
    
}
