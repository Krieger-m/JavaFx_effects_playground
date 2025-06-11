module com.krieger.smallexercise {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.krieger.smallexercise to javafx.fxml;
    exports com.krieger.smallexercise;
    exports com.krieger.smallexercise.ctrl;
    opens com.krieger.smallexercise.ctrl to javafx.fxml;
}