package com.demo.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

    public class CommandeDAO {

        private Connection connection;

        public CommandeDAO() {
            connection = DatabaseConnection.getInstance().getConnection();
        }
        public List<Commande> getAll() throws SQLException {
            List<Commande> commandes = new ArrayList<>();
            String query = "SELECT * FROM commande";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id_commande = resultSet.getInt("id_commande");
                String numero = resultSet.getString("numero");
                String date = resultSet.getString("date");
                int id_livreur = resultSet.getInt("id_livreur");
                LivreurDAO livreurDAO = new LivreurDAO(connection);
                Livreur1 livreur = livreurDAO.getById(id_livreur);
                Commande commande = new Commande(id_commande, numero, date, livreur);
                commandes.add(commande);
            }
            return commandes;
        }
    
        public Commande getById(int id_commande) throws SQLException {
            String query = "SELECT * FROM commande WHERE id_commande = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id_commande);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String numero = resultSet.getString("numero");
                String date = resultSet.getString("date");
                int id_livreur = resultSet.getInt("id_livreur");
                LivreurDAO livreurDAO = new LivreurDAO(connection);
                Livreur1 livreur = livreurDAO.getById(id_livreur);
                Commande commande = new Commande(id_commande, numero, date, livreur);
                return commande;
            }
            return null;
        }



    }


