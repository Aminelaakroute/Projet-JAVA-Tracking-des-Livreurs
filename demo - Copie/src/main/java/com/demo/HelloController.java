package com.demo;

import com.demo.model.Livreur1;
import com.demo.model.LivreurDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloController implements Initializable {







        @FXML
        private VBox Page2;



        @FXML
        private Button Save;

        @FXML
        private Button TableauDeBoard;

        @FXML
        private Button Update;

        @FXML
        private TableColumn<?, ?> col_id;

        @FXML
        private TableColumn<?, ?> col_nom;

        @FXML
        private TableColumn<?, ?> col_tele;

        @FXML
        private TableView<?> mytable;

        @FXML
        private TextField nom;

        @FXML
        private Button Remove;

        @FXML
        private TextField tele;

        @FXML
        protected void onSaveButtonClick() {

                // accees a la bdd

                try {
                        LivreurDAO livreurDAO = new LivreurDAO();

                        Livreur1 liv = new Livreur1(0 , nom.getText() , tele.getText());

                        livreurDAO.Save(liv);


                      Update();




                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }


        }
        protected void onUpdateClick(Livreur1 livreur) throws SQLException {

                // accees a la bdd
                String sql = "UPDATE livreur1 SET Livreur_NP = ?, Livreur_Tel = ? WHERE Livreur_ID = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, livreur.getNom());
                pstmt.setString(2, livreur.getTelephone());
                pstmt.setInt(3, livreur.getId());
                pstmt.executeUpdate();

        }
        
        
                protected void onRemoveClick(int Livreur_ID) throws SQLException {
                        String sql = "DELETE FROM livreur1 WHERE Livreur_ID = ?";
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        pstmt.setInt(1, Livreur_ID);
                        pstmt.executeUpdate();
                    }

        


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
   //  Update();
    }
}