package com.krieger.smallexercise.model;

import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;

import java.util.HashMap;
import java.util.Map;

public class Model {

    // Define colors and stops for the linear gradient
    public static Color c1 = new Color(0.5799220204353333, 0.7561728358268738, 0.9210526347160339, 1.0);
    public static Stop s1 = new Stop(0.0,c1);

    public static Color c2 = c1;
    public static Stop s2 = new Stop(0.35570469798657717,c2);

    public static Color c3 = new Color(0.8932098746299744, 1.0, 0.19907407462596893, 1.0);
    public static Stop s3 = new Stop( 1.0, c3);

    // Define a map to hold the linear gradients
    public static Map<String, LinearGradient> gradientList = new HashMap<String,LinearGradient>(Map.of(
            "lGradient1-fill" , new LinearGradient(
                    1, 1, // startX, startY (relative to object bounds)
                    1, 1, // endX, endY (relative to object bounds)
                    true, // proportional
                    null, // cycleMethod (default: NO_CYCLE)
                    new Stop(0.0, c1),
                    new Stop(0.35570469798657717, c2),
                    new Stop(1.0, c3)
            ),
            "lGradient2" , new LinearGradient(
                    1, 1, // startX, startY (relative to object bounds)
                    0, 0, // endX, endY (relative to object bounds)
                    true, // proportional
                    null, // cycleMethod (default: NO_CYCLE)
                    new Stop(0.0, c1),
                    new Stop(0.35570469798657717, c2),
                    new Stop(1.0, c3)
            ),
            "lGradient-test" , new LinearGradient(
                    0, 0, // startX, startY (relative to object bounds)
                    1, 1, // endX, endY (relative to object bounds)
                    true, // proportional
                    null, // cycleMethod (default: NO_CYCLE)
                    new Stop(0.0, c1),
                    new Stop(0.55570469798657717, c2),
                    new Stop(1.0, c3)
            ),
            "defaultGradient" , new LinearGradient(
                    0, 0, // startX, startY (relative to object bounds)
                    1, 1, // endX, endY (relative to object bounds)
                    true, // proportional
                    null, // cycleMethod (default: NO_CYCLE)

                    s1,
                    s2,
                    s3
            )

    ));

}
