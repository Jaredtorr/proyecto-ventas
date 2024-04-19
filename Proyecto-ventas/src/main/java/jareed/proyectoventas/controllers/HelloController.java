package jareed.proyectoventas.controllers;
import java.net.URL;
import java.util.ResourceBundle;

import jareed.proyectoventas.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button botonadministrador;

    @FXML
    private Button botonentrrar;

    @FXML
    private Button botonusuario;

    public static void init(Stage stageRoot) {
    }

    @FXML
    void botonadministrador(MouseEvent event) {
      HelloApplication.newStage("iniciosesion-view","");
    }

    @FXML
    void botonentrar(MouseEvent event) {
HelloApplication.newStage("iniciosesion-view","");
    }



    @FXML
    void initialize() {
        assert botonadministrador != null : "fx:id=\"botonadministrador\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert botonentrrar != null : "fx:id=\"botonentrrar\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert botonusuario != null : "fx:id=\"botonusuario\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
