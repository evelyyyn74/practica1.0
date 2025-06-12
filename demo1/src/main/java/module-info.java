module utez.edu.mx.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens utez.edu.mx.demo1 to javafx.fxml;
    exports utez.edu.mx.demo1;
}