package com.demo.model;

public class Commande {
    private Integer id_commande;
    private String numero;
    private String date;
    // Many  to one
    private Livreur1 livreur ;





    public Livreur1 getLivreur() {
        return livreur;
    }
    public void setClient(Livreur1 livreur) {
        this.livreur = livreur;
    }
    public Commande() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Commande(Integer id_commande, String numero, String date , Livreur1 livreur) {
        super();
        this.id_commande = id_commande;
        this.numero = numero;
        this.date = date;
        this.livreur = livreur ;
    }
    public Integer getId_commande() {
        return id_commande;
    }
    public void setId_commande(Integer id_commande) {
        this.id_commande = id_commande;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Commande [id_commande=" + id_commande + ", numero=" + numero + ", date=" + date + ", livreur=" + livreur
                + "]";
    }
}
