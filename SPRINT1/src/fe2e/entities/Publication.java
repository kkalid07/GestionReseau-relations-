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
public class Publication {
    
    public int id_Pub;
    public int id_user;
    public String contenu;
    
    public Publication(){}

    public Publication(int id_user, String contenu) {
        this.id_user = id_user;
        this.contenu = contenu;
    }
    
    
    public Publication(int id_Pub, int id_user, String contenu) {
        this.id_Pub = id_Pub;
        this.id_user = id_user;
        this.contenu = contenu;
    }

    public int getId_Pub() {
        return id_Pub;
    }

    public void setId_Pub(int id_Pub) {
        this.id_Pub = id_Pub;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Publication{" + "id_Pub=" + id_Pub + ", id_user=" + id_user + ", contenu=" + contenu + '}';
    }
    
    
}
