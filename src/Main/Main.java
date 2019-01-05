package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {
    public static Stage MainStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        MainStage =primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("Juste Prix");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Made by BendabizAdam","About",JOptionPane.INFORMATION_MESSAGE);
        launch(args);
    }
}
