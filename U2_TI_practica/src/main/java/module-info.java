module utez.edu.mx.u2_ti_practica {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens utez.edu.mx.u2_ti_practica to javafx.fxml;
    exports utez.edu.mx.u2_ti_practica;
}