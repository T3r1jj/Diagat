package io.github.t3r1jj.diagat.gui;

import io.github.t3r1jj.diagat.logic.Logic;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GUI extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX on JDK 11");

        Label label = new Label(new Logic().getLogic());
        Scene scene = new Scene(label, 200, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}