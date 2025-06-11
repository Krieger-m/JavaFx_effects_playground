package com.krieger.smallexercise.view;

import com.krieger.smallexercise.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class View {

    Scene scene;

    private void prepView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("hello-view_GridPane-template.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        this.scene = scene;
    }


    public void showStage(Stage stage) throws IOException{
        prepView();
        stage.setTitle("Hello!");
        stage.setScene(this.scene);
        stage.show();
    }



}
