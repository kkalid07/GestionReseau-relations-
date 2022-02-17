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
public class Reseau {
    
    private int idResau;
    private int id_current_user;
    private int idUser;
    
    public Reseau(){}
    
    public Reseau(int idR){
        this.idResau=idR;
    }

    public int getIdResau() {
        return idResau;
    }

    public void setIdResau(int idResau) {
        this.idResau = idResau;
    }

    public int getId_current_user() {
        return id_current_user;
    }

    public void setId_current_user(int id_current_user) {
        this.id_current_user = id_current_user;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Reseau{" + "idResau=" + idResau + ", id_current_user=" + id_current_user + ", idUser=" + idUser + '}';
    }
    
    

    
    
    
    
    
}
