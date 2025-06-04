package utez.edu.mx.u2_ti_02_interface;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Label label = new Label("Hello World");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 200, 200);
        stage.setTitle("Mi primer app en javafx");
        Image image = new Image(getClass().getResourceAsStream("/iconos/150897750_10507049.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}