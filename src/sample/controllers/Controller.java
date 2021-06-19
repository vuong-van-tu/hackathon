package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button bt_all;
    @FXML
    Button bt_news;
    @FXML
    Button bt_support;
    @FXML
    Button bt_aboutus;
    @FXML
    Button bt_feedback;
    @FXML
    Pane p_all;
    @FXML
    Pane p_new;
    @FXML
    Pane p_support;
    @FXML
    Pane p_aboutus;
    @FXML
    Pane p_feedback;




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void handleButtonAction(ActionEvent event) {
        if (event.getSource()==bt_all){
            p_all.toFront();

        }
        else
        if (event.getSource()==bt_news){
            p_new.toFront();

        }
        else
        if (event.getSource()==bt_support){
            p_support.toFront();

        }
        else
        if (event.getSource()==bt_aboutus){
            p_aboutus.toFront();

        }
        else
        if (event.getSource()==bt_feedback){
            p_feedback.toFront();

        }
    }
}
