package com.krieger.smallexercise.ctrl;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;

public class Controller {

        // Define the LinearGradient once
    LinearGradient linearGradient1 = new LinearGradient(
            1, 1, // startX, startY (relative to object bounds)
            1, 1, // endX, endY (relative to object bounds)
            true, // proportional
            null, // cycleMethod (default: NO_CYCLE)
            new Stop(0.0,
                    new Color(
                            0.5799220204353333,
                            0.7561728358268738,
                            0.9210526347160339,
                            1.0)
            ),
            new Stop(0.35570469798657717,
                    new Color(
                            0.5799220204353333,
                            0.7561728358268738,
                            0.9210526347160339,
                            1.0)
            ),
            new Stop(1.0,
                    new Color(
                            0.8932098746299744,
                            1.0,
                            0.19907407462596893,
                            1.0)
            )
    );

    LinearGradient linearGradient2 = new LinearGradient(
            1, 1, // startX, startY (relative to object bounds)
            0, 0, // endX, endY (relative to object bounds)
            true, // proportional
            null, // cycleMethod (default: NO_CYCLE)
            new Stop(0.0,
                    new Color(
                            0.5799220204353333,
                            0.7561728358268738,
                            0.9210526347160339,
                            1.0
                    )
            ),
            new Stop(0.35570469798657717,
                    new Color(
                            0.5799220204353333,
                            0.7561728358268738,
                            0.9210526347160339,
                            1.0
                    )
            ),
            new Stop(1.0,
                    new Color(
                            0.8932098746299744,
                            1.0,
                            0.19907407462596893,
                            1.0
                    )
            )
    );
    Color c1 = new Color(
            0.5799220204353333,
            0.7561728358268738,
            0.9210526347160339,
            1.0);

    Stop s1 = new Stop(
            0.0,c1);

    Color c2 = new Color(
            0.5799220204353333,
            0.7561728358268738,
            0.9210526347160339,
            1.0);

    Stop s2 = new Stop(
            0.35570469798657717,c2);

    Color c3 = new Color(0.8932098746299744,
            1.0, 0.19907407462596893,
            1.0);

    Stop s3 = new Stop( 1.0, c3);




    LinearGradient standardGradient = new LinearGradient(
            0, 0, // startX, startY (relative to object bounds)
            1, 1, // endX, endY (relative to object bounds)
            true, // proportional
            null, // cycleMethod (default: NO_CYCLE)

            s1,
            s2,
            s3
    );


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
                    rect.setFill(linearGradient2);
                });
                rect.setOnMouseExited((e) -> {
                    rect.setFill(linearGradient1);
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
                    rect.setFill(standardGradient);
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
                    rect.setFill(standardGradient);
                }
            }
        });
    }


}