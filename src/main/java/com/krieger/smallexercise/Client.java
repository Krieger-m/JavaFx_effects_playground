package com.krieger.smallexercise;

import com.krieger.smallexercise.view.View;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Client extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        new View().showStage(stage);

    }

    public static void main(String[] args) {
        launch();
    }
}