package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.concurrent.ThreadLocalRandom;

public class Page01 {

    @FXML
    public Button agreeBtn;

    @FXML
    public Button disagreeBtn;

    @FXML
    public Label msg;

    //给按钮加点击事件
    @FXML//方法和fxml文件关联
    protected void agree() {
        //System.out.println("Hi "+username.getText());
        msg.setOpacity(1);
    }

    //给按钮加点击事件
    @FXML//方法和fxml文件关联
    protected void disagree() {
        //System.out.println("Hi "+username.getText());
        int x=ThreadLocalRandom.current().nextInt(300);
        int y=ThreadLocalRandom.current().nextInt(200);
        disagreeBtn.setLayoutX(x);

        disagreeBtn.setLayoutY(y);
    }

}

