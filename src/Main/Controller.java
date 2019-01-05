package Main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;


public class Controller {

    static Player p = new Player();

    @FXML
     TextField Name;

    @FXML
    public void Enter() throws IOException {
        p.setName(Name.getText());
        Parent root = FXMLLoader.load(getClass().getResource("GameView.fxml"));
        Main.MainStage.setScene(new Scene(root));
    }



}
