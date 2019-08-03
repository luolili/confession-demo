package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.net.URISyntaxException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("page01.fxml"));
        primaryStage.setTitle("I Love U");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) throws URISyntaxException {

        String path = Main.class.getResource("pdd.mp3").toURI().toString();

        Media media = new Media(path);//媒体
        MediaPlayer player = new MediaPlayer(media);//媒体播放器
        player.play();//播放
        launch(args);
    }
}
