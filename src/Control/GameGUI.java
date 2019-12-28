package Control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/Minesweeper.fxml"));

        primaryStage.setTitle("Minesweeper");
        primaryStage.setScene(new Scene(root, 290, 310));

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
