package com.krieger.smallexercise.ctrl;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import com.krieger.smallexercise.model.*;

public class Controller {








    @FXML
    private HBox btnContainer;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private GridPane grid_pane;

    @FXML
    private VBox main_container;

    @FXML
    private SplitMenuButton splitMenuButton;

    @FXML
    private ToggleButton toggleButton;

    @FXML
    void setHoverAction_grid_column(MouseEvent event) {}


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }




    @FXML
    public void setHover(){

        for(Node n : grid_pane.getChildren()) {
            if (n instanceof Rectangle) {
                Rectangle rect = (Rectangle) n;
                rect.setOnMouseEntered((e) -> {
                    rect.setFill(Model.gradientList.get("lGradient-test"));
                });
                rect.setOnMouseExited((e) -> {
                    rect.setFill(Model.gradientList.get("defaultGradient"));
                });
            }
        }
    }

    @FXML
    public void resetColors() {
        button1.setOnMouseClicked((e)->{

            for(Node n : grid_pane.getChildren()) {
                if (n instanceof Rectangle) {
                    Rectangle rect = (Rectangle) n;
                    rect.setFill(Model.gradientList.get("defaultGradient"));
                }
            }
        });
    }


    @FXML
    public void shiftColors() {
        button1.setOnMouseClicked((e)->{

            for(Node n : grid_pane.getChildren()) {
                if (n instanceof Rectangle) {
                    Rectangle rect = (Rectangle) n;
                    rect.setFill(Model.gradientList.get("defaultGradient"));
                }
            }
        });
    }


}