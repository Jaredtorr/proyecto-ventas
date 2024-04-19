module jareed.proyectoventas {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.attach.display;


    opens jareed.proyectoventas to javafx.fxml;
    exports jareed.proyectoventas;
    exports jareed.proyectoventas.controllers;
    opens jareed.proyectoventas.controllers to javafx.fxml;
}