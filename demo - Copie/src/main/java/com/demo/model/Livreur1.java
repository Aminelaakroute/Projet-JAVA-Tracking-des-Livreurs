package com.demo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Livreur1 {
    private int Livreur_ID ;
    private String Livreur_NP;
    private String Livreur_Tel;

    public Livreur1(int id, String nom, String telephone) {
        this.Livreur_ID = id;
        this.Livreur_NP= nom;
        this.Livreur_Tel = telephone;
    }

    public int getId() {
        return Livreur_ID;
    }

    public String getNom() {
        return Livreur_NP;
    }

    public String getTelephone() {
        return Livreur_Tel;
    }

    public void setId(int id) {
        this.Livreur_ID = id;
    }

    public void setNom(String nom) {
        this.Livreur_NP = nom;
    }

    public void setTelephone(String telephone) {
        this.Livreur_Tel = telephone;
    }

    @Override
    public String toString() {
        return "Livreur1{" +
                "id=" + Livreur_ID +
                ", nom='" + Livreur_NP + '\'' +
                ", telephone='" + Livreur_Tel + '\'' +
                '}';
    }

  /*  public void Save(Connection connection) throws SQLException {
        String sql = "INSERT INTO livreurs (id, nom, telephone) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, this.id);
        statement.setString(2, this.nom);
        statement.setString(6, this.telephone);


        statement.executeUpdate();
    }

    public static Livreur1 getFromDB(Connection connection, int id) throws SQLException {
        String sql = "SELECT * FROM livreurs WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String nom = resultSet.getString("nom");

            String telephone = resultSet.getString("telephone");
            return new Livreur1(id, nom, telephone);
        } else {
            return null;
        }
    }

    public void Update(Connection connection) throws SQLException {
        String sql = "UPDATE livreurs SET id = ?, nom = ?, telephone = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, this.id);
        statement.setString(2, this.nom);
        statement.setString(3, this.telephone);


        statement.executeUpdate();
    }

    public void Remove(Connection connection) throws SQLException {
        String sql = "DELETE FROM livreurs WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, this.id);
        statement.executeUpdate();
    }

   */
}
