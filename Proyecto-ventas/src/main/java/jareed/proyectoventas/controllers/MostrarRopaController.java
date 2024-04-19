package jareed.proyectoventas.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import jareed.proyectoventas.HelloApplication;
import jareed.proyectoventas.models.Administrador;
import jareed.proyectoventas.models.Productos;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MostrarRopaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Buttonarticulo;

    @FXML
    private Button Buttonsalir;

    @FXML
    private Button buttonA;

    @FXML
    void Buttonarticulo(MouseEvent event) {
        Administrador admin = HelloApplication.getAdmin();
        for (Productos productos : admin.getListProduc()){

        }
    }

    @FXML
    void Buttonsalir(MouseEvent event) {

    }

    @FXML
    void botonArt(MouseEvent event) {
        HelloApplication.newStage("seccion-view","");
    }

    @FXML
    void initialize() {

    }

}
