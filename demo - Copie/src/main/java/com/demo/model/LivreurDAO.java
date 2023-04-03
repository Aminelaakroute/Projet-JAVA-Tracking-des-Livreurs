package com.demo.model;

import java.sql.*;
        import java.util.ArrayList;
        import java.util.List;

public class LivreurDAO extends DatabaseConnection<Livreur1>{
    private Connection conn;

    public LivreurDAO() {


        this.conn = conn;
    }

    // Create
    public void Save(Livreur1 livreur) throws SQLException {
        String sql = "INSERT INTO livreur1 (Livreur_NP, Livreur_Tel) VALUES (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, livreur.getNom());

        pstmt.setString(4, livreur.getTelephone());
        pstmt.executeUpdate();
    }

    // Read
    public List<Livreur1> listerLivreurs() throws SQLException {
        String sql = "SELECT * FROM livreur1";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        List<Livreur1> livreurs = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("Livreur_ID");
            String nom = rs.getString("Livreur_NP");
            String telephone = rs.getString("Livreur_Tel");
            Livreur1 livreur = new Livreur1(id, nom, telephone);
            livreurs.add(livreur);
        }
        return livreurs;
    }

    public Livreur1 trouverLivreurParId(int id) throws SQLException {
        String sql = "SELECT * FROM livreur1 WHERE Livreur_ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            String nom = rs.getString("Livreur_NP");

            String telephone = rs.getString("Livreur_Tel");
            Livreur1 livreur = new Livreur1(id, nom,telephone);
            return livreur;
        } else {
            return null;
        }
    }

    // Update
    public void Update(Livreur1 livreur) throws SQLException {
        String sql = "UPDATE livreur1 SET Livreur_NP = ?, Livreur_Tel = ? WHERE Livreur_ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, livreur.getNom());
        pstmt.setString(2, livreur.getTelephone());
        pstmt.setInt(3, livreur.getId());
        pstmt.executeUpdate();
    }

    @Override
    public void Remove(Livreur1 object) throws SQLException {

    }

    @Override
    public List<Livreur1> getAll() throws SQLException {
        return null;
    }

    @Override
    public Livreur1 getOne(Long Livreur_ID) throws SQLException {
        return null;
    }

    // Delete
    public void Remove(int Livreur_ID) throws SQLException {

    }

    public Livreur1 getById(int id_livreur) {
        return null;
    }
}
