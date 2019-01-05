package Main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {

    Products p1= new Products(50,new Image("/img/Cup.jpeg"));
    Products p2= new Products(125,new Image("/img/toothbrush.png"));
    Products p3= new Products(1350,new Image("/img/cap.jpg"));
    Products p4= new Products(4200,new Image("/img/watch.png"));
    Products p5= new Products(25500,new Image("/img/phone.jpg"));


    Products[] Prdcts = {p1,p2,p3,p4,p5};
    @FXML
    Button Restart = new Button();
    @FXML
    Label NameLab,MoneyLab,Screen,TriesLab;
    @FXML
    TextField GuessInput;
    @FXML
    ImageView ProductScreen;
    private int i=0;
    @FXML
    public void EnterGuess(){
        if(Controller.p.getTries()!=10) {
            try {
                if (Prdcts[i].getPrice() > Integer.parseInt(GuessInput.getText())) {
                    Screen.setText("It's More !");
                    Controller.p.setTries(Controller.p.getTries()+1);
                    TriesLab.setText("Tries :"+Controller.p.getTries());
                } else {
                    if (Prdcts[i].getPrice() < Integer.parseInt(GuessInput.getText())) {
                        Screen.setText("It's Less !");
                        Controller.p.setTries(Controller.p.getTries()+1);
                        TriesLab.setText("Tries :"+Controller.p.getTries());
                    } else {
                        Controller.p.setMoney(Controller.p.getMoney()+Prdcts[i].getPrice());
                        MoneyLab.setText("Credit" +Controller.p.getMoney()+"$");
                        Screen.setText("Bingo !");
                        i++;
                        ProductScreen.setImage(Prdcts[i].getImg());
                    }
                }
            } catch (NumberFormatException e) {
                Screen.setText("Write\nNumbers\nOnly");
            }catch(ArrayIndexOutOfBoundsException x){
                Screen.setText("You Won !");
                Restart.setVisible(true);
            }
        }else{
            Screen.setText("Good Luck\nnext Time :)");
            Restart.setVisible(true);

        }
        GuessInput.setText("");
    }
    public void Restart()throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Main.MainStage.setScene(new Scene(root));
        Controller.p = new Player();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        NameLab.setText(Controller.p.getName());
        ProductScreen.setImage(p1.getImg());
    }


}
