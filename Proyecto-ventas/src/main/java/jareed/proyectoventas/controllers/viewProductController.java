package jareed.proyectoventas.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import jareed.proyectoventas.HelloApplication;
import jareed.proyectoventas.models.Administrador;
import jareed.proyectoventas.models.Productos;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class viewProductController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonSee;

    @FXML
    private ListView<String> listProduct;

    @FXML
    void onbttonSee(MouseEvent event) {
        Administrador admin = HelloApplication.getAdmin();
        for (Productos productos : admin.getListProduc()){
            listProduct.getItems().add(productos.toString());
        }
    }

    @FXML
    void initialize() {
    }

}
