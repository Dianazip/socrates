package com.example.socrates;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Crucigrama3Controller {

    @FXML
    private Label respuesta;

    @FXML
    private TextField respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, respuesta6, respuesta7, respuesta8, respuesta9, respuesta10;

    @FXML
    private Button validar1, validar2, validar3, validar4, validar5, validar6, validar7, validar8, validar9, validar10;

    @FXML
    private Button continuar;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void validar1(ActionEvent event) throws IOException {
        if(respuesta1.getText().equals("telescopio")){
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Correcto!");
            respuesta.setTextFill(Color.GREEN);
            respuesta1.disableProperty().setValue(true);
            validar1.disableProperty().setValue(true);
        }else{
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Error!");
            respuesta.setTextFill(Color.RED);
            respuesta1.setText(null);
        }
        continuar();
    }

    public void validar2(ActionEvent event) throws IOException {
        if(respuesta2.getText().equals("polonia")){
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Correcto!");
            respuesta.setTextFill(Color.GREEN);
            respuesta2.disableProperty().setValue(true);
            validar2.disableProperty().setValue(true);
        }else{
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Error!");
            respuesta.setTextFill(Color.RED);
            respuesta2.setText(null);
        }
        continuar();
    }

    public void validar3(ActionEvent event) throws IOException {
        if(respuesta3.getText().toLowerCase().equals("zagreb")){
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Correcto!");
            respuesta.setTextFill(Color.GREEN);
            respuesta3.disableProperty().setValue(true);
            validar3.disableProperty().setValue(true);
        }else{
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Error!");
            respuesta.setTextFill(Color.RED);
            respuesta3.setText(null);
        }
        continuar();
    }

    public void validar4(ActionEvent event) throws IOException {
        if(respuesta4.getText().toLowerCase().equals("equilatero")){
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Correcto!");
            respuesta.setTextFill(Color.GREEN);
            respuesta4.disableProperty().setValue(true);
            validar4.disableProperty().setValue(true);
        }else{
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Error!");
            respuesta.setTextFill(Color.RED);
            respuesta4.setText(null);
        }
        continuar();
    }

    public void validar5(ActionEvent event) throws IOException {
        if(respuesta5.getText().toLowerCase().equals("copenhague")){
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Correcto!");
            respuesta.setTextFill(Color.GREEN);
            respuesta5.disableProperty().setValue(true);
            validar5.disableProperty().setValue(true);
        }else{
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Error!");
            respuesta.setTextFill(Color.RED);
            respuesta5.setText(null);
        }
        continuar();
    }

    public void validar6(ActionEvent event) throws IOException {
        if(respuesta6.getText().toLowerCase().equals("latin")){
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Correcto!");
            respuesta.setTextFill(Color.GREEN);
            respuesta6.disableProperty().setValue(true);
            validar6.disableProperty().setValue(true);
        }else{
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Error!");
            respuesta.setTextFill(Color.RED);
            respuesta6.setText(null);
        }
        continuar();
    }

    public void validar7(ActionEvent event) throws IOException {
        if(respuesta7.getText().toLowerCase().equals("atmosfera")){
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Correcto!");
            respuesta.setTextFill(Color.GREEN);
            respuesta7.disableProperty().setValue(true);
            validar7.disableProperty().setValue(true);
        }else{
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Error!");
            respuesta.setTextFill(Color.RED);
            respuesta7.setText(null);
        }
        continuar();
    }

    public void validar8(ActionEvent event) throws IOException {
        if(respuesta8.getText().toLowerCase().equals("etiopia")){
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Correcto!");
            respuesta.setTextFill(Color.GREEN);
            respuesta8.disableProperty().setValue(true);
            validar8.disableProperty().setValue(true);
        }else{
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Error!");
            respuesta.setTextFill(Color.RED);
            respuesta8.setText(null);
        }
        continuar();
    }

    public void validar9(ActionEvent event) throws IOException {
        if(respuesta9.getText().toLowerCase().equals("rumania")){
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Correcto!");
            respuesta.setTextFill(Color.GREEN);
            respuesta9.disableProperty().setValue(true);
            validar9.disableProperty().setValue(true);
        }else{
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Error!");
            respuesta.setTextFill(Color.RED);
            respuesta9.setText(null);
        }
        continuar();
    }

    public void validar10(ActionEvent event) throws IOException {
        if(respuesta10.getText().toLowerCase().equals("vaticano")){
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Correcto!");
            respuesta.setTextFill(Color.GREEN);
            respuesta10.disableProperty().setValue(true);
            validar10.disableProperty().setValue(true);
        }else{
            respuesta.visibleProperty().setValue(true);
            respuesta.setText("Error!");
            respuesta.setTextFill(Color.RED);
            respuesta10.setText(null);
        }
        continuar();
    }

    public void continuar() {
        if(validar1.disableProperty().getValue() && validar2.disableProperty().getValue() && validar3.disableProperty().getValue()
                && validar4.disableProperty().getValue() && validar5.disableProperty().getValue() && validar6.disableProperty().getValue()
                && validar7.disableProperty().getValue() && validar8.disableProperty().getValue() && validar9.disableProperty().getValue()
                && validar10.disableProperty().getValue()){
            continuar.disableProperty().setValue(false);
        }
    }

    public void continuarBoton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("ganaste.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("crucigrama3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
