package jareed.proyectoventas.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import jareed.proyectoventas.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class InicioSesionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Buttoningresar;

    @FXML
    private TextField ingreseCon;

    @FXML
    private TextField ingreseUs;

    @FXML
    void Buttoningresar(MouseEvent event) {
        HelloApplication.newStage("mostrarropa-view","");
    }

    @FXML
    void ingreseCon(MouseEvent event) {

    }

    @FXML
    void ingreseUs(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert Buttoningresar != null : "fx:id=\"Buttoningresar\" was not injected: check your FXML file 'iniciosesion-view.fxml'.";
        assert ingreseCon != null : "fx:id=\"ingreseCon\" was not injected: check your FXML file 'iniciosesion-view.fxml'.";
        assert ingreseUs != null : "fx:id=\"ingreseUs\" was not injected: check your FXML file 'iniciosesion-view.fxml'.";

    }

}
