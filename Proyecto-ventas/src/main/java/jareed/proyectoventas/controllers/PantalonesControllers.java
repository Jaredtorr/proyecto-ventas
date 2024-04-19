
package jareed.proyectoventas.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import jareed.proyectoventas.HelloApplication;
import jareed.proyectoventas.models.Administrador;
import jareed.proyectoventas.models.Pantalones;
import jareed.proyectoventas.models.Productos;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PantalonesControllers {

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
    private TextField textTipo;

    @FXML
    void Buttonagregar(MouseEvent event) {
        int catidad = Integer.parseInt(TextFieldcantidad.getText());
        String color = TextFieldcolor.getText();
        int talla = Integer.parseInt(TextFieldtalla.getText());
        String tipo= textTipo.getText();

        Pantalones pantalones = new Pantalones(catidad,color,talla,tipo);
        HelloApplication.getAdmin().addProdc(pantalones);

    }

    @FXML
    void Buttons(MouseEvent event) {

    }

    @FXML
    void TextFieldcantidad(MouseEvent event) {

    }

    @FXML
    void TextFieldcolor(MouseEvent event) {

    }

    @FXML
    void TextFieldtalla(MouseEvent event) {

    }

    @FXML
    void initialize() {


    }

}
