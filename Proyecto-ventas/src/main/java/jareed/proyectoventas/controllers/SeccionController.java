package jareed.proyectoventas.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import jareed.proyectoventas.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class SeccionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Buttoncamisas;

    @FXML
    private Button Buttonpantalon;

    @FXML
    private Button bttonProduc;

    @FXML
    void Buttoncamisas(MouseEvent event) {
        HelloApplication.newStage("camisas-view","");
    }

    @FXML
    void Buttonpantalon(MouseEvent event) {
        HelloApplication.newStage("pantalones-view","");
    }

    @FXML
    void bttonVerProduct(MouseEvent event) {
        HelloApplication.newStage("viewProduc-view","");
    }

    @FXML
    void initialize() {
        assert Buttoncamisas != null : "fx:id=\"Buttoncamisas\" was not injected: check your FXML file 'seccion-view.fxml'.";
        assert Buttonpantalon != null : "fx:id=\"Buttonpantalon\" was not injected: check your FXML file 'seccion-view.fxml'.";
        assert bttonProduc != null : "fx:id=\"bttonProduc\" was not injected: check your FXML file 'seccion-view.fxml'.";

    }

    public void onButtonProduct(MouseEvent mouseEvent) {
    }
}
