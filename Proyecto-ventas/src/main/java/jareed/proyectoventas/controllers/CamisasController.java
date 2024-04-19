package jareed.proyectoventas.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import jareed.proyectoventas.HelloApplication;
import jareed.proyectoventas.models.Camisas;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CamisasController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Buttonagregar;

    @FXML
    private Button Buttonsalir;

    @FXML
    private TextField TextFieldcantidad;

    @FXML
    private TextField TextFieldcolor;

    @FXML
    private TextField TextFieldtalla;

    @FXML
    private TextField texFieldTela;

    @FXML
    void Buttonagregar(MouseEvent event) {
        int catidad = Integer.parseInt(TextFieldcantidad.getText());
        String color = TextFieldcolor.getText();
        int talla = Integer.parseInt(TextFieldtalla.getText());
        String tela= texFieldTela.getText();

        Camisas camisas = new Camisas(catidad,color,talla,tela);
        HelloApplication.getAdmin().addProdc(camisas);
    }

    @FXML
    void Buttonsalir(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }

}
