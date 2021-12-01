package com.example.socrates;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(HelloApplication.class.getResource("intentoNuevo.fxml"));
        stage.setTitle("Start");
        stage.setScene(new Scene(fxmlLoader));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}