module com.demo {
    requires javafx.controls;
    requires javafx.fxml;

        requires org.controlsfx.controls;
        requires org.kordamp.bootstrapfx.core;

    requires java.sql;

    opens com.demo to javafx.fxml;
   exports com.demo;
     exports com.demo.model;
    opens com.demo.model to javafx.fxml;


}