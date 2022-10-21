package javafx.fromStudent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static Stage listStudent;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        listStudent=primaryStage;
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fromStudent.fxml")));
        primaryStage.setTitle("Information Student");
        primaryStage.setScene(new Scene(root,900,800));
        primaryStage.show();
    }
}